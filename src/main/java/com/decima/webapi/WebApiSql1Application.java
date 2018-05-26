package com.decima.webapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.decima.webapi.repository")
public class WebApiSql1Application {

	public static void main(String[] args) {
		SpringApplication.run(WebApiSql1Application.class, args);
	}
}
