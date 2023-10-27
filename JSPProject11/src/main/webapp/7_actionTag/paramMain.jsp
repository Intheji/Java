<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String pValue="자바";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="common.Person" scope="request"/>
	<jsp:setProperty name="person" property="name" value="김그린" />
	<jsp:setProperty name="person" property="age" value="22" />
	<jsp:forward page="paramForward.jsp?param1=정제이">
		<jsp:param name="param2" value="학생"/>
		<jsp:param name="param3" value="<%=pValue %>"/>
	</jsp:forward>
</body>
</html>