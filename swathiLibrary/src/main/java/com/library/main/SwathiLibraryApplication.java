package com.library.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//This will tells spring boot to where to scan for detecting the entities for the application.
@EntityScan("com.library.model")
//@ComponentScan with arguments tells Spring to scan the current package
@ComponentScan("com.library.controller")
@SpringBootApplication
//This will enable the JPA repositories that contains in the given package(s).
@EnableJpaRepositories(value = "com.library.repositories")
public class SwathiLibraryApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwathiLibraryApplication.class, args);
	}

}
