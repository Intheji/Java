<%@page import="board.BoardDAO"%>
<%@page import="board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 실제 게시글을 등록할 때에도 로그인 상태가 맞는지 확인 -->
<%@ include file="./isLoggedIn.jsp" %>

<%
	//폼값을 받아옴
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	
	//받아온 폼 값을 DTO객체에 저장
	BoardDTO dto = new BoardDTO();
	dto.setTitle(title);
	dto.setContent(content);
	
	//로그인 되어 있는 아이디를 가져와 글 작성자의 아이디로 저장
	dto.setId(session.getAttribute("UserId").toString());
	
	//DAO를 이용하여 DB에 저장
	BoardDAO dao = new BoardDAO(application);
	int iResult = dao.insertWrite(dto);
	dao.close();
	
	//게시글 등록에 성공 또는 실패
	if (iResult == 1) {
		response.sendRedirect("list.jsp");
	} else {
		JSFunction.alertBack("글쓰기에 실패하였습니다.", out);
	}
%>