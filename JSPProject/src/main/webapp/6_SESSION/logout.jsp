<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//방법1. 회원 인증 정보에 대한 속성을 삭제 
	session.removeAttribute("UserId");
	session.removeAttribute("UserName");
	
	//방법2. 모든 속성을 한꺼번에 삭제
	//invalidate() : 세션 자체를 무효화시킴
	session.invalidate();
	
	//로그인 페이지로 이동
	response.sendRedirect();
	
%>