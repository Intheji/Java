<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>액션 태그로 폼 데이터 한번에 받아오기</h3>
	<jsp:useBean id="person" class="common.Person" />
	<jsp:setProperty name="person" property="*" />	<!-- *는 모든 속성을 다 들고 오는 것 -->
	<ul>
		<li>이름 : <jsp:getProperty name="person" property="name" /> </li>
		<li>나이 : <jsp:getProperty name="person" property="age"/> </li>	
	</ul>
</body>
</html>