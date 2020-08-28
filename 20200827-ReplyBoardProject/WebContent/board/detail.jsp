<%@ page info="상세보기(2020.08.28)" language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.sist.dao.*"%>
<%
	// JSP
	/*
		사용자 요청항 내용을 브라우저에 출력
		1) 사용자가 보내준 데이터 받기
		2) 데이터베이스 => DAO
		3) 출력
내장 객체 => 이미 만들어진 상태에서 메소드 영억에서 언제든지 사용 할 수 있더ㅏ
			= application
			= session
			= out
			= exception
			= pageContext
			= page==============> 자바(this) ========> page ===> this
			= config
			= cookies
	*/
	String no=request.getParameter("no");
	String strPage=request.getParameter("page");
	
	//DAO연결 => 데이터읽기 => DAO 상세보기 (내가 보던 페이지로 돌아온다)
	ReplyBoardDAO dao=new ReplyBoardDAO();		
	ReplyBoardVO vo=dao.boardDetail(Integer.parseInt(no));
	
	
	
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
     <h1>내용보기</h1>
     <table class="table_content" width=700>
       <tr>
         <th width=20%>번호</th>
         <td width=20% align="center"><%=vo.getNo() %></td>
         <th width=20%>작성일</th>
         <td width=20% align="center"><%-- <%=vo.getRegdate().toString() %> --%></td>
       </tr>
       <tr>
         <th width=20%>이름</th>
         <td width=20% align="center"><%=vo.getName() %></td>
         <th width=20%>조회수</th>
         <td width=20% align="center"><%=vo.getHit() %></td>
       </tr>
       <tr>
         <th width=20%>제목</th>
         <td colspan="3" align="left"><%=vo.getSubject() %></td>
       </tr>
       <tr>
         <td colspan="4" height="200" valign="top"><pre><%=vo.getContent() %></td>   
       </tr>
       <tr>
       	   <%--
                             화면 이동(하면서 데이터전송)
                HTML
                  <a>(GET) <form>(GET,POST)
                  
                JavaScript
                  location.href="" (GET)  
                  ajax => GET/POST
                  
                Java 
                  sendRedirect() => 서버에서 화면 이동시에 사용 => GET
                  forward() =>  GET
                  
                request => 화면을 이동하면 (전에 받은 데이터를 손실)
                		=> 이전에 사용됐던 request는 화면바뀔때마다 없어진다 => 그래서 안없어지는 session 써야 
                		=> 한단계 거쳐서는 데이터를 못받는다 (a->b ->c(x)
                		=> a,b,c가 request를 따로 가지고 있으면 초기화된다 => forward
          --%> 
         <td colspan="4" align="right">
           <a href="reply.jsp?no=<%=vo.getNo()%>&page=<%=strPage%>">답변</a> <%-- strPage 보고있던페이지(로 넘어가기) --%>
           <a href="update.jsp?no=<%=vo.getNo()%>">수정</a>&nbsp;    
           <a href="#">삭제</a>&nbsp;
           <a href="list.jsp?page=<%=strPage%>">목록</a>
         </td>
       </tr>
     </table>
   </center>
</body>
</html>