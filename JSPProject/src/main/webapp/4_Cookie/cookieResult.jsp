<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>쿠키값 확인하기(쿠키가 생성된 이후의 페이지)</h2>
	<%
		Cookie[] cookies = request.getCookies();	//요청 헤더에 있는 모든 쿠키 확인
		if (cookies != null) {
			for (Cookie c : cookies) {
				String cookieName = c.getName();	//쿠키 이름 가져오기
				String cookieValue = c.getValue();	//쿠키 값 가져오기
				out.print(String.format("쿠키명 : %s : %s <br>", cookieName, cookieValue));
			}
			// 새로고침하면 밑에 뜸
		}
	%>
</body>
</html>