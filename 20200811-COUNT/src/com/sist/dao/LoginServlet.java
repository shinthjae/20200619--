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
      // 브라우저에 HTML을 전송 => 한글을 포함하고 있다
      // HTML 제작
      PrintWriter out = response.getWriter();
      //response , request
      //repsonse => 응답(브라우저 전송)
      //request  => 사용자가 보낸 데이터를 받는 경우
      
      /*
       * 
       *  <html>
       *     <head>
       *     => <style>
       *     => <script> => 이벤트 
       *     </head>
       *     <body>
       *     => 화면 출력
       *     => 
       *     </body>
       *  </html>
       *  
       *  태그 => 지정된 태그만 사용
       *  태그는 대소문자를 구분하지 않음 (다만 태그는 소문자로 사용해아함)
       *  0
       */
      out.println("<html>");
      out.println("<body>");
      //화면 디자인 시작.
      out.println("<center>");
      out.println("<h1>Login</h1>");
      out.println("<form method=post action=LoginServlet>");
      out.println("<table width=250>");
      out.println("<tr>");
      out.println("<td width=15% align=right> 이름</td>");
      out.println("<td width=85%>");
      out.println("<input type=text name=ename size=17");
      out.println("</td>");
      out.println("</tr>");
      
      out.println("<tr>");
      out.println("<td width=15% align=right> 사번</td>");
      out.println("<td width=85%>");
      out.println("<input type=password name=empno size=17");
      out.println("</td>");
      out.println("</tr>");
      
      out.println("<tr>");
      out.println("<td align=center colspan=2> ");
      out.println("<input type=submit value=로그인>");
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
      
//      System.out.println("이름:"+ename.toUpperCase());
//      System.out.println("사번:"+empno);
      if(result.equals("NONAME"))
      {
         out.println("<script>");
         out.println("alert(\"이름이 존재하지 않습니다\");"); //브라우저에서 작은창 띄우는거
         out.println("history.back();");
         out.println("</script>");
      }
      else if(result.equals("NOSABUN"))
      {
         out.println("<script>");
         out.println("alert(\"사번이 틀립니다\");"); //브라우저에서 작은창 띄우는거
         out.println("history.back();");
         out.println("</script>");
      }
      else
      {
//         out.println("<script>");
//         out.println("alert(\""+result+"님 메인으로 이동합니다.\");"); //브라우저에서 작은창 띄우는거
//         out.println("</script>");
         response.sendRedirect("MusicServlet");
      }
   }
}