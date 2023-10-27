<%@page import="utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//저장되어있는 아이디가 있으면 여기서 가져온 값이
	//아이디 입력창의 기본값으로 사용
	String loginId = CookieManager.readCookie(request, "loginId");
	
	String cookieCheck="";
	//쿠키에 저장된 아이디가 있으면
	if (!loginId.equals("")) {
		//html의 아이디 저장하기 체크박스에 checked속성을 지정
		cookieCheck="checked";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- Favicon-->
	<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
	<!-- Bootstrap icons-->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" />
	<!-- Core theme CSS (includes Bootstrap)-->
	<link href="../resource/css/styles.css" rel="stylesheet" />
	<title>Insert title here</title>
	<style>
		.login {
			padding-top : 50px;
			text-align : center;
		}
		
		.login>p {
			margin-botton: 20px;	
		}
		
		.login span{
			dispaly: inline-block;
			width: 120px;
		}
	</style>
</head>
<body>
	<%@ include file ="./header.jsp" %>
	
	<div class="login">
		<form action="idSaveProcess.jsp" method="post">
			<p><span>아이디 : </span> <input type="text" name="user_id" value="<%= loginId %>">
			<p><span>패스워드 : </span> <input type="text" name="user_pw">
			<p><input type="checkbox" name="save_check" value="Y" <%=cookieCheck %>>
				아이디 저장하기 </p>
			<input type="submit" value="로그인">
		</form>
	
	</div>
</body>
</html>



