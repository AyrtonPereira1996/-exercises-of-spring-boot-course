package com.ayrton.projects.third.simple.spring.aplication.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.server.ResponseStatusException;


@Controller
public class DemoTestException {
	
	@GetMapping("/exception-403")
	public String throwExceptionForbidden() {
		throw new ResponseStatusException(HttpStatus.FORBIDDEN, "Não tem permissão de acesso");
	}
	
	@GetMapping("/exception-404")
	public String throwExceptionNotFOund() {
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Página não encontrada");
	}
	
	@GetMapping("/exception-500")
	public String throwExceptionInternalErrorServer() {
		throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "Erro Interno de Servidor");
	}

}
