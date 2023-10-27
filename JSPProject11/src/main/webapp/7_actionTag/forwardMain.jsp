<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
	pageContext.setAttribute("pAttr", "컴퓨터");
	request.setAttribute("rAttr", "캠");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>액션 태그를 이용한 포워드 확인</h2>
	<jsp:forward page="/7_actionTag/forwardSub.jsp"/>
</body>
</html>