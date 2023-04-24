package com.example.demo.ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//Exercise demonstrating Value Annotation 

@Controller
public class ClassEx3 
{
	@Value("${carname: 'creta'}")
	public String car;
	
	@GetMapping("exercise3")
	
	@ResponseBody
	public String displayCar()
	{
		return "My fav car " + car;
	}
}
