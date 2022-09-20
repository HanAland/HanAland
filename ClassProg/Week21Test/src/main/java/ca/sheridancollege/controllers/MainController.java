package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController 
{
//	@GetMapping("/")   // Context Path  localhost:8080
//	public String homePage()
//	{
//		return "about.html";
//	}
	
	@GetMapping("/test")   // Context Path  localhost:8080
	public String homePage()
	{
		return "about.html";
	}
	
	
}
