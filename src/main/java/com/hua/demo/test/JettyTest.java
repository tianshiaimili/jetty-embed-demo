package com.hua.demo.test;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;


public class JettyTest {
	public static void main(String[] args) throws Exception {
		Server server = new Server(8089);
		System.out.println(ServletContextHandler.SESSIONS); // 1
		ServletContextHandler context = new ServletContextHandler(
				ServletContextHandler.SESSIONS);
		context.setContextPath("/content");
		context.addServlet(new ServletHolder(new HelloServletTest()), "/*");
		context.addServlet(new ServletHolder(new HelloServletTest("上学")), "/school");
		context.addServlet(new ServletHolder(new HelloServletTest("小明")), "/person");
		server.setHandler(context);
		server.start();
		server.join();
	}
}
