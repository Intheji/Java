<%@page import="java.util.Collection"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//응답 헤더에 추가할 값을 준비
	
	//날짜를 초단위로 계산하여 long타입으로 변경하여 저장
	SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
	long add_date = s.parse(request.getParameter("add_date")).getTime();
	
	//폼에서 입력받은 데이터는 항상 String타입이므로 변환하여 저장
	int add_int = Integer.parseInt(request.getParameter("add_int"));
	String add_str = request.getParameter("add_str");
	
	response.addDateHeader("today", add_date);
	response.addIntHeader("number", add_int);
	response.addIntHeader("number", 1234);
	response.addHeader("name", add_str);
	response.setHeader("name", "아아아아");
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2> 응답 헤더 정보 출력하기</h2>
	<%
		Collection<String> headerNames = response.getHeaderNames();
	
		for (String hName : headerNames) {
			String hValue = response.getHeader(hName);
	%>
			<p><%= hName %> : <%=hValue%> </p>
	<%
		}
	%>
	
	<h2> number만 출력하기</h2>
	<%
		Collection<String> number = response.getHeaders("number");
	
		for (String hName : number) {
			
	%>
			<p><%= number %> : <%=hName%> </p>
	<%
		}
	%>
	
</body>
</html>