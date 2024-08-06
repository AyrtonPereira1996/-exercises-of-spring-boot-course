package com.ayrton.projects.h2databasedemo.domain;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Post {

	@Id
	@GeneratedValue
	private Long id;

	private String title;

	private String body;

	private Date posted;

	@ManyToOne
	private Author author;


	public Post() {
		super();
	}

	public Post(String title) {
		super();
		this.title = title;
	}

	public Post(Long id, String title, String body, Date posted, Author author) {
		super();
		this.id = id;
		this.title = title;
		this.body = body;
		this.posted = posted;
		this.author = author;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	public Date getPosted() {
		return posted;
	}


	public void setPosted(Date posted) {
		this.posted = posted;
	}


	@Override
	public String toString() {
		return "Post [id=" + id + ", title=" + title + ", body=" + body + ", posted=" + posted + "]";
	}





}
