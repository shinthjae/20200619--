<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%--
		2020.08.24
		
		JSP : Java Server Page => �������� ����Ǵ� �ڹ�����
		===
		JSP�� �������
			1. ������
			  = page : JSP���Ͽ� ���� ����
			  = tablib : �±׷� �ڹ��� ����
			  			 ===> ��� <c:forEach> <c:if>
			   �ڹ� + HTML (HTML��� �ڹٰ� ÷��)
			   �ڹ� ����<% %>
			   
			  <html>
			   <body>
			    <h1>�Խ���</h1>
			    <ul>
			    <%
			    	for(BoardVO vo:list)
			    	}
			    %>
			    		<li>��ȣ-����-�̸�-�ۼ���-��ȸ��</li>
			    <%		
			    	}
			    %>
			    </ul>
			   </body>
			  </html>
			  
		   ====> taglib	   
			  <html>
			   <body>
			    <h1>�Խ���</h1>
			    <ul>
			    	<c:forEach items="list">
			   		 <li>��ȣ-����-�̸�-�ۼ���-��ȸ��</li>
			   		</c:forEach>
			    </ul>
			   </body>
			  </html>
			  
			  = include: Ư�� JSP�ȿ� JSP�� ÷��
			  
			  
			  
			  4. ǥ����(EL,JSTL)
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





