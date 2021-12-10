//package com.mycom.myapp.board;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.crud.bean.BoardVO;
import com.crud.common.JDBCUtil;

public class BoardDAO {
	
	private JdbcTemplate template;
	
//	
//	Connection conn = null;
//	PreparedStatement stmt = null;
//	ResultSet rs = null;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	private final String BOARD_INSERT = "insert into BOARD (title, writer, content) values (?,?,?)";
	private final String BOARD_UPDATE = "update BOARD set title=?, writer=?, content=? where seq=?";
	private final String BOARD_DELETE = "delete from BOARD  where seq=?";
	private final String BOARD_GET = "select * from BOARD  where seq=?";
	private final String BOARD_LIST = "select * from BOARD order by seq desc";

	public int insertBoard(BoardVO vo) {
		
		return template.update(BOARD_INSERT, 
				new Object[] {vo.getTitle(), vo.getWriter(), vo.getContent()});
	}
	
	public int deleteBoard(int id) {
		return template.update(BOARD_DELETE, new Object[] {id});
	}
	public int updateBoard(BoardVO vo) {
		return template.update(BOARD_UPDATE, new Object[] {vo.getTitle(), vo.getWriter(), vo.getContent(), vo.getSeq()});
	}
	
	
	public BoardVO getBoard(int seq) {
		return template.queryForObject(BOARD_GET,  new Object[] {seq}, 
				new BeanPropertyRomMapper<BoardVO>(BoardVO.class));
	}
	

	public List<BoardVO> getBoardList(){
		return template.query(BOARD_LIST , new RowMapper<BoardVO>() {
			@Override
			public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
				BoardVO data = new BoardVO();
				data.setSeq(rs.getInt("seq"));
				data.setTitle(rs.getString("title"));
				data.setRegdate(rs.getDate("regdate"));
				data.setWriter(rs.getString("writer"));
				return data;
			}
		});
	}
}

	//데이터 한개 가져올때 그떄 사용하는 queryForObject 라는 함수 - 구문이 template.queryforobject BOARd_get 두번쨰 물음표 데이터세번쨰 인자 
	//우리쪽으로 가져와야함 그것 리턴받는 애들임 
	//board . vo 를 가져올 경우 - 얘를 리턴하면 바로 리턴됌 
// 데이터 리스트 - 어레이 리스트의 컬렉션을 사용하게 됌 
	// 커리라는 함수를 사용하게 됌 
	
//	System.out.println("===> JDBC로 insertBoard() 기능 처리");
//	try {
//		conn = JDBCUtil.getConnection();
//		stmt = conn.prepareStatement(BOARD_INSERT);
//		stmt.setString(1, vo.getTitle());
//		stmt.setString(2, vo.getWriter());
//		stmt.setString(3, vo.getContent());
//		stmt.executeUpdate();
//		return 1;
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return 0;
//}
//
//// 글 삭제

//	System.out.println("===> JDBC로 updateBoard() 기능 처리");
//	try {
//		conn = JDBCUtil.getConnection();
//		stmt = conn.prepareStatement(BOARD_UPDATE);
//		stmt.setString(1, vo.getTitle());
//		stmt.setString(2, vo.getWriter());
//		stmt.setString(3, vo.getContent());
//		stmt.setInt(4, vo.getSeq());
//		
//		
//		System.out.println(vo.getTitle() + "-" + vo.getWriter() + "-" + vo.getContent() + "-" + vo.getSeq());
//		stmt.executeUpdate();
//		return 1;
//		
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	return 0;
//}	
//
	
	
//		List<BoardVO> list = new ArrayList<BoardVO>();
//		System.out.println("===> JDBC로 getBoardList() 기능 처리");
//		try {
//			conn = JDBCUtil.getConnection();
			
//		BoardVO one = new BoardVO();
//		
//		System.out.println("===> JDBC로 getBoard() 기능 처리");
//		try {
//			conn = JDBCUtil.getConnection();
//			stmt = conn.prepareStatement(BOARD_GET);
//			stmt.setInt(1, seq);
//			rs = stmt.executeQuery();
//			if(rs.next()) {
//				one.setSeq(rs.getInt("seq"));
//				one.setTitle(rs.getString("title"));
//				one.setWriter(rs.getString("writer"));
//				one.setContent(rs.getString("content"));
//				one.setCnt(rs.getInt("cnt"));
//			}
//			rs.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return one;
//	}
	
//	public List<BoardVO> getBoardList(){
//		List<BoardVO> list = new ArrayList<BoardVO>();
//		System.out.println("===> JDBC로 getBoardList() 기능 처리");
//		try {
//			conn = JDBCUtil.getConnection();
//			stmt = conn.prepareStatement(BOARD_LIST);
//			rs = stmt.executeQuery();
//			while(rs.next()) {
//				BoardVO one = new BoardVO();
//				one.setSeq(rs.getInt("seq"));
//				one.setTitle(rs.getString("title"));
//				one.setWriter(rs.getString("writer"));
//				one.setContent(rs.getString("content"));
//				one.setRegdate(rs.getDate("regdate"));
//				one.setCnt(rs.getInt("cnt"));
//				list.add(one);
//			}
//			rs.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//		return list;
//	}
//}
