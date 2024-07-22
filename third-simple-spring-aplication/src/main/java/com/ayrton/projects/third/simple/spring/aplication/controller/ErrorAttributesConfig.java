package com.ayrton.projects.third.simple.spring.aplication.controller;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorAttributesConfig {
	
    @Bean
    public ErrorAttributeOptions errorAttributeOptions() {
        return ErrorAttributeOptions.defaults()
                .including(ErrorAttributeOptions.Include.EXCEPTION)
                .including(ErrorAttributeOptions.Include.MESSAGE)
                .including(ErrorAttributeOptions.Include.BINDING_ERRORS);
    }

}
