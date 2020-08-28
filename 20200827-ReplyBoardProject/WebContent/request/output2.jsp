<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- JSP p.74 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h1>input2.jsp에서 받은 값</h1>
		<%
			try
		{
				request.setCharacterEncoding("UTF-8"); //글자깨짐 방지
		}catch(Exception ex){}
			String name=request.getParameter("name");
			String sex=request.getParameter("sex");
			String loc=request.getParameter("loc");
			String content=request.getParameter("content");
			
			// 변수명(name)이 동일한 것은 배열로 받아야한다
			// 사용자가 몇개를 선택할지 모르니깐 동시에 받을수 있게 getParameterValues 사용=> 이거 checkbox와 select(multi) 두개만 사용
			String[] hobby=request.getParameterValues("hobby");			
		%>
		
		이름:<%=name %><br>
		성별:<%=sex %><br>
		지역:<%=loc %><br>
		소개:<%=content %><br>
		취미:<%-- 배열=>for문 사용자가 체크를 안한다면?! => 예외처리--%>
			<ul>
				<%
				try
				{
					for(String s:hobby)
					{
				%>
					<li><%=s %></li>
				<%
					}
				}catch(Exception ex)
				{
				%>
					<font color=red>취미가 없습니다</font>
				<% 	
				}
				%>
			</ul>
		
		<%-- JSP p.73 --%>
		IP : <%=request.getRemoteAddr() %><br>
		요청경로 : <%=request.getRequestURI() %><br>	
		전체주소 : <%=request.getRequestURL() %><br>	
		컨텍스트 : <%=request.getContextPath() %><br>	
		요청방식 : <%=request.getMethod() %><br>	
		인코딩 : <%=request.getCharacterEncoding() %><br>	
		서버주소 : <%=request.getServerName() %><br>	
		서버포트 : <%=request.getServerPort() %>	
			
	</center>
</body>
</html>