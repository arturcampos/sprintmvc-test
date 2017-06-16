package br.com.sprinttest.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

	@RequestMapping("/users/registration")
	public String registration(){
		return "users/registration";
	}
}
