<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	ArrayList<String> lists = new ArrayList<String>();
	lists.add("jsp");
	lists.add("프로그래밍");
	
	session.setAttribute("lists", lists);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 페이지 이동 후 session영역 읽어오기</h2>
	<a href="sessionLocation.jsp"> sessionLocation.jsp 바로가기</a>
</body>
</html>


