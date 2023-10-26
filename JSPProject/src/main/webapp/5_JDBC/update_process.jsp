<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="common.JDBConnect"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//DB연결
		JDBConnect jdbc = new JDBConnect();
	
		//한글 인코딩
		request.setCharacterEncoding("utf-8");
	
		//폼에서 입력한 값 가져오기 
		String before = request.getParameter("before_depart");
		String after = request.getParameter("after_depart");
		
		//sql문 생성
		String sql = "select * from student where depart=?";	//사용자가 어떤 값을 입력하냐에 따라서 달라진다 모두 다 전체 선택
		
		//jdbc를 이용하기 위한 객체 생성
		//인파라미터가 있으니까 생성을 해야 된다
		PreparedStatement pstmt = jdbc.con.prepareStatement(sql);
		
		//인파라미터에 값을 대입
		pstmt.setString(1, before);	//select엔 조회를 해야 되니까
		ResultSet rs = pstmt.executeQuery();	//select는 excuteQuery를 사용한다
		
		//이제 하나하나를 비교해야 된다 해당하는 내용만 바꿔야 되니까
		//회원은 아이디가 기본키이기 때문에 데이터가 하나만 있으니까 굳이 while 안 쓰고 if를 써도 된다
		//제목 이외에 데이터는 없다
		if (rs.next()) {
			String depart = rs.getString("depart");
			//이제 확인을 한다
			if (before.equals(depart)) {
				sql = "update student set depart=? where depart=?";
				//재사용
				pstmt = jdbc.con.prepareStatement(sql);
				pstmt.setString(1, after); //변경할 내용이 들어간다
				pstmt.setString(2, before); //변경 전 내용
				pstmt.executeUpdate();
				out.println("student테이블을 변경하였습니다.");
			} else { //내용을 찾지 못하면
				out.println("student테이블을 변경하는데 실패하였습니다.");
			}
		} else {
			out.println("student테이블에 일치하는 학과가 없습니다.");
		}
		
		//연결 종료
		jdbc.close();
	%>
</body>
</html>