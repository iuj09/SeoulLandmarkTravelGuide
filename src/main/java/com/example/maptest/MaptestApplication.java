package com.example.maptest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MaptestApplication {
	public static void main(String[] args) {
		SpringApplication.run(MaptestApplication.class, args);
	}

}
