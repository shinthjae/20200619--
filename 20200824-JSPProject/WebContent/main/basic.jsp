<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--
		2020.08.24
		
		JSP : Java Server Page => 서버에서 실행되는 자바파일
		===
		JSP의 구성요소
			1. 지시자
			  = page : JSP파일에 대한 정보
			  = tablib : 태그로 자바의 문법
			  			 ===> 제어문 <c:forEach> <c:if>
			   자바 + HTML (HTML기반 자바가 첨부)
			   자바 영역<% %>
			   
			  <html>
			   <body>
			    <h1>게시판</h1>
			    <ul>
			    <%
			    	for(BoardVO vo:list)
			    	}
			    %>
			    		<li>번호-제목-이름-작성일-조회수</li>
			    <%		
			    	}
			    %>
			    </ul>
			   </body>
			  </html>
			  
		   ====> taglib	   
			  <html>
			   <body>
			    <h1>게시판</h1>
			    <ul>
			    	<c:forEach items="list">
			   		 <li>번호-제목-이름-작성일-조회수</li>
			   		</c:forEach>
			    </ul>
			   </body>
			  </html>
			  
			  = include: 특정 JSP안에 JSP를 첨부
			  
			  
			  
			  4. 표현식(EL,JSTL)
			  5. MVC 
			  
			  

 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>





