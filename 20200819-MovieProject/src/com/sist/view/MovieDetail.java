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

// �󼼺���
// tomcat(JSP����) JSP => Servlet 
// => �׽�Ʈ�� ������(����ġ)
@WebServlet("/MovieDetail")
public class MovieDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HTML�� ��� 
				response.setContentType("text/html;charset=EUC-KR");
				PrintWriter out=response.getWriter();//������
				
				// HTML ���� 
				// ���� �޴´�   MovieMain => MovieDetail?no=1
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
				out.println("<h1 class=text-center>��ȭ��</h1>");
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
				out.println("<td width=70%>����:"+vo.getDirector()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>�⿬:"+vo.getActor()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>�帣:"+vo.getGenre()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>���:"+vo.getGrade()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>��Ÿ:"+vo.getRegdate()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td width=70%>"+vo.getScore()+"</td>");
				out.println("</tr>");
				
				out.println("<tr>");
				out.println("<td colspan=2 height=200 valign=top>"+vo.getStory()+"</td>");
				out.println("</tr>");
				
				out.println("</table>");
				//out.println("���۹��� ��ȭ��ȣ:"+no);
				out.println("</div>");
				
				out.println("<div class=col-sm-4>");
				out.println("<table class=table>");
				out.println("<tr>");
				out.println("<td>");
				
				out.println("<form method=post action=MovieDetail>"); //post�� post get�̸� get
				out.println("<input type=hidden name=mno value="+no+">"); //hidden=>���缭 ����
				out.println("<input type=text size=25 class=input-sm name=msg>");
				out.println("<input type=submit class=\"btn btn-sm btn-primary\" value=��۾���>");
				
				out.println("</form>");
				out.println("</td>");
				out.println("</tr>");
				out.println("</table>");
				
				//��۰���
				ArrayList<ReplyVO> rList=dao.movieReplyData(Integer.parseInt(no));
				out.println("<table class=table>");
				out.println("<tr>");
				out.println("<td>");
				
				//
				HttpSession session=request.getSession();
				String id=(String)session.getAttribute("id"); //����� ���̵� ������ �´�//
				
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
					out.println("<a href=# class=\"btn btn-xs btn-primary\">����</a>");
					out.println("<a href=MovieDelete?no="+rvo.getNo()+"&mno="+vo.getNo()+" class=\"btn btn-xs btn-danger\">����</a>"); ///����������MovieDelete�� �̵�
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

	//��۴ޱ�(2)
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try
			{
				//�ѱ۱�������
				request.setCharacterEncoding("EUC-KR");
					
			}catch(Exception ex) {}
			
			String mno=request.getParameter("mno");
			String msg=request.getParameter("msg");
			
			HttpSession session=request.getSession();
			String id=(String)session.getAttribute("id"); //����� ���̵� ������ �´�//
			
			ReplyVO vo=new ReplyVO();
			vo.setMno(Integer.parseInt(mno));
			vo.setMsg(msg);
			vo.setId(id); //Session//
			//DAO����
			MovieDAO dao=new MovieDAO();
			dao.movieReplyInsert(vo);
			//ȭ���̵�
			response.sendRedirect("MovieDetail?no="+mno);
	}
	
	

}
