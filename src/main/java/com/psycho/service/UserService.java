package com.psycho.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.psycho.dao.UserDAO;
import com.psycho.dto.UserDTO;
import com.psycho.dto.UserVO;

@Service
public class UserService {
	
	@Inject
	private UserDAO userDAO;
	
	// 회원가입
	public void resiter(UserVO userVO) {
		userDAO.register(userVO);
	}

	// 회원탈퇴
	public void withdraw(int pt_num) {
		userDAO.withdraw(pt_num);
	}
	
	// 로그인
	public UserDTO login(UserDTO userDTO) {
		return userDAO.login(userDTO);
	}
}
