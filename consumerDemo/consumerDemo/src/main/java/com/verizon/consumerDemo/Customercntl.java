package com.verizon.consumerDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class Customercntl {
	
	@Autowired
	RestTemplate restTemplate;

	
	@GetMapping("/consumer")
    public String getMessage(){
		String msg=restTemplate.getForObject("http://localhost:8080/producer", String.class);
		return   "Message from Producer :" + msg; //   "Consumer MEssage";

	}
	

}
