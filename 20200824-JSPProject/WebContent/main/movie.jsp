<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
<%
	MusicDAO dao=new MusicDAO();
	ArrayList<MovieVO> list=dao.movieAllData();
%>
<%--
	private int no;
	private String title;
	private String poster;
	private String actor;
	private String director;
	 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1>Daum Movie</h1>
	<table width=800>
			<tr>
				<td>
					<input type=text id=keyword size=25>
				</td>
			</tr>
		</table>
		<table border=1 width=800 id="user-table">
			<tr>
				<th>번호</th>
				<th></th>
				<th>제목</th>
				<th>감독</th>
				<th>출연</th>
			</tr>
		<tbody>
		<%
			for(MovieVO vo:list)
			{
		%>
				<tr>
					<td><%=vo.getNo() %></td>
					<td>
					<img src=<%=vo.getPoster() %> width=30 height=30>
					</td>
					<td><%=vo.getTitle() %></td>
					<td><%=vo.getDirector() %></td>
					<td><%=vo.getActor() %></td>	
				</tr>
		<% 
			}
		%>
		</tbody>
		</table>
	</center>
</body>
</html>