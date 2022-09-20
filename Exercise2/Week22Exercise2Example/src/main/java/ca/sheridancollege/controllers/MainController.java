package ca.sheridancollege.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController 
{
	@GetMapping("/career")    //context path = localhost:8080/career
	public String careerPage()
	{
		return "career.html";
	}
	@GetMapping("/hobby")
	public String hobbyPage()
	{
		return "hobby.html";
	}
	@GetMapping("/music")
	public String musicPage()
	{
		return "music.html";
	}
	

}
