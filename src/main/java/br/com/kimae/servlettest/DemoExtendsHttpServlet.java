package br.com.kimae.servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class DemoExtendsHttpServlet extends HttpServlet {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoExtendsHttpServlet.class);

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException{
		LOGGER.info("Extends method");
		try(PrintWriter out = response.getWriter()){
			out.println("<html>");
			out.println("<body>");
			out.println("<h1>Hello Servlet Get</h1>");
			out.println("</body>");
			out.println("</html>");			
		}
	}
}
