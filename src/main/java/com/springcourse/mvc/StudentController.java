package com.springcourse.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("students")
public class StudentController {
	@RequestMapping("")
	public String showForm() {
		return "student-form";
	}
	
	@RequestMapping("process")
	public String processForm() {
		return "hello-student";
	}
	
	@RequestMapping("process-v2")
	public String processFormV2(HttpServletRequest request, Model model) {
		model.addAttribute("message", String.join(" ", "Who is the best student?", request.getParameter("name")));
		
		return "hello-student";
	}
}
