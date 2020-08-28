<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
<%
String strPage=request.getParameter("page");
if(strPage==null)
	 strPage="1";
int curpage=Integer.parseInt(strPage);


MovieDAO dao=new MovieDAO();
int totalpage = dao.movieTotalPage();
ArrayList<MovieVO> list = dao.movieAllData(curpage);
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
<link rel="stylesheet" href="table.css">
</head>
<body>
	<center>
	<h1>Daum Movie</h1>
		<table class="table_content" width=700>
		<tr>
			<th width=10%>번호</th>
        	<th width=10%>포스터</th>
       		<th width=45%>제목</th>
       		<th width=15%>감독</th>
        	<th width=20%>출연</th>
		</tr>
		<%
			for(MovieVO vo:list)
			{
		%>
				<tr>
					<td width=10% class="tdcenter"><%=vo.getNo() %></td>
					<td>
					<img src=<%=vo.getPoster() %> width=30 height=30>
					</td>
					<td width=10% class="tdcenter"><%=vo.getTitle() %></td>
					<td width=10% class="tdcenter"><%=vo.getDirector() %></td>
					<td width=10% class="tdcenter"><%=vo.getActor() %></td>
				</tr>
		<% 
			}
		%>
		
		</table>
		<table class="table_content" width=700>
      	<tr>
        <td align=left></td>
        <td align="right">
          <a href="movie.jsp?page=<%=curpage>1?curpage-1:curpage%>">이전</a>
          <%=curpage %> page / <%=totalpage %> pages
          <a href="movie.jsp?page=<%=curpage<totalpage?curpage+1:curpage%>">다음</a>
        </td>
      </tr>
    </table>
	</center>
</body>
</html>