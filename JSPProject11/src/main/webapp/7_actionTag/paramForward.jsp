<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="common.Person" scope="request"/>
	
	<h2>포워드된 페이지에서 매개변수 확인하기</h2>
	<ul>
		<li>이름 : <jsp:getProperty name="person" property="name" /></li>
		<li>나이 : <jsp:getProperty name="person" property="age" /></li>
		<li>친구 이름 : <%=request.getParameter("param1") %> </li>
		<li>직업 : <%=request.getParameter("param2") %></li>
		<li>전공 : <%=request.getParameter("param3") %></li>
	</ul>
	
	<jsp:include page="inc/paramInclude.jsp">
		<jsp:param name="loc1" value="울산 남구" />
		<jsp:param name="loc2" value="그린컴퓨터아카데미" />
	</jsp:include>
</body>
</html>