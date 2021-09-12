package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class loginConSe
 */
@WebServlet("/loginConSe")
public class loginConSe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public loginConSe() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		
		String mID = request.getParameter("m_ID");
		String mPW = request.getParameter("m_PW");
		
		out.print("mID : "+mID);
		out.print("mPW : "+mPW);
		
		//세션은 request객체로 부터 얻어낼 수 있다.
		HttpSession session = request.getSession();
		session.setAttribute("memberId", mID);
		
		response.sendRedirect("loginOkSession.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
