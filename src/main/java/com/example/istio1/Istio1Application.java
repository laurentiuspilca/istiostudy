package com.example.istio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Istio1Application {

	@GetMapping("/hello")
	public String hello() {
		return "Hello Istio!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Istio1Application.class, args);
	}

}

