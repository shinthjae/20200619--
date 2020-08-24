<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,java.text.*"%>
<%--스크립트 요소 (표현식) p.67 --%>
<%--
		일반 자바코딩 : <% %>
		화면 출력       : <%= %> (out.println())
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 자바영역 => 문법이 자바와 동일(주석처리 보면 자바영역) 
		// 변수 선언(지역변수) => int i=0;
		// 객체 메모리 할당 => Date date=new Date()
		// 제어문
		Date date=new Date();
		SimpleDateFormat sdf=
				new SimpleDateFormat("yyyy-MM-dd");
		String today=sdf.format(date);
	%>
	
<%--
			<%= %>에는 ;(세미콜론)을 안찍는다 => 이미 out.println(요안에); 적은 것 이기 때문에 안찍어도 됨
--%>
	오늘날짜는 <%=today %> 입니다
	오늘날짜는 <% out.println(today); %> 입니다
</body>
</html>