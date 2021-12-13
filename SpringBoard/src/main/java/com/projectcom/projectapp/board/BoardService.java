package com.projectcom.projectapp.board;

import java.util.List;

public interface BoardService {
	public int insertBoard(BoardVO vo);
	public int deleteBoard(int id);
	public int updateBoard(BoardVO vo);
	public BoardVO getBoard(int seq);
	public List<BoardVO>getBoardList();
	public List<BoardVO>getGrade1BoardList();
	public List<BoardVO>getGrade2BoardList();
	public List<BoardVO>getGrade3BoardList();
	public List<BoardVO>getGrade4BoardList();
}
