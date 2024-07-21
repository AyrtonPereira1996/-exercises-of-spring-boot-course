package com.ayrton.projects.controller.domain;

import java.util.Date;

public class Post {
	
	private String tile;
	private String body;
	private Date posted;
	private String author;
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getTile() {
		return tile;
	}
	
	public void setTile(String tile) {
		this.tile = tile;
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
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Post [tile=" + tile + ", body=" + body + ", posted=" + posted + ", author=" + author + "]";
	}
	
	
	

}
