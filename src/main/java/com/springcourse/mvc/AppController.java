package com.springcourse.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	
	@RequestMapping
	public String showHome() {
		return "home";
	}
}
