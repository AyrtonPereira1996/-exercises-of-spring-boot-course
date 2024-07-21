package com.project.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HomeController {

	
	@GetMapping("/")
	public String gettingHome() {
		return "Hello World! Welcome to Spring Framework World";
	}
	
}
