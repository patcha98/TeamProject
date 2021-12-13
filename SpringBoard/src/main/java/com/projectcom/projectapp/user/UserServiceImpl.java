package com.projectcom.projectapp.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectcom.projectapp.board.BoardVO;
import com.projectcom.projectapp.board.UserVO;

@Service
public class UserServiceImpl {
	@Autowired
	UserDAO userDAO;
	
	public int insertUser(UserVO vo) {
		return userDAO.insertBoard(vo);
	}
	
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
	public int insertAdmin() {
		return userDAO.insertAdmin();
	}
	
}
