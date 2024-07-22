package com.ayrton.projects.third.simple.spring.aplication.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;


public class MainErrorController{
//	
//	@GetMapping("/error")
//	public String errorHandle(Model model, HttpServletRequest request) {
//		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//		Object errorMessage = request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
//		
//		if(status != null) {
//			Integer statusCode = Integer.valueOf(status.toString());
//			
//			if (statusCode == HttpStatus.NOT_FOUND.value()) {
//				model.addAttribute("statusCode", statusCode);
//				model.addAttribute("errorMessage", errorMessage);
//				
//		} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//				model.addAttribute("statusCode", statusCode);
//				model.addAttribute("errorMessage", errorMessage);
//				
//			}
//		}
//		
//		return "error";
//	}
//	
////	@GetMapping("/error")
////	public String handleError(Model model, HttpServletRequest request) {
////	    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
////	    
////	    if (status != null) {
////	        Integer statusCode = Integer.valueOf(status.toString());
////	    
////	        if(statusCode == HttpStatus.NOT_FOUND.value()) {
////	            return "error-404";
////	        }
////	        else if(statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
////	            return "error-500";
////	        }
////	    }
////	    return "error";
////	}

}
