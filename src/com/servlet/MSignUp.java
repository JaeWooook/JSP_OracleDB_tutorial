package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class mSignUp
 */
@WebServlet("/MSignUp")
public class MSignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MSignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//post방식 한글처리
		request.setCharacterEncoding("UTF-8");//실제로는 ctrl+c v 로 코딩한다 이부분
		//charset을 할필요없다 그냥 utf-8만 있으면된다.
		//여기서는 캐릭터의 타입을 정의하는것이 아니다. 캐릭터 인코딩만한다.
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String mName = request.getParameter("m__name");
		String mNickname = request.getParameter("m__nickname");
		
		out.print("<p>mName : "+mName + "</p>");
		out.print("<p>mNickname : "+mNickname + "</p>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
