package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class RestapiApplication {
	@GetMapping("/")
	public String helloWorld(){
		return "Hola Mundo con Spring";
	}
	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}


}
