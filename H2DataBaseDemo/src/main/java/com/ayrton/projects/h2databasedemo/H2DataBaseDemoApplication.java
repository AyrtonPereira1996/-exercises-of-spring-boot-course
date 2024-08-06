package com.ayrton.projects.h2databasedemo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.ayrton.projects.h2databasedemo.domain.Post;
import com.ayrton.projects.h2databasedemo.repository.PostRepository;

import jakarta.annotation.PostConstruct;

@EntityScan(basePackages = "com.ayrton.projects.h2databasedemo.domain")
@SpringBootApplication
public class H2DataBaseDemoApplication {
	private static final Logger logger = LoggerFactory.getLogger(H2DataBaseDemoApplication.class);

	//PostRepository
	@Autowired
	PostRepository postRepository;

	public static void main(String[] args) {
		SpringApplication.run(H2DataBaseDemoApplication.class, args);

	}

	//PostConstruct
	@PostConstruct
	void seePosts() {
		logger.info("seepost method called...");

		for(Post post : postRepository.findAll()) {
			logger.info(post.toString());
		}

	}




}
