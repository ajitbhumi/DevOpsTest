package com.ajit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RequestMapping("/")
public class DevOpsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsTestApplication.class, args);
	}

	@GetMapping("/firstCall")
	public String firstDevOps() {
		return "Deployment done successfully!";
	}
}
