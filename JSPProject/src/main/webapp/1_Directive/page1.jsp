<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%> <!-- 페이지소스 보기에서 공백 없애는 역할 -->
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 스크립 틀릿, 여기서부터 자바 코드를 쓰겠다는 뜻 -->
	<%
		 Date today = new Date();
		 SimpleDateFormat dateFormat = new SimpleDateFormat ("yyyy-MM-dd");
		 String todayStr = dateFormat.format(today);
		 out.println("오늘 날짜 : " + todayStr);
	%>
</body>
</html>