package com.psycho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.psycho.dto.Criteria;
import com.psycho.dto.ReviewDTO;
import com.psycho.service.ReviewService;

@Controller
public class ReviewController {

	private ReviewService reviewService;
	
	@RequestMapping("/review")
	public String review(Model model, Criteria cri) {
		//model.addAttribute("list", reviewService.list(cri));
		return "/board/list";
	}
	
	@RequestMapping("/write")
	public String write() {
		return "/board/write";
	}
	
	@RequestMapping("/read")
	public String read(Model model, ReviewDTO reviewDTO) {
		model.addAttribute("read", reviewService.read(reviewDTO.getPt_rnum()));
		return "/board/read";
	}
	
	@RequestMapping("/update")
	public String update(Model model, ReviewDTO reviewDTO) {
		model.addAttribute("read", reviewService.read(reviewDTO.getPt_rnum()));
		return "/board/write";
	}
	
	@RequestMapping("/delete")
	public String delete() {
		return "/board/delete";
	}
}
