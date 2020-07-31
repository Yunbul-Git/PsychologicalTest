package com.psycho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.psycho.utils.Criteria;

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
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public void register() {
	}
	
}
