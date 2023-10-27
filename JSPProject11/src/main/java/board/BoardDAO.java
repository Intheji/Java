package board;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;


import common.JDBConnect;

//DAO : 데이터베이스에 접근하여 CRUD를 수행하기 위한 객체
public class BoardDAO extends JDBConnect{
	
		//생성자를 이용하여 DB연결
		public BoardDAO(ServletContext application) {
			super(application);
		}
		
		//board테이블에 저장된 게시글의 개수를 반환
		public int selectCount(Map<String, Object> map) {
			int totalCount = 0;
			
			String query = "SELECT COUNT (*) FROM board";
			
			//SELECT COUNT(*) FROM board WHERE title LIKE '%안녕%';
			//검색어가 있는 경우 where절이 추가되도록 설정
			if(map.get("searchWord") != null) {
				query += " WHERE " + map.get("searchField")	//한 칸 공백으로 둬야 된다
						+ " LIKE '%" + map.get("searchWord") + "%'";
			} 
			
			try {
				//쿼리문 생성
				stmt = con.createStatement();
				
				//executeQuery는 결과를 ResultSet객체로 반환
				rs = stmt.executeQuery(query);
				
				//ResultSet의 결과를 첫 번째 행으로 이동
				rs.next();
				
				//첫 번째 열의 값을 가져옴
				totalCount = rs.getInt(1);
				
			} catch (Exception e) {
				System.out.println("게시물 개수를 구하는 중 예외 발생");
				e.printStackTrace();
				
			}
			
			return totalCount;
		}
		
		//board테이블의 레코드를 가져와 반환
		public List<BoardDTO> selectList(Map<String, Object> map) {
			
			List<BoardDTO> bbs = new ArrayList<BoardDTO>();
			
			String query = "SELECT * FROM board";
			
			//SELECT COUNT(*) FROM board WHERE title LIKE '%안녕%';
			//검색어가 있는 경우 where절이 추가되도록 설정
			if(map.get("searchWord") != null) {
				query += " WHERE " + map.get("searchField")	//한 칸 공백으로 둬야 된다
						+ " LIKE '%" + map.get("searchWord") + "%'";
			} 
			
			query += " ORDER BY num DESC";
			
			try {
				stmt = con.createStatement();
				
				rs = stmt.executeQuery(query);
				
				//게시물에 있는 만큼 뿌림
				while(rs.next()) {
					BoardDTO dto = new BoardDTO();
					
					dto.setNum(rs.getString("num"));
					dto.setTitle(rs.getString("title"));
					dto.setContent(rs.getString("content"));
					dto.setId(rs.getString("id"));
					dto.setPostdate(rs.getDate("postdate"));
					dto.setVisitcount(rs.getString("visitcount"));
					
					//list에 데이터를 추가
					bbs.add(dto);
				}
				
			} catch (Exception e) {
				System.out.println("게시물 조회 중 예외 발생");
				e.printStackTrace();
			}
			
			return bbs;
		}
		
		//게시물 추가 메서드
		public int insertWrite(BoardDTO dto) {
			int result = 0;
			
			String query = "INSERT INTO board" 
							+ " (num, title, content, id, visitcount)"
							+ " VALUES"
							+ " (seq_board_num.nextval, ?, ?, ?, 0)";
			
			try {
				pstmt = con.prepareStatement(query);
				
				pstmt.setString(1, dto.getTitle());
				pstmt.setString(2, dto.getContent());
				pstmt.setString(3, dto.getId());
				
				result = pstmt.executeUpdate();
				
			} catch (Exception e) {
				System.out.println("게시물 등록 중 예외 발생");
				e.printStackTrace();
			}
			
			return result;
		}
		
		
}
