package com.projectcom.projectapp.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	BoardDAO boardDAO;
	
	@Override
	public int insertBoard(BoardVO vo) {
		return boardDAO.insertBoard(vo);
	}
	
	@Override
	public BoardVO getBoard(int seq) {
		return boardDAO.getBoard(seq);
	}
	
	@Override
	public List<BoardVO> getBoardList(){
		return boardDAO.getBoardList();
	}
	
	@Override
	public List<BoardVO> getGrade1BoardList(){
		return boardDAO.getGrade1BoardList();
	}
	
	@Override
	public List<BoardVO> getGrade2BoardList(){
		return boardDAO.getGrade2BoardList();
	}
	
	@Override
	public List<BoardVO> getGrade3BoardList(){
		return boardDAO.getGrade3BoardList();
	}
	
	@Override
	public List<BoardVO> getGrade4BoardList(){
		return boardDAO.getGrade4BoardList();
	}

	@Override
	public int deleteBoard(int id) {
		return boardDAO.deleteBoard(id);
	}

	@Override
	public int updateBoard(BoardVO vo) {
		return boardDAO.updateBoard(vo);
	}
	
}
