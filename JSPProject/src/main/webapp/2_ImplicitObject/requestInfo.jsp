<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>클라이언트와 서버의 환경정보 확인하기</h2>
	<!-- 0:0:0:0:0:0:0:1 로컬호스트로 접속하면 기본 ip주소를 출력
	     IPv4인 경우 127.0.0.1로 출력 -->
	<p>클라이언트IP : <%=request.getRemoteAddr() %></p>
	<p>요청 정보 길이 : <%=request.getContentLength() %></p>
	<p>요청 정보 인코딩 : <%=request.getCharacterEncoding() %></p>
	<p>요청 정보 콘텐츠 유형 : <%=request.getContentType() %></p>
	<p>요청 정보 프로토콜 : <%=request.getProtocol() %></p>
	
	<!-- Form의 method를 post로 설정 이외는 대부분 get -->
	<p>요청정보(데이터)전송방식 : <%=request.getMethod() %></p>
	
	<!-- URL과 URI의 차이점 : 호스트 포함 여부 -->
	<p>요청 URL : <%=request.getRequestURL() %></p>
	<p>요청 URI : <%=request.getRequestURI() %></p>
	
	<!-- 컨텍스트 경로 : 프로젝트명 -->
	<p>컨텍스트 경로 : <%=request.getContextPath() %></p>
	<p>서버 이름 : <%=request.getServerName() %></p>
	<p>서버 포트 : <%=request.getServerPort() %></p>
	<p>쿼리 스트링 : <%=request.getQueryString() %></p>
	<p>전송된 값 1 : <%=request.getParameter("eng") %></p>
	<p>전송된 값 2 : <%=request.getParameter("kor") %></p>
</body>
</html>