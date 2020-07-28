package com.psycho.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.psycho.dto.UserVO;

public class UserDAO {

	private SqlSession sqlSession;
	
	public void login(String pt_id, String pt_pass) {
		HashMap<String, String> map;
		//map.put("pt_id", pt_id);
		//map.put("pt_p", pt_pass);
		//sqlSession.select("UserMapper.login", map);
	}
	
	public void signUp(UserVO userVO) {
		sqlSession.insert("UserMapper.signup", userVO);
	}
	
	public void withdraw(int pt_num) {
		sqlSession.delete("UserMapper.withdraw", pt_num);
	}
}
