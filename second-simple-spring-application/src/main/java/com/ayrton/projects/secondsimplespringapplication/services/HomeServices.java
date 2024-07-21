package com.ayrton.projects.secondsimplespringapplication.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class HomeServices {
	
	@Value("${app.config.name}")
	private String appName;
	
	@Value("${app.config.author}")
	private String authorApp;
	
	@Value("${app.config.programmer}")
	private String programmerApp;
	
	@Value("${app.config.year-creation}")
	private int yearCreation;
	
	@Value("${app.config.msg}")
	private String msg;
	

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAuthorApp() {
		return authorApp;
	}

	public void setAuthorApp(String authorApp) {
		this.authorApp = authorApp;
	}

	public String getProgrammerApp() {
		return programmerApp;
	}

	public void setProgrammerApp(String programmerApp) {
		this.programmerApp = programmerApp;
	}

	public int getYearCreation() {
		return yearCreation;
	}

	public void setYearCreation(int yearCreation) {
		this.yearCreation = yearCreation;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "HomeServices [<br><strong>appName = </strong>" + appName +"<br><strong>authorApp = </strong>"  + authorApp + "<br><strong>programmerApp = </strong>" + programmerApp
				+ "<br><strong>yearCreation = </strong>" + yearCreation + "<br><strong>msg = </strong>" + msg + "<br>]";
	}
	
	
	
	
	
	
	
	

}
