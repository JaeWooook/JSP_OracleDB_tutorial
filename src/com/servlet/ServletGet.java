package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletGet")
public class ServletGet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletGet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String connectedIP = (String)getServletContext().getAttribute("connected_IP"); //강제 형변환을 해주어야한다. 타입이 맞지않는다.
		String connectedUser = (String)getServletContext().getAttribute("connected_User");
		
		PrintWriter out = response.getWriter();
		out.print("<p>connectedIP : "+connectedIP+"</p>");
		out.print("<p>connectedUser : "+connectedUser+"</p>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
