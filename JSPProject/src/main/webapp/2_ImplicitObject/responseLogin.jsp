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
		request.setCharacterEncoding("UTF-8");
	
		String id = request.getParameter("user_id");
		String pwd = request.getParameter("user_pwd");
		
		if (id.equals("test") && pwd.equals("1234")) {
			//로그인 성공
			response.sendRedirect("responseWelcome.jsp");
		} else {
			//로그인 실패
			request.getRequestDispatcher("responseMain.jsp?loginErr=1").forward(request, response); //제어의 흐름 전달
		}
	%>
</body>
</html>