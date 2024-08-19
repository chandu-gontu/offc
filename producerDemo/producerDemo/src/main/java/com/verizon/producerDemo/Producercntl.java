package com.verizon.producerDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producercntl {
	
	@GetMapping("/producer")
    public String getMessage(){
		return "Welcome to producer";
	}
}
