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
		String num = request.getParameter("num");	
		String depart = request.getParameter("depart");	
		String name = request.getParameter("name");	
		String address = request.getParameter("address");	
		String phone = request.getParameter("phone");
		
		//sql문 생성
		String sql = "insert into student values(?,?,?,?,?)"; 
		
		//jdbc를 이용하기위한 객체 생성
		PreparedStatement pstmt= jdbc.con.prepareStatement(sql);
		
		//인파라미터에 값을 대입
		pstmt.setString(1, num);
		pstmt.setString(2, depart);
		pstmt.setString(3, name);
		pstmt.setString(4, address);
		pstmt.setString(5, phone);
		
		//쿼리 실행
		pstmt.executeUpdate();
		out.println("student테이블에 데이터를 저장하였습니다.");
		
		//연결 종료
		jdbc.close();
	%>
</body>
</html>


