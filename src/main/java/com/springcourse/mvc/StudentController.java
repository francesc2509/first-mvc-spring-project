package com.springcourse.mvc;

import org.springframework.stereotype.Controller;
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
}
