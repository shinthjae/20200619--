package com.sist.dao;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MusicDetail
 */
@WebServlet("/MusicDetail") // webServlet�� ���;��� �̸��� ������ ã�ƿ� �� �ִ�.
public class MusicDetail extends HttpServlet {
   private static final long serialVersionUID = 1L;
   //MusicDetail?mno=10;
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=EUC-KR");
      // ���� �޴´�.
      String mno=request.getParameter("mno");//  ������ �ڿ��ִ� mno=10; �� �ִ� 10�� ���� �����´�.
      MusicDAO dao=new MusicDAO();
      MusicVO vo = dao.musicDetailData(Integer.parseInt(mno));
      
      //�����ϴ� �κ� 
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<body>");
      out.println("<center>");
      out.println("<h1>&lt;"+vo.getTitle()+"&gt; �󼼺���</h1>");
      out.println("<table width=700>");
      out.println("<tr>");
      out.println("<td>");
      // ������ <iframe> => youtune
      // <video>
      out.println("<iframe src=http://youtube.com/embed/"+vo.getKey()+" width=700 height=400></iframe>");
      out.println("</td>");
      out.println("</tr>");
      out.println("</table>");
      
      out.println("<table width=700>");
      out.println("<tr>");
      out.println("<td width=45% rowspan=4>");
      out.println("<img src="+vo.getPoster()+" width=100%>");
      out.println("</td>");
      
      out.println("<td>");
      out.println(vo.getTitle());
      out.println("</td>");
      out.println("</tr>");
      
      out.println("<tr>");
      out.println("<td>");
      out.println(vo.getSinger());
      out.println("</td>");
      out.println("</tr>");
      
      out.println("<tr>");
      out.println("<td>");
      out.println(vo.getAlbum());
      out.println("</td>");
      out.println("</tr>");
      
      
      out.println("<tr>");
      out.println("<td>");
      out.println("<a href=MusicServlet>���</a>");
      out.println("</td>");
      out.println("</tr>");
      
      out.println("</table>");
      out.println("</center>");
      out.println("</body>");
      out.println("</html>");
   }
}