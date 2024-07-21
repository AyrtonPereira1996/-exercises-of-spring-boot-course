package com.project.demoapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String getHome() {
		return "Hello Devtools. by ayrton";
	}
	
	
}
