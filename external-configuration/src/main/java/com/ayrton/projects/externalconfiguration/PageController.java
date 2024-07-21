package com.ayrton.projects.externalconfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageController {

	@Value("${pageController.msg}")
	private String pageControllerMsg;
	
	@Value("${my.secret}")
	private String mySecret;
	
	@Value("${my.bigNumber}")
	private long myBigNumber;
	
	@Value("${my.number.number}")
	private int myNumber;
	
	@Value("${my.number.less.than.ten}")
	private int myNumberLessThanTen;
	
	@RequestMapping("/")
	public String home() {
		return pageControllerMsg + " my.secret= " + mySecret + " bignumber=" + myBigNumber + " mynumber=" + myNumber + " myNumberLessThanTen= " + myNumberLessThanTen;
	}
	
	
	
	
}
