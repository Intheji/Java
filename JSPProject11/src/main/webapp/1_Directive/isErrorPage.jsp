<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!-- isErrorPage를 true로 지정해야만 발생된 에러 내용을 그대로 받아옴-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>서비스 중 일시적인 오류가 발생하였습니다.</h2>
	
	<p>
		오류명 : <%=exception.getClass().getName() %> <br>
		오류메시지 : <%=exception.getMessage() %>
	</p>
</body>
</html>



