package com.example.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewController {
	@GetMapping("/")
	 public String sayHello() {
        return "Hello, World!";
    }

}
