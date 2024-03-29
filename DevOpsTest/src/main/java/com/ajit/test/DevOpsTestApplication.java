package com.ajit.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

@RequestMapping("/")
@RestController
public class DevOpsTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsTestApplication.class, args);
	}

	@GetMapping("/firstCall")
	public String firstDevOps() {
		return "Deployment done successfully!";
	}
}
