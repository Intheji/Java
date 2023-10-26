<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 클라이언트 서버의 환경정보 읽어오기</h2>
	<!-- get 방식으로 요청 -->
	<a href="requestInfo.jsp?eng=hello&kor=안녕">
		GET 방식으로 전송
	</a>
	
	<!-- post 방식으로 요청 -->
	<form action="requestInfo.jsp" method="post">
		영어 : <input type="text" name="eng" value="bye"><br>
		한글 : <input type="text" name="kor" value="잘가"><br>
		<input type="submit" value="POST 방식으로 전송">
	</form>
	
	<h2>2. 클라이언트의 요청 매개변수 읽어오기</h2>
	<form method="post" action="requestParameter.jsp">
		아이디 : <input type="text" name="id" value=""> <br>
		성별 :
			<input type="radio" name="gender" value="man"> 남자
			<input type="radio" name="gender" value="woman"> 여자
		<br>
		관심사항 :
			<input type="checkbox" name="hobby" value="game">게임
			<input type="checkbox" name="hobby" value="sports">운동
			<input type="checkbox" name="hobby" value="tour">여행
		<br>
		자기소개 : 
			<textarea name="intro" rows="10" cols="10"></textarea>
		<br>
		<input type="submit" value="전송하기">
	</form>
	
	<br><br>
	
	<h2>3. Http요청 헤더 정보 읽어오기</h2>
	<a href="requestHeader.jsp">헤더 정보 읽기</a>
</body>
</html>