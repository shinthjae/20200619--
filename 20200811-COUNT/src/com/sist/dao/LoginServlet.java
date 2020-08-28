package com.sist.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      response.setContentType("text/html;charset=EUC-KR");
      // �������� HTML�� ���� => �ѱ��� �����ϰ� �ִ�
      // HTML ����
      PrintWriter out = response.getWriter();
      //response , request
      //repsonse => ����(������ ����)
      //request  => ����ڰ� ���� �����͸� �޴� ���
      
      /*
       * 
       *  <html>
       *     <head>
       *     => <style>
       *     => <script> => �̺�Ʈ 
       *     </head>
       *     <body>
       *     => ȭ�� ���
       *     => 
       *     </body>
       *  </html>
       *  
       *  �±� => ������ �±׸� ���
       *  �±״� ��ҹ��ڸ� �������� ���� (�ٸ� �±״� �ҹ��ڷ� ����ؾ���)
       *  0
       */
      out.println("<html>");
      out.println("<body>");
      //ȭ�� ������ ����.
      out.println("<center>");
      out.println("<h1>Login</h1>");
      out.println("<form method=post action=LoginServlet>");
      out.println("<table width=250>");
      out.println("<tr>");
      out.println("<td width=15% align=right> �̸�</td>");
      out.println("<td width=85%>");
      out.println("<input type=text name=ename size=17");
      out.println("</td>");
      out.println("</tr>");
      
      out.println("<tr>");
      out.println("<td width=15% align=right> ���</td>");
      out.println("<td width=85%>");
      out.println("<input type=password name=empno size=17");
      out.println("</td>");
      out.println("</tr>");
      
      out.println("<tr>");
      out.println("<td align=center colspan=2> ");
      out.println("<input type=submit value=�α���>");
      out.println("</td>");
      out.println("</tr>");
      
      
      out.println("</table>");
      out.println("</form>");
      out.println("</center>");
      out.println("</body>");
      out.println("</html>");
      
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      
      response.setContentType("text/html;charset=EUC-KR");
      PrintWriter out = response.getWriter();
      
      String ename= request.getParameter("ename");
      String empno=request.getParameter("empno");
      
      MyDAO dao = new MyDAO();
      
      String result =dao.isLogin(ename.toUpperCase(),Integer.parseInt(empno));
      
//      System.out.println("�̸�:"+ename.toUpperCase());
//      System.out.println("���:"+empno);
      if(result.equals("NONAME"))
      {
         out.println("<script>");
         out.println("alert(\"�̸��� �������� �ʽ��ϴ�\");"); //���������� ����â ���°�
         out.println("history.back();");
         out.println("</script>");
      }
      else if(result.equals("NOSABUN"))
      {
         out.println("<script>");
         out.println("alert(\"����� Ʋ���ϴ�\");"); //���������� ����â ���°�
         out.println("history.back();");
         out.println("</script>");
      }
      else
      {
//         out.println("<script>");
//         out.println("alert(\""+result+"�� �������� �̵��մϴ�.\");"); //���������� ����â ���°�
//         out.println("</script>");
         response.sendRedirect("MusicServlet");
      }
   }
}