package com.ayrton.projects.h2demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayrton.projects.h2demo.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long> {

}
