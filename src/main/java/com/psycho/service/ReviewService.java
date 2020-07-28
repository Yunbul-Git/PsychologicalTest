package com.psycho.service;

import java.util.List;


import com.psycho.dao.ReviewDAO;
import com.psycho.dto.Criteria;
import com.psycho.dto.ReviewDTO;

public class ReviewService {
	
	private ReviewDAO reviewDAO;
	
	public List<ReviewDTO> list(Criteria cri) {
		return reviewDAO.list(cri);
	}
	
	public void write(ReviewDTO reviewDTO) {
		reviewDAO.write(reviewDTO);
	}
	
	public ReviewDTO read(int pt_rnum) {
		return reviewDAO.read(pt_rnum);
	}
	
	public void update(ReviewDTO reviewDTO) {
		reviewDAO.update(reviewDTO);
	}
	
	public void delete(int pt_rnum) {
		reviewDAO.delete(pt_rnum);
	}
}
