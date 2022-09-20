package ca.sheridancollege.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalTime;

import javax.servlet.http.HttpServletResponse;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	
	@GetMapping("/demo")
	public String goDemo()
	{
			return "paramDemo.html";
	}
	
	
	//@GetMapping("/paramDemo")
	@PostMapping("/paramDemo")
	public void doForm(HttpServletResponse response,
						@RequestParam String firstName,
						@RequestParam(name="lastName", required=true, defaultValue="none") String lName,
						@RequestParam(required=false) boolean fun,
						@RequestParam(required=false) boolean hello,
						@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.TIME) LocalTime apptTime)
	
	{
		try
		{
			PrintWriter out=response.getWriter();
			out.println("<html><head></head><body>"+firstName+"<br>"+lName+
					    "<br>"+fun+"<br>"+hello+"<br>"+apptTime.toString()+"</body><html>");
			
			if(fun==true && hello==true)
				out.println("spring is fun");
			
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}		
		
	}

}
