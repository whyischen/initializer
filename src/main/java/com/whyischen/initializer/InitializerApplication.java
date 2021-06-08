package com.whyischen.initializer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class InitializerApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitializerApplication.class, args);
	}

}
