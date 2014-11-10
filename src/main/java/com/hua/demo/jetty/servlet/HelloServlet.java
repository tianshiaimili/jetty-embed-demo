package com.hua.demo.jetty.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * hello servlet
 *
 */
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("Content-Type: text/plain;charset=utf-8");
		ServletOutputStream out = response.getOutputStream();
		out.println("hello embed servlet!");

		Enumeration<String> name = request.getParameterNames();
		while(name.hasMoreElements()) {
			String myName = name.nextElement();
			out.println(myName+"="+request.getParameter(myName));
		}
	}


}
