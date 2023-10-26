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
	<h2>회원 추가 테스트</h2>
	<%
		//DB연결
		JDBConnect jdbc = new JDBConnect();
	
		//테스트용 데이터 준비
		String id = request.getParameter("id");
		String pass = request.getParameter("pw");
		String name = request.getParameter("name");
		
		//쿼리문
		// ? : 인파라미터. 정확한 값은 나중에 채우겠다라는 의미
		String sql = "INSERT INTO member VALUES (?, ?, ?, sysdate)";
		
		//Connection 객체를 이용하여 PreparedStatement객체를 생성
		PreparedStatement pstmt = jdbc.con.prepareStatement(sql);
		
		//인파라미터에 실제 값을 대입
		pstmt.setString(1, id);
		pstmt.setString(2, pass);
		pstmt.setString(3, name);
		
		//쿼리 실행
		//executeUpdate() : insert, update, delete에서 사용
		//					실행 건수가 리텀
		int inResult = pstmt.executeUpdate();
		
		out.println(inResult + "행이 입력되었습니다.");
		
		//연결 닫기
		jdbc.close();
		
	%>
</body>
</html>