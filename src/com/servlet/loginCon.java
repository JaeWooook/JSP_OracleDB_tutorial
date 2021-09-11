package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class loginCon
 */
@WebServlet("/loginCon")
public class loginCon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginCon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String mId = request.getParameter("mID");
		String mPw = request.getParameter("mPW");
		
		out.print("mId : "+mId);
		out.print("mPw : "+ mPw);
		
		Cookie[] cookies = request.getCookies();//request로 하는 이유는 쿠키는 사용자 쪽에 저장이된다. 브라우저쪽
		//그래서 클라이언트 요청시에 request에서 찾아야한다.
		Cookie cookie=null;
		
		for(Cookie c : cookies) {
			System.out.println("c.getName() : "+c.getName()+ "c.getValue() : "+c.getValue());
			
			if(c.getName().equals("memberId")) {
				//member아이디가 있으면 이전에 접속하였구나라고 판단하고 cookie에 그 정보를 담는것이다.
				cookie=c;//만약 쿠키가의 이름이 memberId와 같다면 담아라?
			}
		}
		if(cookie==null) {
			System.out.println("cookie is null");
			//쿠키를 생성해준다. 없으닌까
			cookie = new Cookie("memberId", mId);
		}
		
		//응답객체를 이용해서 만든 쿠키를 보내준다.
		response.addCookie(cookie);
		
		cookie.setMaxAge(60*60);
		//쿠키의 만료시간을 1시간으로 하는것이다. 60*60은 1시간이다.
		
		response.sendRedirect("loginOk.jsp");//loginOk.jsp로 보내준다.
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
