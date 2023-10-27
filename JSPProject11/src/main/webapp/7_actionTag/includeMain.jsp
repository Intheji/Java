<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String outerPath1 = "./inc/outerPage1.jsp";
	String outerPath2 = "./inc/outerPage2.jsp";
	
	pageContext.setAttribute("pAttr", "그린");
	request.setAttribute("rAttr", "울산");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>디렉티브와 액션 태그의 비교</h2>
	
	<!-- 디렉티브태그 -->
	<h3>디렉티브 태그로 페이지 포함하기</h3>
	<%@ include file="./inc/outerPage1.jsp" %>
	<!-- 표현식을 사용할 수 없음 -->
	<%-- <%@ include file = "<%=outerPage1.jsp %>" %> --%>
	<p>외부 파일에 선언한 변수 : <%=newVar1 %></p>
	
	
	<!-- 액션태그 -->
	<h3>액션 태그로 페이지 포함하기</h3>
	<jsp:include page="./inc/outerPage2.jsp"/>
	<jsp:include page="<%=outerPath2 %>"></jsp:include>
	
	<!-- 흐름만 추가하므로 변수를 사용할 수 없다. -->
	<%-- <p>외부 파일에 선언한 변수 : <%=newVar2 %></p> --%>
	
</body>
</html>