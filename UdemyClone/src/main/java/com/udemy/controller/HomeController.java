package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Sparsh Tiwari");
		model.addAttribute("id",321);
		System.out.println("this is my home");
		return "index_2";
	}

	@RequestMapping("/about")
	public String about() {
		System.out.println("this is about");
		return "about";
	}
}
