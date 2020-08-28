<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	String no=request.getParameter("no"); //디테일.jps ?뒤랑 같아야
	String strPage=request.getParameter("page"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/table.css">
</head>
<body>
   <%--
       submit => action에 등록된 파일로 입력한 데이터 전송 
         = <input> <textarea> <select>
   --%>
   <center>
     <h1>답변하기</h1>
     <form method=post action=reply_ok.jsp>
     <table class="table_content" width=500>
       <tr>
         <th width=15% align=right>이름</th>
         <td width=85%>
           <input type=text name=name size=15 required>
           <input type=hidden name=pno value="<%=no%>">  <%--hidden으로 감춰보내기 --%>
           <input type=hidden name=page value="<%=strPage%>">
         </td>
       </tr>
       <tr>
         <th width=15% align=right>제목</th>
         <td width=85%>
           <input type=text name=subject size=45 required>
         </td>
       </tr>
       <tr>
         <th width=15% align=right>내용</th>
         <td width=85%>
           <textarea rows="7" cols="55" name="content" required></textarea>
         </td>
       </tr>
       <tr>
         <th width=15% align=right>비밀번호</th>
         <td width=85%>
           <input type=password name=pwd size=10 required>
         </td>
       </tr>
       <tr>
         <td colspan="2" align=center>
          <input type=submit value="답변">
          <input type=button value="취소" onclick="javascript:history.back()">
         </td>
       </tr>
     </table>
     </form>
   </center>
</body>
</html>
