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
			//페이지 이동(자바스크립트의 location.href와 같은 기능)
			response.sendRedirect("responseWelcome.jsp");
		} else {
			//로그인 실패
			request.getRequestDispatcher("responseMain.jsp?loginErr=1").forward(request, response);
		}
	%>
</body>
</html>


