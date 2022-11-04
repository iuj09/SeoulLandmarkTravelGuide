package com.example.userservice.service;

import com.example.userservice.dto.UserRequestDTO;
import com.example.userservice.entity.User;
import com.example.userservice.repository.UserRepository;
import com.example.userservice.jwt.JwtTokenProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.concurrent.TimeUnit;


@Slf4j
@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtTokenProvider jwtTokenProvider;
    private final AuthenticationManagerBuilder authenticationManagerBuilder;
    private final RedisTemplate redisTemplate;

//    @Getter
//    @Builder
//    private static class Body {
//
//        private int state;
//        private String result;
//        private String message;
//        private Object data;
//        private Object error;
//    }

//    public ResponseEntity<?> success(String msg, HttpStatus status) {
//        Body body = Body.builder()
//                .state(status.value())
//                .result("success")
//                .message(msg)
//                .error(Collections.emptyList())
//                .build();
//        return ResponseEntity.ok(body);
//    }
//
//    public ResponseEntity<?> success(String msg) {
//        return success(msg, HttpStatus.OK);
//    }
//
//    public ResponseEntity<?> fail(Object data, String msg, HttpStatus status) {
//        Body body = Body.builder()
//                .state(status.value())
//                .data(data)
//                .result("fail")
//                .message(msg)
//                .error(Collections.emptyList())
//                .build();
//        return ResponseEntity.ok(body);
//    }
//
//    public ResponseEntity<?> fail(String msg, HttpStatus status) {
//        return fail(Collections.emptyList(), msg, status);
//    }


//    public ResponseEntity<?> invalidFields(LinkedList<LinkedHashMap<String, String>> errors) {
//        Body body = Body.builder()
//                .state(HttpStatus.BAD_REQUEST.value())
//                .data(Collections.emptyList())
//                .result("fail")
//                .message("")
//                .error(errors)
//                .build();
//        return ResponseEntity.ok(body);
//    }

    @Transactional
    public ResponseEntity<?> signUp(UserRequestDTO.Signup signup) {
        if (userRepository.existsByEmail(signup.getEmail())) {
            return ResponseEntity.badRequest().body("이미 가입된 회원입니다.");
        }

        User user = User.builder()
                .email(signup.getEmail())
                .password(passwordEncoder.encode(signup.getPassword()))
                .roles(Collections.singletonList("ROLE_USER"))
                .build();
        userRepository.save(user);

        return ResponseEntity.ok().body("회원가입이 완료되었습니다.");
    }

    @Transactional
    public ResponseEntity<?> login(UserRequestDTO.Login login,HttpServletResponse response) {
                            // optional null point
        if (userRepository.findByEmail(login.getEmail()).orElse(null) == null) {
            return ResponseEntity.badRequest().body("가입되지 않은 email 입니다.");
        }

        // 1. login ID/PW 를 기반으로 Authentication 객체 생성
        // 이 때 authentication 은 인증 여부를 확인하는 authenticated 값이 false
        UsernamePasswordAuthenticationToken authenticationToken = login.toAuthentication();

        // 2. 실제 검증 (사용자 비밀번호 체크)이 이루어지는 부분
        // authenticate method 가 실행될 때 CustomUserDetailsService 에서 만든 loadUserByUsername method 가 실행
        Authentication authentication = authenticationManagerBuilder.getObject().authenticate(authenticationToken);

        // 3. 인증 정보를 기반으로 JWT 토큰 생성
        jwtTokenProvider.generateToken(authentication,response);

        // 4. RefreshToken Redis 저장(expirationTime 설정을 통해 자동 삭제 처리)
        redisTemplate.opsForValue()
                .set("RT:" + authentication.getName(), response.getHeader("Refreshtoken"), 24 * 60 * 60 * 7 * 1000L, TimeUnit.MILLISECONDS);

        return ResponseEntity.ok().body("로그인이 완료되었습니다.");
    }



    public ResponseEntity<?> logout(HttpServletRequest request) {
        // 1. AccessToken 검증
        if (!jwtTokenProvider.validateToken(request.getHeader("Authorization").substring(7))) {
            return ResponseEntity.badRequest().body("잘못된 요청입니다.");
        }

        // 2. AccessToken 에서 User email 을 가져옴
        Authentication authentication = jwtTokenProvider.getAuthentication(request.getHeader("Authorization").substring(7));

        // 3. Redis 에서 해당 User email 로 저장된 RefreshToken 이 있는지 여부를 확인 후 있을 경우 삭제
        if (redisTemplate.opsForValue().get("RT:" + authentication.getName()) != null) {
            // RefreshToken 삭제
            redisTemplate.delete("RT:" + authentication.getName());
        }

        // 4. 해당 AccessToken 유효시간을 가져와 BlackList 로 저장
        Long expiration = jwtTokenProvider.getExpiration(request.getHeader("Authorization").substring(7));
        redisTemplate.opsForValue()
                .set(request.getHeader("Authorization"), "logout", expiration, TimeUnit.MILLISECONDS);

        return ResponseEntity.ok().body("로그아웃 되었습니다.");
    }

}
