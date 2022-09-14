package com.example.signintest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SignintestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SignintestApplication.class, args);
	}

}
