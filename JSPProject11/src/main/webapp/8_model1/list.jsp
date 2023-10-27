<%@page import="board.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="board.BoardDAO"%>
<%@page import="board.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//DAO를 생성하여 DB연결
	BoardDAO dao = new BoardDAO(application);
	
	//검색 조건을 map에 저장
	Map<String, Object> param = new HashMap<>();
	String searchField =request.getParameter("searchField");
	String searchWord = request.getParameter("searchWord");
	
	//검색어가 있으면 map에 검색과 관련된 내용을 저장
	if(searchWord != null){
		param.put("searchField",searchField);
		param.put("searchWord",searchWord);
	}
	
	//게시물 수 확인
	int totalCount = dao.selectCount(param);
	
	//게시글 목록 받기
	List<BoardDTO> boardLists = dao.selectList(param);
	
	dao.close();

%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="./link.jsp" />
	
	<h2>게시글 목록보기</h2>
	
	<form method="get">
	
		<!-- 검색창 -->
		<table border="1" width="90%">
			<tr>
				<td>
					<select name="searchField">
						<option value="title">제목</option>
						<option value="content">내용</option>
					</select>
					<input type = "text" name="searchWord">
					<input type = "submit" name="검색하기">
					
				</td>
			</tr>
		</table>
		
		<!-- 게시글 목록 표시 -->
		<table border="1" width="90%">
			<tr>
				<th width="10%">번호</th>
				<th width="50%">제목</th>
				<th width="15%">작성자</th>
				<th width="10%">조회수</th>
				<th width="15%">작성일</th>
			</tr>
			
			<!-- 게시글 목록표시 -->
			<%if(boardLists.isEmpty()){ %>
				<!-- 게시글이 하나도 없을때 -->
				<tr>
					<td colspan="5" align="center">등록된 게시글이 없습니다</td>
				</tr>
					
			<% }else{
				//-- 게시글이 있을때
					int virtualNum=0;//화면에 표시하기 위한 번호
					for(BoardDTO dto : boardLists){
						virtualNum = totalCount--;
			%>
						<tr>
							<td align="center"><%=virtualNum %></td>
							<td><a href ="view.jsp?num=<%=dto.getNum() %>"><%=dto.getTitle() %></a></td>
							<td align="center"><%=dto.getId() %></td>
							<td align="center"><%=dto.getVisitcount() %></td>
							<td align="center"><%=dto.getPostdate() %></td>
						</tr>
			<% 		}
				} %>
		</table>
		
		<!-- 글쓰기 -->
		<table border="1" width="90%">
			<tr align=right>
				<td>
					<button type="button" onclick="location.href='write.jsp'">글쓰기</button>
				</td>
		</table>
		
		
		
	</form>
</body>
</html>