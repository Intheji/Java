<%@page import="common.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	request.setAttribute("requestString", "request 영역의 문자열");
	request.setAttribute("requestPerson", new Person("정디비", 33));

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>request 영역의 속성값 삭제하기</h2>
	<%
		request.removeAttribute("requestString");
		request.removeAttribute("requestInteger"); //에러 없음
	%>
	
	<h2>request 영역의 속성값 읽기</h2>
	<%
		Person rPerson = (Person) (request.getAttribute("requestPerson"));
	%>
	
	<ul>
		<li>String 객체 : <%=request.getAttribute("requestString") %></li>
		<li>Person 객체 : <%=rPerson.getName() %>, <%=rPerson.getAge() %> </li>
	</ul>
	
	<h2> 포워드된 페이지에서 request 영역의 속성값 읽어오기</h2>
	<%
		//request.getRequestDispatcher("requestForward.jsp?han=한글&eng=English").forward(request, response);
	%>
</body>
</html>