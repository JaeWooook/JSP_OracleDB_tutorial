package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletParameter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServletParameter() {
		super();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String adminId = getServletConfig().getInitParameter("admin_Id");
		String adminPw = getServletConfig().getInitParameter("admin_Pw");

		PrintWriter out = response.getWriter();
		out.print("<p>adminId : " + adminId + "</p>");
		out.print("<p>adminPw : " + adminPw + "</p>");
		
		String imgDir=getServletContext().getInitParameter("imgDir");
		String testServerIP=getServletContext().getInitParameter("testServerIP");
		out.print("<p>imgDir : " + imgDir + "</p>");
		out.print("<p>testServerIP : " + testServerIP + "</p>");
		
		getServletContext().setAttribute("connected_IP", "165.62.58.99");
		getServletContext().setAttribute("connected_User", "jeong");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
