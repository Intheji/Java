<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" buffer="1kb" autoFlush="true"%> <!-- buffer가 1kb가 되면 비울지 안 비울지 결정 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//10byte를 100번 반복
		for (int i=1; i<=100; i++) {
			out.println("abcde12345");
		}
	%>
</body>
</html>