package com.ayrton.projects.third.simple.spring.aplication.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;



@ControllerAdvice 
public class GlobalExceptionHandler {
	
	@ExceptionHandler(value = Exception.class)
	public ModelAndView handleGlobalError(Exception exception, WebRequest request) {
			
		final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
	
		ModelAndView modelAndView = new ModelAndView();
		
		if (exception != null) {								
			String errorMessage = "Ocorreu um erro: " + exception.getMessage();							
			LOGGER.error(errorMessage);
			modelAndView.addObject("errorMessage", errorMessage);
			modelAndView.setViewName("error");
			
		}
		
		
		
		return modelAndView;
		
	}
}



//public class GlobalExceptionHandler implements ErrorController {
//
//	private static final Logger LOGGER = LoggerFactory.getLogger(GlobalExceptionHandler.class);
//
//	@GetMapping("/error")
//	@ExceptionHandler(ResponseStatusException.class)
//	public String handleGlobalError(HttpServletRequest request, Model model) {
//		String errorPage = "error";
//
//		@SuppressWarnings("unused")
//		String errorTitle = "error";
//
//		Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//		Object errorMessage = request.getAttribute(RequestDispatcher.ERROR_MESSAGE);
//
//		if (status != null) {
//
//			Integer statusCode = Integer.valueOf(status.toString());
//
//			if (statusCode == HttpStatus.NOT_FOUND.value()) {
//				errorTitle = "Página não encontrada";
//				errorPage = "error/404";
//				LOGGER.error("Error :" + statusCode + " Msg: " + errorMessage.toString());
//			} else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//				errorTitle = "Erro Interno de Servidor";
//				errorPage = "error/500";
//				LOGGER.error("Error :" + statusCode + " Msg: " + errorMessage.toString());
//
//			} else if (statusCode == HttpStatus.FORBIDDEN.value()) {
//				errorTitle = "Erro de Acesso Proibido";
//				errorPage = "error/403";
//				LOGGER.error("Error :" + statusCode + " Msg: " + errorMessage.toString());
//			}
//
//			model.addAttribute("errorCode", statusCode);
//			model.addAttribute("errorMessage", errorMessage);
//			model.addAttribute("errorTitle", errorTitle);
//
//		}
//
//		return errorPage;
//	}
//
//}
//
