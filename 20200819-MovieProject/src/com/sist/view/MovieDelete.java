package com.sist.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sist.dao.MovieDAO;


@WebServlet("/MovieDelete")
public class MovieDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// MovieDelete?no="+vo.getNo()
	// <input type=text name=id>
	/*
	 * 		GET => <a> response.sendRedirect() //a태그는 반드시 ?뒤에 get방식으로 적어줘야한다
	 * 		POST => form //form태그만 POST
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String no=request.getParameter("no");
		String mno=request.getParameter("mno");
		// DAO전송
		MovieDAO dao=new MovieDAO();
		// 삭제처리
		dao.replyDelete(Integer.parseInt(no));
		// MovieDetail로 이동
		response.sendRedirect("MovieDetail?no="+mno);
	}

}
