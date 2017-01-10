package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableFeignClients
@Controller
public class FeignDemoClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignDemoClientApplication.class, args);
	}
}
