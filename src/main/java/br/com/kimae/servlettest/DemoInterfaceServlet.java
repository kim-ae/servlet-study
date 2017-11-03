package br.com.kimae.servlettest;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoInterfaceServlet implements Servlet {
	ServletConfig config=null;
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoInterfaceServlet.class);

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		LOGGER.info("Initialization complete");

	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		LOGGER.info("Serving");
	       try(PrintWriter pwriter=res.getWriter()){
	    	   pwriter.print("<html>");
		       pwriter.print("<body>");
		       pwriter.print("<h1>Servlet Example Program</h1>");
		       pwriter.print("</body>");
		       pwriter.print("</html>");	    	   
	       }
	}

	@Override
	public String getServletInfo() {
		return "Demo interface servlet ;)";
	}

	@Override
	public void destroy() {
		LOGGER.info("servlet life cycle finished");
	}

}
