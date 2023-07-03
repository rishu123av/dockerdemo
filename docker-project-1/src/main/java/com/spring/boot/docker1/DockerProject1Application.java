package com.spring.boot.docker1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerProject1Application {
	
	@GetMapping("/message")
	public String getMessage() {
		return "welcome to dockerfile";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerProject1Application.class, args);
	}

}
