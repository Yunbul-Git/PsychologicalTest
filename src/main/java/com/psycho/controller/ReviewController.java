package com.psycho.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.psycho.dto.ReviewDTO;
import com.psycho.service.ReviewService;
import com.psycho.utils.Criteria;

@Controller
public class ReviewController {

	@Inject
	private ReviewService reviewService;
	
	@RequestMapping(value = "/write", method = RequestMethod.GET)
	public String write() {
		return "/board/write";
	}
	
	@RequestMapping(value = "/write", method = RequestMethod.POST)
	public String write(Model model, ReviewDTO reviewDTO) {
		reviewService.write(reviewDTO);
		return "/board/read";
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
	public String delete(ReviewDTO reviewDTO) {
		reviewService.delete(reviewDTO.getPt_rnum());
		return "/board/list";
	}
	
	@RequestMapping("/review")
	public String review(Model model, Criteria cri) {
		model.addAttribute("list", reviewService.list(cri));
		//model.addAttribute("pageMaker", );
		return "/board/list";
	}
}
