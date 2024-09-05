package com.springboot.taskly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TasklyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TasklyApplication.class, args);
	}

	@GetMapping("/hello")
	public String sayhello() {
		return "Hello World!";
	}
}
