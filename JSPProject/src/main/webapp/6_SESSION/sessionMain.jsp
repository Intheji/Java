<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");		//대문자 HH로 쓰면 0부터 24시까지 소문자 hh로 쓰면 0부터 12시까지 표시
	
	//세션을 생성한 시각
	long creationTime = session.getCreationTime();
	String creationTimeStr = dateFormat.format(new Date(creationTime));
	
	//마지막으로 요청한 시각
	long lastTime = session.getLastAccessedTime();
	String lastTimeStr = dateFormat.format(new Date(lastTime));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>session 설정 확인</h2>
	<ul>
		<li>세션 유지 시간 : <%=session.getMaxInactiveInterval() %></li>
		<li>세션 아이디 : <%=session.getId() %></li>
		<li>최초 요청 시각 : <%=creationTimeStr %></li>
		<li>마지막 요청 시각 : <%=lastTimeStr %></li>
	</ul>
</body>
</html>