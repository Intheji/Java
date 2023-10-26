<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>1. 쿠키 설정하기</h2>
	<%
		Cookie cookie = new Cookie("myCookie", "쿠키냠냠");
		cookie.setPath(request.getContextPath());	// 경로를 컨텍스트 루트로 설정
		cookie.setMaxAge(3600); // 유지시간 1시간
		response.addCookie(cookie); // 응답 헤더에 쿠키를 추가
	%>
	
	<h2>2. 쿠키 확인하기</h2>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (Cookie c : cookies) {
				String cookieName = c.getName();
				String cookieValue = c.getValue();
				out.print(String.format("%s / 쿠키값 : %s <br>", cookieName, cookieValue));
			}
			// 새로고침하면 밑에 뜸
		}
	%>
	
	<h2>3. 페이지 이동 후 쿠키값 확인하기</h2>
	<a href="cookieResult.jsp">링크를 통해 쿠키값 확인하기</a>
</body>
</html>