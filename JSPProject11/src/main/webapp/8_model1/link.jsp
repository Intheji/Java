<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1" width="90%">
		<tr>
			<td align="center">
				<!-- 로그인 여부에 따라서 메뉴를 다르게 표시 -->
				<% if (session.getAttribute("UserId") == null) { %>
				
					<a href="../6_session/loginForm.jsp"> [로그인] </a>
					
				<% } else { %>
				
					<a href="../6_session/logout.jsp"> [로그아웃] </a>
					
				<% } %>
				&nbsp;
				&nbsp;
				&nbsp;
				
				<!-- 게시판으로 이동하는 링크 -->
				<a href="../8_model1/list.jsp">게시판</a>
			</td>
		</tr>
	</table>
</body>
</html>