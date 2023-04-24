package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.demo.ex4.ClassEx4;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroductionApplication.class, args);
        
		ClassEx4 p = new ClassEx4(1, "Sachin", "12");
		
		ObjectMapper obj = new ObjectMapper();
		
		try 
		{
			String str = obj.writeValueAsString(p);
			System.out.println(str);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}



