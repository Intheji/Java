<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%!
	int pageCount= 0;

	void addCount() {
		pageCount++;
	}
%>
<%
	addCount();
%>
<p> 반갑습니다! <%=pageCount %>번째 방문입니다.</p>

