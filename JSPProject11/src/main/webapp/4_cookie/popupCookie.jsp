<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<% 
	//오늘 하루 열지 않음을 체크하면 1을 전달받음
	String chkVal = request.getParameter("inactiveToday");

	if (chkVal != null && chkVal.equals("1")) {
		Cookie cookie = new Cookie("PopupClose", "off"); //쿠키생성
		cookie.setPath(request.getContextPath()); //경로 설정
		cookie.setMaxAge(60*60*24); //유지시간설정(하루)
		response.addCookie(cookie);
		
		out.println("쿠키 : 하루동안 열지 않음");
	}
%>
    