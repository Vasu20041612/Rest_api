package org.crud.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaCrudApplication {

	public static void main(String[] args) {
	
		SpringApplication.run(JpaCrudApplication.class, args);
		System.out.println("Run Successfull");
	}

}
