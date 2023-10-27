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
		int status = response.getStatus(); //에러코드 확인
		
		if (status == 404){
			out.print("404 에러 발생 <br>");
			out.print("파일 경로를 확인해주세요");
		} else if (status == 405){
			out.print("405 에러 발생 <br>");
			out.print("요청 방식(method)을 확인해주세요");
		} else if (status == 500){
			out.print("500 에러 발생 <br>");
			out.print("소스코드를 확인해주세요");
		} 
	%>
</body>
</html>