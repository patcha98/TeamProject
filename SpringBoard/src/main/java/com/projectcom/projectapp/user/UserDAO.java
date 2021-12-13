package com.projectcom.projectapp.user;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectcom.projectapp.board.BoardVO;
import com.projectcom.projectapp.board.UserVO;

@Repository
public class UserDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	public UserVO getUser(UserVO vo) {
		return sqlSession.selectOne("User.getUser", vo);
	} 
	
	public int insertAdmin() {
		int result = sqlSession.insert("User.insertAdmin");
		return result;
	}
	
	public int insertBoard(UserVO vo) {
		int result = sqlSession.insert("User.insertUser", vo);
		return result;
	}
	

}
