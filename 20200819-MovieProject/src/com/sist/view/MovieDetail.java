package com.sist.view;

import java.io.*;

import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sist.dao.MovieDAO;
import com.sist.manager.MovieVO;
import com.sist.manager.NewsVO;
import com.sist.manager.ReplyVO;

// 상세보기
// tomcat(JSP엔진) JSP => Servlet 
// => 테스트용 웹서버(아파치)
@WebServlet("/MovieDetail")
public class MovieDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HTML로 출력 
				response.setContentType("text/html;charset=EUC-KR");
				PrintWriter out=response.getWriter();//브라우저
				
				// HTML 전송 
				// 값을 받는다   MovieMain => MovieDetail?no=1
				String no=request.getParameter("no");
				out.println("<html>");
				out.println("<head>");
				out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
				/*
				 * out.println("<style type=text/css>"); out.println(".row{");
				 * out.println("margin:0px auto;"); out.println("width:700px;");
				 * out.println("}"); out.println("</style>");
				 */
				out.println("</head>");
				out.println("<body>");
				out.println("<div class=container>");
				out.println("<h1 class=text-center>영화상세</h1>");
				out.println("<div class=row>");
				out.println("<div class=col-sm-8>");
				MovieDAO dao=new MovieDAO();
				MovieVO vo=dao.movieDetailData(Integer.parseInt(no));
				out.println("<table class=table>");
				out.println("<tr>");
				out.println("<td>");
				out.println("<iframe src=http://youtube.com/embed/"+vo.getKey()+" width=700 height=350></iframe>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("<table class=table>");
				out.println("<tr>");
				out.println("<td width=30% class=text-center rowspan=7>");
				out.println("<img src="+vo.getPoster()+" width=210 height=300>");
				out.println("</td>");
				out.println("<td width=70%>"+vo.getTitle()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>감독:"+vo.getDirector()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>출연:"+vo.getActor()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>장르:"+vo.getGenre()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>등급:"+vo.getGrade()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>기타:"+vo.getRegdate()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>"+vo.getScore()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td colspan=2 height=200 valign=top>"+vo.getStory()+"</td>");
				out.println("</tr>");
				
				out.println("</table>");
				//out.println("전송받은 영화번호:"+no);
				out.println("</div>");
				
				out.println("<div class=col-sm-4>");
				out.println("<table class=table>");
				out.println("<tr>");
				out.println("<td>");
				
				out.println("<form method=post action=MovieDetail>"); //post면 post get이면 get
				out.println("<input type=hidden name=mno value="+no+">"); //hidden=>감춰서 보냄
				out.println("<input type=text size=25 class=input-sm name=msg>");
				out.println("<input type=submit class=\"btn btn-sm btn-primary\" value=댓글쓰기>");
				
				out.println("</form>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				
				//댓글관련
				ArrayList<ReplyVO> rList=dao.movieReplyData(Integer.parseInt(no));
				out.println("<table class=table>");
				out.println("<tr>");
				out.println("<td>");
				
				//
				HttpSession session=request.getSession();
				String id=(String)session.getAttribute("id"); //저장된 아이디를 가지고 온다//
				
				for(ReplyVO rvo:rList)
				{
					out.println("<table class=table>");
					out.println("<tr>");
					
					out.println("<td class=text-left>");
					out.println(rvo.getId()+"("+rvo.getDbday()+")");
					out.println("</td>");
					
					out.println("<td class=text-right>");
					if(id.equals(rvo.getId()))
					{
					out.println("<a href=# class=\"btn btn-xs btn-primary\">수정</a>");
					out.println("<a href=MovieDelete?no="+rvo.getNo()+"&mno="+vo.getNo()+" class=\"btn btn-xs btn-danger\">삭제</a>"); ///삭제누르면MovieDelete로 이동
					}
					out.println("</td>");
					out.println("</tr>");
					
					out.println("<tr>");
					out.println("<td colspan=2 height=100 valign=top class=text-left>");
					out.println("<pre>"+rvo.getMsg()+"</pre>");
					out.println("</td>");
					out.println("</tr>");
					
					out.println("</table>");
				}
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("</div>");
				
				
				out.println("</div>");
				out.println("</div>");
				out.println("</body>");
				out.println("</html>");
				
				
			}

	//댓글달기(2)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try
			{
				//한글깨짐방지
				request.setCharacterEncoding("EUC-KR");
					
			}catch(Exception ex) {}
			
			String mno=request.getParameter("mno");
			String msg=request.getParameter("msg");
			
			HttpSession session=request.getSession();
			String id=(String)session.getAttribute("id"); //저장된 아이디를 가지고 온다//
			
			ReplyVO vo=new ReplyVO();
			vo.setMno(Integer.parseInt(mno));
			vo.setMsg(msg);
			vo.setId(id); //Session//
			//DAO전송
			MovieDAO dao=new MovieDAO();
			dao.movieReplyInsert(vo);
			//화면이동
			response.sendRedirect("MovieDetail?no="+mno);
	}
	
	

}
