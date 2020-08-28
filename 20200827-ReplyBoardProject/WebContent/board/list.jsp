
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.sist.dao.*"%>
<%
	String strPage=request.getParameter("page"); //사용자가 페이지 선택시 변경
	if(strPage==null) // 첫페이지는 페이지 선택이 불가능 => 1페이지를 디폴트로 지정
		strPage="1";
	
	int curpage=Integer.parseInt(strPage); //현재 페이지
	// 페이지에 해당되는 데이터를 읽기
	ReplyBoardDAO dao=new ReplyBoardDAO();
	//10개씩
	ArrayList<ReplyBoardVO> list=dao.boardListData(curpage);
	//출력 => html
	int count=dao.boardRowCount();
	count=count-((curpage*10)-10);
	
	//11/10.0=>1.1=>2 ceil올림
	int totalpage=(int)(Math.ceil(count/10.0));
	
	/*
		Front => JavaScript (NodeJS, ReactJS, VueJS)
		Back => Spring+MyBatis+지능형웹(AI) => XML,Annotation,JSON
		==== Spring (Java, Kotlin)
		
		JSP => MVC => Spring => Kotlin
	*/
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/table.css">
</head>
<body>
	<center>
		<h1>묻고답하기</h1>
		<table class="table_content" width=700>
			<tr>
				<td>
					<a href="insert.jsp">등록</a>
				</td>
			</tr>
		</table>
			
			<table class="table_content" width=700>
			<tr>
				<th width=10%>번호</th>
				<th width=45%>제목</th>
				<th width=15%>이름</th>
				<th width=20%>작성일</th>
				<th width=10%>조회수</th>
			</tr>
			<%
				for(ReplyBoardVO vo:list)
				{
			%>
			<tr>
				<td width=10% align=center><%=count-- %></td>
				<td width=45%>
					<%
						//공백 주기
						if(vo.getGroup_tab()>0)
						{
							for(int i=0;i<vo.getGroup_tab();i++)
							{
								out.println("&nbsp;&nbsp;");
							}
					%>
						<img src="image/icon_reply.gif" style="border:none">
					<% 
						}
					%>
					
					<%-- 내용보기 이동 <a> --%>
					<a href="detail.jsp?no=<%=vo.getNo()%>&page=<%=curpage%>"><%=vo.getSubject() %></a>
					&nbsp;
					<%
						Date date=new Date();
						SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
						String today=sdf.format(date);
						String dbday=vo.getRegdate().toString();
						
						if(today.equals(dbday))
						{
					%>
						<sup></sup><img src="image/new.gif" style="border:none"></sup>
					<%
						}
					%>
				</td>
				<td width=15% align=center><%=vo.getName() %></td>
				<td width=20% align=center><%=vo.getRegdate().toString() %></td>
				<td width=10% align=center><%=vo.getHit() %></td>
			</tr>
			<% 
				}
			%>	
		</table>
		
		<%--left=>찾기  right=>이전 다음 버튼 --%>
		<table class="table_content" width=700>
			<tr>
				<td align=left>
				 Search :
				 <%-- WHERE name LIKE '%홍%' 이걸 아래에 sql문장으로  --%>
				 <%--
               WHERE fd LIKE '%ss%'
           --%>
				 <select name=fd>
				 	<option value="name">이름</option>
				 	<option value="subject">제목</option>
				 	<option value="content">내용</option>
				 </select>
				 <input type=text name=ss size=10>
         		 <input type=submit value="찾기">
				</td>
				  <%-- curpage>1(마이너스안되게하기)   ?=>조건이 맞으면 --%>
				<%-- <td align=right>
					<a href="list.jsp?page=<% curpage>1?curpage-1:curpage%>">이전</a>    
						<%=curpage %> page / <%=totalpage %> pages
					<a href="list.jsp?page=<% curpage>totlapage?curpage+1:curpage%>">다음</a>
				</td> --%>
				
				<td align=right>
          			<a href="list.jsp?page=<%= curpage>1?curpage-1:curpage%>">이전</a>
           				 <%=curpage %> page / <%=totalpage %> pages
          			<a href="list.jsp?page=<%=curpage<totalpage?curpage+1:curpage%>">다음</a>
        	 </td>			
			</tr>
		</table>
	</center>
</body>
</html>