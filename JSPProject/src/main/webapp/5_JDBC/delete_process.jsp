<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//DB연결
		JDBConnect jdbc = new JDBConnect();
		
		//한글 인코딩
		request.setCharacterEncoding("utf-8");
	
		//폼에서 입력한 값 가져오기
		String depart = request.getParameter("depart");
		
		//sql문 생성
		String sql = "select * from student where depart=?";
		
		//jdbc를 이용하기 위한 객체 생성
		PreparedStatement pstmt = jdbc.con.prepareStatement(sql);
		
		//인파라미터에 값을 대입
		pstmt.setString(1, depart);
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			
			String depart2 = rs.getString("depart");
			
			if (depart.equals(depart2)) {
				sql = "delete from student where depart=?";
				pstmt = jdbc.con.prepareStatement(sql);
				
				pstmt.setString(1, depart);
				pstmt.executeUpdate();
				out.println ("Student 테이블에서 데이터를 삭제하였습니다.");
			} else {
				out.println ("Student 테이블에서 데이터 삭제에 실패하였습니다.");
			}
		}
		
		//연결 종료
		jdbc.close();
	%>
</body>
</html>