package com.ayrton.projects.showprojectbeans.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ayrton.projects.showprojectbeans.services.NotificationService;

@RestController
public class pageController {

	// notificationService 
	private NotificationService notificationService;

//	@Autowired
//	public void setNotificationService(NotificationService notificationService) {
//		this.notificationService = notificationService;
//	}

	@Autowired
	public pageController(NotificationService notificationService) {
		this.notificationService = notificationService;
	}

	@GetMapping("/")
	public String home() {
		return notificationService.toString();
	}

}
