package com.ayrton.projects.h2demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayrton.projects.h2demo.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
