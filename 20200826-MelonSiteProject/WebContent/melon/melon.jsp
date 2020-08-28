<%@page import="com.sist.manager.MelonVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.sist.dao.MelonDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//$$이전,다음
	String strPage=request.getParameter("page");
	if(strPage==null)//strPage가 없다면
	{
		strPage="1"; //기본으로 1페이지 깔아놓는다(ex. 지니뮤직 1번페이지)
	}
	int curpage=Integer.parseInt(strPage);
	
	//
	String mode=request.getParameter("mode"); 
	MelonDAO dao=new MelonDAO();
	String genre=dao.melonGetGenre(Integer.parseInt(mode));
	ArrayList<MelonVO> list=
			dao.melonAllData(Integer.parseInt(mode),curpage);  //$$ curpage
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>장르별 음악(<%=genre %>)</h1>
		<table class="table table-hover">
			<tr class="danger">
				<th class="text-center">순위</th>
				<th class="text-center"></th>
				<th class="text-center">곡명</th>
				<th class="text-center">가수명</th>
				<th class="text-center">앨범</th>
			</tr>	
			<%
          		for(MelonVO vo:list)
          		{
       		 %>
             <tr>
		         <td class="text-center"><%=vo.getRank()+((curpage*30)-30) %></td>
		         <td class="text-center">
		           <img src=<%=vo.getPoster() %> width=35 height=35 class="img-circle">
		         </td>
		         <td><%=vo.getTitle() %></td>
		         <td><%=vo.getSinger() %></td>
		         <td><%=vo.getAlbum() %></td>
		     </tr>
        	<%
          		}
       		%>
		</table>
		<talbe class="table">
			<tr>
				<td class="text-center">
					<ul class="pagination">   
					
					
				<%
                	for(int i=1;i<=5;i++)
                	{
            	%>
			 			 <li><a href="melon_main.jsp?mode=<%=mode %>&page=<%=i%>"><%=i %></a></li>   
				<%
                	}
				%>
					</ul>
				</td>
			</tr>
		</talbe>
	</center>
</body>
</html>