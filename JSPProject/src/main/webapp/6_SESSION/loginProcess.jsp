<%@page import="membership.MemberDTO"%>
<%@page import="membership.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//로그인 폼에서 아이디랑 패스워드를 가져옴
	String userId = request.getParameter("user_id");
	String userPwd = request.getParameter("user_pw");
	
	String oracleDriver = application.getInitParameter("OracleDriver");
	String oracleURL = application.getInitParameter("OracleURL");
	String oracleId = application.getInitParameter("OracleId");
	String oraclePwd = application.getInitParameter("OraclePwd");
	
	
	//생성자를 통해 DB연결
	MemberDAO dao = new MemberDAO(oracleDriver, oracleURL, oracleId, oraclePwd);
	
	//아이디와 패스워드를 이용하여 db에서 데이터 확인
	MemberDTO dto = dao.getMemberDTO(userId, userPwd);
	
	//db 연결 종료
	dao.close();
	
	//dto객체에 아이디가 저장되어 있으면 
	if (dto.getId() != null) {
		//로그인에 성공
		//session영역에 아이디와 이름을 저장
		session.setAttribute("UserId", dto.getId());
		session.setAttribute("UserName", dto.getName());
		
		//로그인 페이지로 이동
		response.sendRedirect("loginForm.jsp");
	} else {
		//로그인 실패
		request.setAttribute("LoginErrMsg", "로그인 오류입니다.");
		request.getRequestDispatcher("loginForm.jsp").forward(request, response);
	}
	
%>