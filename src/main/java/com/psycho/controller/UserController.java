package com.psycho.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UrlPathHelper;

import com.psycho.dto.UserDTO;
import com.psycho.dto.UserVO;
import com.psycho.service.UserService;

@Controller
public class UserController {
	
	@Inject
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	//@ResponseBody
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(UserDTO userDTO, HttpServletRequest httpServletRequest, RedirectAttributes redirectAttributes) {
		
		HttpSession httpSession = httpServletRequest.getSession();
		UserDTO login = userService.login(userDTO);
		
		if(login == null) {
			httpSession.setAttribute("user", null);
			redirectAttributes.addFlashAttribute("msg", false);
		} else {
			httpSession.setAttribute("user", login);
			httpSession.setAttribute("auth", login.getPt_auth());
		}
		return "redirect:/";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpSession httpSession) {
		httpSession.setAttribute("user", null);
		httpSession.invalidate();
		
		return "home";
	}
	
	
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public String register(UserVO userVO, HttpServletRequest hsr) {
		UrlPathHelper urlPathHelper = new UrlPathHelper();
		String originalUrl = urlPathHelper.getOriginatingRequestUri(hsr);
		System.out.println(originalUrl);
		userService.resiter(userVO);
		return "home";
	}
	
	@RequestMapping("/userUpdate")
	public String userUpdate() {
		
		return "userUpdate";
	}
}
