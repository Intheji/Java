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
	int myAge = Integer.parseInt(request.getParameter("age")) + 10; //오류발생
	out.println("10년 후 나이 : " + myAge);

%>
</body>
</html>




