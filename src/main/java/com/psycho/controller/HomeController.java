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
	
	@RequestMapping("/review")
	public String review() {
		return "/board/list";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "/admin/admin";
	}
	
	@RequestMapping("/signup")
	public String signUp() {
		return "signUp";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/board/write";
	}
}
