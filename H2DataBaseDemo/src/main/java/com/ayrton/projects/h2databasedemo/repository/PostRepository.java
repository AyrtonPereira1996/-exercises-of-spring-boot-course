package com.ayrton.projects.h2databasedemo.repository;

import org.springframework.data.repository.CrudRepository;

import com.ayrton.projects.h2databasedemo.domain.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
