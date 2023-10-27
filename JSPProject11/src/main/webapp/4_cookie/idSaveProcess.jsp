<%@page import="utils.JSFunction"%>
<%@page import="utils.CookieManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String user_id = request.getParameter("user_id");
	String user_pw = request.getParameter("user_pw");
	String save_check = request.getParameter("save_check");
	
	if ("green".equals(user_id) && "1234".equals(user_pw)) {
		//로그인 성공
		
		if (save_check != null && save_check.equals("Y")) {
			//user_id값으로 쿠키를 생성
			CookieManager.makeCookie(response, "loginId", user_id, 86400);
		
		} else {
			//user_id값으로 생성된 쿠키를 삭제함
			CookieManager.deleteCookie(response, "loginId");
		}
		
		JSFunction.alertLocation("로그인에 성공하였습니다.", "index.jsp", out);
	} else {
		//로그인 실패
		JSFunction.alertBack("로그인에 실패하였습니다.", out);
	}
%>