package com.example.signintest.controller;

import com.example.signintest.dto.UserRequestDTO;
import com.example.signintest.security.JwtTokenProvider;
import com.example.signintest.entity.User;
import com.example.signintest.repository.UserRepository;
import com.example.signintest.service.Helper;
import com.example.signintest.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.example.signintest.dto.UserRequestDTO.*;

@Slf4j

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class UserController {

//    private final PasswordEncoder passwordEncoder;
//    private final JwtTokenProvider jwtTokenProvider;
//    private final UserRepository userRepository;
    private final UserService userService;

    @ApiOperation(value = "email 과 password 를 입력해 회원가입")
    @ApiImplicitParam(name = "UserRequestDTO.Signup", value = "회원가입")
    @PostMapping("/sign-up")
    public ResponseEntity<?> signUp(@Validated @RequestBody Signup signup, @ApiIgnore Errors errors) {

//        if (errors.hasErrors()) {
//            return userService.invalidFields(Helper.refineErrors(errors));
//        }
        return userService.signUp(signup);
    }

    @ApiOperation(value = "email 과 password 를 입력해 로그인")
    @ApiImplicitParam(name = "UserRequestDTO.Login", value = "로그인")
    @PostMapping("/login")
    public ResponseEntity<?> login(@Validated @RequestBody Login login, HttpServletResponse response, @ApiIgnore Errors errors) {

//        if (errors.hasErrors()) {
//            return userService.invalidFields(Helper.refineErrors(errors));
//        }
        return userService.login(login,response);
    }

    @ApiOperation(value = "logout")
    @GetMapping("/logout")
    public ResponseEntity<?> logout(HttpServletRequest request) {
//        if (errors.hasErrors()) {
//            return userService.invalidFields(Helper.refineErrors(errors));
//        }
        return userService.logout(request);
    }


}
