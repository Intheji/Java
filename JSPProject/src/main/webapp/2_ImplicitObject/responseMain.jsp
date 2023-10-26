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
		String loginErr = request.getParameter("loginErr");
	
		if (loginErr != null) {
			out.println("로그인 실패");
		} 
		
	%>

	<form action="responseLogin.jsp" method="post"> <!-- 쿼리스트림에 올려서 하는 게 더 빠르다 -->
		아이디 : <input type="text" name="user_id"> <br>
		패스워드 : <input type="text" name="user_pwd"> <br>
		<input type="submit" value="로그인">
	</form>
	
	<br><br>
	<h2>2. HTTP응답 헤더 설정하기</h2>
	<form action="responseHeader.jsp" method="get">
	날짜 형식 : <input type="text" name="add_date" value="2023-10-23 16:15"><br>
	날짜 형식 : <input type="text" name="add_int" value="1234"><br>
	날짜 형식 : <input type="text" name="add_str" value="하하하하"><br>
	<input type="submit" value="응답 헤더 설정 및 출력"></form>
</body>
</html>