package com.psycho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "/test/testPage";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "/admin/admin";
	}
	
	@RequestMapping("/signup")
	public String signUp() {
		//client id , redirect uri 
		
		return "signUp";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	

}
