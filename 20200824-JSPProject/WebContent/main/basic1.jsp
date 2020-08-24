<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.text.*"
    errorPage="error.jsp" buffer="16kb" 
    %>
    
<!-- import -->    
<%-- <% <%@ page import="java.util.*" %> --%>
<%-- <%@ page import="java.text.*" %> %> --%>
<%--
		**지정된 속성에 값을 채운다
		<%@ page 속성="값" 속성="값"...
 --%>
 
 
 
<%--
		JSP 시작점
		
		지시자 
			1. page : JSP의 기본정보 
				= contentType="text/html; charset=UTF-8"
				  ===========
				  브라우저에 HTML을 전송한다 (브라우저에서 HTML파싱중비)
				  브라우저 실행 contentType="text/html" => 화면에 출력
				          contentType="text/XML" => 문서저장
				          charset=UTF-8 => charset=ISO-8859_1
				          						   ==========
				          						   	ASC(영문)
				 response.setContentType("text/html; charset=UTF-8"); => 이제 안씀
				 
			2. import : 이미 만들어진 클래스를 읽어 올때 사용
						(라이브러리 로드)
						맨위에 %@안에 적어야함, 따로 %@해서 적어도 됨 (위 참고)
						
			3. errorPage : "jsp파일 등록" => error시 이동
				

 --%>
<!DOCTYPE html>
<%
out.println("<html>");
out.println("<head>");
out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
out.println("<style type=text/css>");
out.println(".row{");
out.println("margin:0px auto;");
out.println("width:300px;");
out.println("}");
out.println("</style>");
out.println("</head>");
out.println("<body>");
out.println("<div class=container>");
out.println("<h1 class=text-center>로그인</h1>");
out.println("<div class=row>");

out.println("<form method=post action=Login>");
out.println("<table class=table>");
out.println("<tr>");
out.println("<td width=20% class=text-right>ID</td>");
out.println("<td width=\"75%\">");
out.println("<input type=text name=id size=15 class=input-sm>");
out.println("</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td width=20% class=text-right>Password</td>");
out.println("<td width=\"75%\">");
out.println("<input type=password name=pwd size=15 class=input-sm>");
out.println("</td>");
out.println("</tr>");

out.println("<tr>");
out.println("<td colspan=2 class=text-center>");
out.println("<input type=submit value=로그인 class=\"btn btn-sm btn-success\">");
out.println("<input type=button value=취소 class=\"btn btn-sm btn-danger\">");
out.println("</td>");
out.println("</tr>");

out.println("</table>");
out.println("</form>");
out.println("</div>");
out.println("</div>");
out.println("</body>");
out.println("</html>");
%>