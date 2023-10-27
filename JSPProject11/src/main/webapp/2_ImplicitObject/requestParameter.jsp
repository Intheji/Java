<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%
		//한글 깨짐 방지
		request.setCharacterEncoding("UTF-8");
	
		//전송되는 값이 하나인 경우에는 getParameter()메서드로 값을 받아옴
		String id=request.getParameter("id");
		String gender = request.getParameter("gender");
		
		//전송되는 값이 여러개인 경우에는
		//getParameterValues()메서드로 값을 받아옴
		String[] hobby = request.getParameterValues("hobby");
		String hobbyStr = "";
		
		for (int i=0; i<hobby.length; i++) {
			hobbyStr += hobby[i] + " ";
		}
		
		String intro = request.getParameter("intro").replace("\r\n", "<br>");
	%>
	
	<ul>
		<li>아이디 : <%=id %></li>
		<li>성별 : <%=gender %></li>
		<li>취미 : <%=hobbyStr %></li>
		<li>자기소개 : <%=intro %></li>
	</ul>
	
</body>
</html>



