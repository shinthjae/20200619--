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
@WebServlet("/MusicDetail") // webServlet가 나와야지 이름이 나오면 찾아올 수 있다.
public class MusicDetail extends HttpServlet {
   private static final long serialVersionUID = 1L;
   //MusicDetail?mno=10;
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=EUC-KR");
      // 값을 받는다.
      String mno=request.getParameter("mno");//  페이지 뒤에있는 mno=10; 에 있는 10의 값을 가져온다.
      MusicDAO dao=new MusicDAO();
      MusicVO vo = dao.musicDetailData(Integer.parseInt(mno));
      
      //응답하는 부분 
      PrintWriter out = response.getWriter();
      out.println("<html>");
      out.println("<body>");
      out.println("<center>");
      out.println("<h1>&lt;"+vo.getTitle()+"&gt; 상세보기</h1>");
      out.println("<table width=700>");
      out.println("<tr>");
      out.println("<td>");
      // 동영상 <iframe> => youtune
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
      out.println("<a href=MusicServlet>목록</a>");
      out.println("</td>");
      out.println("</tr>");
      
      out.println("</table>");
      out.println("</center>");
      out.println("</body>");
      out.println("</html>");
   }
}