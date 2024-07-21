package com.ayrton.projects.springbootprofiles;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class DataSourceConfig {

	
	@Bean(name="datasource")
	@Profile("development")
	DataSource dataSourceDevelopment() {
		return new DataSource("myurl-dev", 999);
	}
	
	@Bean(name="datasource")
	@Profile("production")
	DataSource dataSourceProduction() {
		return new DataSource("myurl-prod", 999);
	}
	
	
}
