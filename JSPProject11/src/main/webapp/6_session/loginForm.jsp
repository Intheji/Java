<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../8_model1/link.jsp"></jsp:include>

	<h2>로그인 페이지</h2>
	
	<!-- 로그인에 실패했을 때 상태를 설명 -->
	<span style="color:red; font-size:15px;">
		<%=request.getAttribute("LoginErrMsg") == null?
				"" : request.getAttribute("LoginErrMsg")%>
	</span>
	
	<!-- 로그인 상태 확인 -->
	<%
	//로그인을 안했을 때
	if (session.getAttribute("UserId") == null) {
	%>
	
	<script>
		function validateForm(form) {
			if (!form.user_id.value) {
				alert("아이디를 입력하세요!");
				return false;
			}
			if (!form.user_pw.value) {
				alert("패스워드를 입력하세요!");
				return false;
			}
		}
	</script>
	
	<form action="loginProcess.jsp" method="post" name="loginFrm" onsubmit="return validateForm(this);">
		아이디 : <input type="text" name="user_id"> <br>
		패스워드 : <input type="password" name ="user_pw"><br>
		<input type="submit" value="로그인">
	</form>
	
	<% 
	} else {	//로그인이 되어있는 상태
	%>
		<%=session.getAttribute("UserName") %>님, 로그인하셨습니다.
		 <a href="logout.jsp">[로그아웃]</a>
	
	<%	
	}
	%>
	
	
</body>
</html>