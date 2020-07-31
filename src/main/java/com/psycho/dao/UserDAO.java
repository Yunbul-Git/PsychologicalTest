package com.psycho.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.psycho.dto.UserDTO;
import com.psycho.dto.UserVO;

@Repository
public class UserDAO {

	@Inject
	private SqlSession sqlSession;
	
	// 회원가입
	public void register(UserVO userVO) {
		sqlSession.insert("UserMapper.register", userVO);
	}
	
	// 회원탈퇴
	public void withdraw(int pt_num) {
		sqlSession.delete("UserMapper.withdraw", pt_num);
	}
	
	// 로그인
	public UserDTO login(UserDTO userDTO) {
		return sqlSession.selectOne("UserMapper.login", userDTO);
	}
}
