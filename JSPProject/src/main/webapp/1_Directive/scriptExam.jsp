<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 선언부에 작성한 변수는 전역변수 -->
	<%! int a = 1; %>
	
	<%
		//스크립틀릿 내부에서만 사용 가능한 지역변수로 설정
		int b = 2;
		out.println("a : " + a++);
		out.println("b : " + b++);
		
	%> <!-- 선언부 -->
	<p> a: <%=a %> </p>
	<p> b: <%=b %> </p>
</body>
</html>