package com.example.demo.ex2;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

//Exercise demonstrating getter and setter using RestController Annotation 

@RestController
public class ClassEx2 
{
	public String name = "Iamneo";
	
	@GetMapping("/exercise2")
	
	public String getter()
	{
		return "Welcome " + name;
	}
}
