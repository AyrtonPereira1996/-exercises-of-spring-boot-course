package com.ayrton.projects.secondsimplespringapplication.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayrton.projects.secondsimplespringapplication.services.HomeServices;

@RestController
public class HomeController {
	
	
	private HomeServices homeServices;
	
	@Autowired
	public HomeController(HomeServices homeServices) {
		this.homeServices = homeServices;
	}

	@RequestMapping("/")
	public String getHome() {
		return homeServices.toString();
	}

	
	

}
