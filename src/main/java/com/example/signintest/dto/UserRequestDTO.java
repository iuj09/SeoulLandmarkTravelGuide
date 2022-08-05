package com.example.signintest.dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;


public class UserRequestDTO {

    @Getter
    @Setter
    public static class Signup {

        @ApiModelProperty(example = "email 입력")
        @ApiParam(value = "email")
        @NotEmpty(message = "email은 필수 입력값입니다.")
        @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "email 형식에 맞지 않습니다.")
        private String email;

        @ApiModelProperty(example = "password 입력")
        @ApiParam(value = "password")
        @NotEmpty(message = "비밀번호는 필수 입력값입니다.")
        @Pattern(regexp =  "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$", message = "비밀번호는 8~16자 영문 대 소문자, 숫자, 특수문자를 사용하세요.")
        private String password;
    }

    @Getter
    @Setter
    public static class Login {
        @ApiModelProperty(example = "email 입력")
        @ApiParam(value = "email")
        @NotEmpty(message = "email은 필수 입력값입니다.")
        @Pattern(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+.[A-Za-z]{2,6}$", message = "email 형식에 맞지 않습니다.")
        private String email;

        @ApiModelProperty(example = "password 입력")
        @ApiParam(value = "password")
        @NotEmpty(message = "비밀번호는 필수 입력값입니다.")
        private String password;

        public UsernamePasswordAuthenticationToken toAuthentication() {
            return new UsernamePasswordAuthenticationToken(email, password);
        }
    }

    @Getter
    @Setter
    public static class Logout {
        @NotEmpty(message = "잘못된 요청입니다.")
        private String accessToken;

        @NotEmpty(message = "잘못된 요청입니다.")
        private String refreshToken;
    }
}
