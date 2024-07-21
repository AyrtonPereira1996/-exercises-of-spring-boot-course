package com.ayrton.projects.internationalization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/posts")
public class PostController {
	

	@RequestMapping("/")
	public String getListPosts() {
		return "views/list";
	}

}
