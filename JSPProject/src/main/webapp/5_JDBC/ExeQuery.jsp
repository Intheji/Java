<%@page import="java.sql.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
	<h2> 회원 목록 조회 테스트(executeQuery() 사용) </h2>
	
	<!-- DB연결 -->
	<%
		JDBConnect jdbc = new JDBConnect();
	
		String sql = "SELECT id, pass, name, regidate FROM member";
		
		Statement stmt = jdbc.con.createStatement();
		
		//4. 쿼리 실행
		ResultSet rs = stmt.executeQuery(sql);
		
		//5. 결과 확인
		//무조건 순서를 맞춰서 써야 된다
		while(rs.next()) {
			String id = rs.getString("id");    //이런 식으로 써도 된다
			String pw = rs.getString(2);
			String name = rs.getString(3);
			Date regidate = rs.getDate(4);
			
			out.println(String.format("%s %s %s %s", id, pw, name, regidate) + "<br>");
			
		}
		
		jdbc.close();
	%>
</body>
</html>