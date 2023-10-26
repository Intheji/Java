<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
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
	<table border="1">
		<tr>
			<th>학번</th>
			<th>학과</th>
			<th>이름</th>
			<th>주소</th>
			<th>전화번호</th>
		</tr>
	<%
		/* 표로 출력해 보기 */
		//DB연결
		JDBConnect jdbc = new JDBConnect();
	
		//한글 인코딩 근데 난 왜 안 깨지지? 
		request.setCharacterEncoding("utf-8");
		
		//쿼리문 생성
		String sql = "select num, depart, name, address, phone from student";
		
		//쿼리문 실행하기 위한 객체를 생성
		Statement stmt = jdbc.con.createStatement();
		
		//쿼리 실행
		ResultSet rs = stmt.executeQuery(sql);
		
		//결과를 출력
		while(rs.next()) {
			String num = rs.getString("num");
			String depart = rs.getString("depart");
			String name = rs.getString("name");
			String address = rs.getString("address");
			String phone = rs.getString("phone");
		%>
		
		<!-- 자바코드를 쪼개서 넣어준다 -->
		<tr>
			<td><%=num %></td>
			<td><%=depart %></td>
			<td><%=name %></td>
			<td><%=address%></td>
			<td><%=phone %></td>
		</tr>
	
		
		
		<%
		}
			/* out.println(num + " / " + depart + " / " + name + " / " + address + " / " + phone + "<br>");
		} */
		
		//연결 종료
		jdbc.close();
	%>
	
	</table>
</body>
</html>