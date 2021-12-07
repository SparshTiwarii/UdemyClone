package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.udemy.model.User;
import com.udemy.service.UserService;

@Controller
public class ContactController {
	private UserService userService;
	@RequestMapping("/contact")
	public String getContact() {
		return "contact";
	}

	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String handleForm(Model model, @ModelAttribute User user) {
		int i = this.userService.createUser(user);
		return "success";
	}

	/*
	 * @RequestMapping(path = "/processForm", method = RequestMethod.POST) public
	 * String handleForm(Model model, @RequestParam("email") String email,
	 * 
	 * @RequestParam("username") String userName, @RequestParam("password") String
	 * userPassword) { model.addAttribute("password", userPassword);
	 * model.addAttribute("email", email); model.addAttribute("name", userName);
	 * model.addAttribute("password",userPassword);
	 * return "success"; // where will the action go }
	 */
}
