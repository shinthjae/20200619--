package com.sist.view;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*; //ArrayList => 배열(가변형배열)
import com.sist.dao.*; //MovieDAO
import com.sist.manager.*; //MovieVO

@WebServlet("/MovieMain")
public class MovieMain extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 		HttpServletRequest request
		 *			=> 사용자의 요청값
		 *			=> 브라우저 정보(사용자의 IP)
		 * 		HttpServletResponse response
		 * 			=> 응답정보(서버에서 클라이언트로 전송)
		 * 	
		 */	
		//브라우저가 준비 (HTML,XML)
		response.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=response.getWriter();
		/*
		 * out.println("<?xml version=\"1.0\" encoding=\"EUC-KR\"?>");
		 * out.println("<html>"); out.println("<body>"); out.println("<h1>Hello</h1>");
		 * //out.println("<h1>안녕하세요</h1>"); => 한글깨짐 charset=ISO-8859 => ASC(1byte)
		 * out.println("</body>"); out.println("</html>");
		 */
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<div class=container>");
//		out.println("<h1>구구단</h1>");
//		out.println("<table border=1 width=560>");
//		out.println("<tr>");
//		for(int i=2;i<=9;i++)
//		{
//			out.println("<th>"+i+"단</th>");
//		}
//		out.println("</tr>");
//		out.println("</table>");
//		out.println("</div>");
//		out.println("</body>");
//		out.println("</html>");
		
		
		// container => 큰박스같은거    >  row => 한줄(단락) 한줄(단락) ...
		out.println("<html>");
		out.println("<head>");
		out.println("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">");
		out.println("</head>");
		out.println("<body>");
		out.println("<div class=container>");
		out.println("<h1 class=text-center>영화목록</h1>");
		out.println("<div class=row>");
		out.println("<a href=MovieMain?no=1 class=\"btn btn-sm btn-primary\">현재상영영화</a>");
		out.println("<a href=MovieMain?no=2 class=\"btn btn-sm btn-danger\">개봉예정영화</a>");
		out.println("<a href=MovieMain?no=3 class=\"btn btn-sm btn-info\">박스오피스(주간)</a>");
		out.println("<a href=MovieMain?no=4 class=\"btn btn-sm btn-warning\">박스오피스(월간)</a>");
		out.println("<a href=MovieMain?no=5 class=\"btn btn-sm btn-success\">박스오피스(연간)</a>");
		out.println("<a href=NewsMain class=\"btn btn-sm btn-primary\">뉴스메인</a>");
		out.println("</div>");
		out.println("<div class=row>");
		
		/* <div class="col-md-4">
		    <div class="thumbnail">
		      <a href="/w3images/lights.jpg">
		        <img src="/w3images/lights.jpg" alt="Lights" style="width:100%">
		        <div class="caption">
		          <p>Lorem ipsum...</p>
		        </div>
		      </a>
		    </div>
		  </div>
		  */
		
		//전송받은 값 받기
		String no=request.getParameter("no");
		if(no==null)
			no="1";
		
		MovieDAO dao=new MovieDAO();
		ArrayList<MovieVO> list=dao.movieListData(Integer.parseInt(no));
		for(MovieVO vo:list)
		{
			out.println("<div class=\"col-md-3\">");
			out.println("<div class=\"thumbnail\">");
			out.println("<a href=MovieDetail?no="+vo.getNo()+">"); //화면변경할때 a태그 //?앞에 있는 데이터를 통해서 값(뒤에 변수값)을 넘겨준다 
			out.println("<img src="+vo.getPoster()+" alt=\"Lights\" style=\"width:100%\">");
			out.println("<div class=\"caption\">");
			String str=vo.getTitle();
			if(str.length()>18)
			{
				str=str.substring(0,18)+"...";
			}
			out.println("<p>"+str+"</p>");
			out.println("</div>");
			out.println("</a>");
			out.println("</div>");
			out.println("</div>");
		}
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
		
		
		}

}
