package com.servlet.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class TempFilter implements Filter {

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(" -- filter init() -- ");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(" -- filter doFilter() -- ");
		//requst filter
		req.setCharacterEncoding("UTF-8");
		
		chain.doFilter(req,res);
	}


	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(" -- filter destory() -- ");
	}
}
