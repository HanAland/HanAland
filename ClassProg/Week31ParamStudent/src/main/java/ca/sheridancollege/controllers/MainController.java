package ca.sheridancollege.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.http.HttpServletResponse;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ca.sheridancollege.beans.Student;

@Controller
public class MainController 
{
	@GetMapping("/")
	public String goIndex()
	{
		return "index.html";
		
	}
	
	@PostMapping("/formPost")
	public void formPost(HttpServletResponse response,
						@RequestParam String firstName,
						@RequestParam String lastName,
						@RequestParam String email,
						@RequestParam long studentNumber,
						@RequestParam @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate birthDate)
	{
		Student student1 = new Student();
		student1.setFirstName(firstName);
		student1.setLastName(lastName);
		student1.setEmail(email);
		student1.setStudentNumber(studentNumber);
		student1.setBirthDate(birthDate);
		
		try
		{
			String output = "<p>"+ student1 + "</p>";
			PrintWriter out = response.getWriter();
			out.println("<html><head></head><body>" + output + "</body></html>");
			out.close();
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
		
		
	}
	
}
