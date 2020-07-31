package com.psycho.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.psycho.dto.ReviewDTO;
import com.psycho.utils.Criteria;

@Repository
public class ReviewDAO {
	
	@Inject
	private SqlSession sqlSession;
	
	public List<ReviewDTO> list(Criteria cri) {
		return sqlSession.selectList("ReviewMapper.list", cri);
	}
	
	public void write(ReviewDTO reviewDTO) {
		sqlSession.insert("ReviewMapper.insert", reviewDTO);
	}
	
	public ReviewDTO read(int pt_rnum) {
		return sqlSession.selectOne("ReviewMapper.read", pt_rnum);
	}
	
	public void update(ReviewDTO reviewDTO) {
		sqlSession.update("ReviewMapper.update", reviewDTO);
	}
	
	public void delete(int pt_rnum) {
		sqlSession.delete("ReviewMapper.delete", pt_rnum);
	}
}
