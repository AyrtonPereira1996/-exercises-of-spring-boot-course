package com.project.firstsimplespringapplication.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/")
	public String getHomePage() {
		return "Seja bem vindo a página home da aplicação....";
	}
	
	@GetMapping("another-page")
	public String getAnotherTextInHomePage(){
		return "Mostrando o outro texto...";
	}

}
