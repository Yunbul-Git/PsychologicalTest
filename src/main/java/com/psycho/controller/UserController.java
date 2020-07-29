package com.psycho.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.psycho.dto.UserDTO;
import com.psycho.service.UserService;

@Controller
public class UserController {

	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserDTO userDTO, HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes) {
		
		HttpSession httpSession = httpServletRequest.getSession();
		UserDTO login = userService.login(userDTO);
		
		if(login == null) {
			httpSession.setAttribute("user", null);
			redirectAttributes.addFlashAttribute("msg", false);
		} else {
			httpSession.setAttribute("user", login);
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		
		return "redirect:/";
	}
	
}
