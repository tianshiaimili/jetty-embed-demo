package com.hua.demo.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletTest extends HttpServlet{

	String greeting = "哇哈哈";
	public  HelloServletTest(){
	}
	public HelloServletTest(String greeting){
	  this.greeting =greeting;
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws      ServletException, IOException {
	        response.setContentType("text/html;charset=utf-8");
	        response.getWriter().write("<h1>"+greeting+"</h1>");
	        response.getWriter().write("session= "+request.getSession(true).getId());
	}
	
}
