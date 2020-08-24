
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
<%
	BoardDAO dao=new BoardDAO();
	ArrayList<BoardVO> list=dao.boardAlldata();
%>
<%--no,subject,name,regdate,hit --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="table.css">
</head>
<body>
	<center>
	<h1>jsp_board</h1>
	<table border=1 whidth=800 id="user-table">
		<tr>
			<td>번호</td>
			
			<td>제목</td>
			<td>글쓰이</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<tbody>
		
		 <%
         for(BoardVO vo:list)
         {
      %>
            <tr>
              <td width=10% class="tdcenter"><%=vo.getNo() %></td>
              <td width=45% class="tdleft"><%=vo.getSubject() %></td>
              <td width=15% class="tdcenter"><%=vo.getName() %></td>
              <td width=20% class="tdcenter"><%=vo.getRegdate().toString() %></td>
              <td width=10% class="tdcenter"><%=vo.getHit() %></td>
            </tr>
      <%
         }
      %>
		
		</tbody>
	</table>
	</center>
</body>
</html>