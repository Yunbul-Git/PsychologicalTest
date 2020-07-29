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
	
	@RequestMapping("/register")
	public String register() {
		//client id , redirect uri 
		
		return "register";
	}
	


}
