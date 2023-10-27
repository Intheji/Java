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
		Cookie cookie = new Cookie("myCookie", "쿠키냠냠"); //쿠키생성
		cookie.setPath(request.getContextPath()); //경로를 컨텍스트 루트로 설정
		cookie.setMaxAge(3600); //유지시간 1시간
		response.addCookie(cookie); //응답 헤더에 쿠키를 추가
	%>
	
	<h2>2. 쿠키 확인하기</h2>
	<%
		Cookie[] cookies = request.getCookies(); //요청 헤더에 있는 모든 쿠키 확인
		if (cookies != null) { 
			for (Cookie c : cookies) {	
				String cookieName = c.getName();	//쿠키 이름 가져오기
				String cookieValue = c.getValue();	//쿠기 값 가져오기
				out.print(String.format("%s : %s <br>", cookieName, cookieValue));
						
			}
		}
	%>
	
	<h2>3. 페이지 이동 후 쿠키값 확인하기</h2>
	<a href="cookieResult.jsp"> 링크를 통해 쿠키값 확인하기</a>
</body>
</html>
