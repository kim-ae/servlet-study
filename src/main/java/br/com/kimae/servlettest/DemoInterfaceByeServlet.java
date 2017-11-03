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

public class DemoInterfaceByeServlet implements Servlet {
	ServletConfig config=null;
	private static final Logger LOGGER = LoggerFactory.getLogger(DemoInterfaceByeServlet.class);

	@Override
	public void init(ServletConfig config) throws ServletException {
		this.config=config;
		LOGGER.info("Bye Initialization complete");

	}

	@Override
	public ServletConfig getServletConfig() {
		return config;
	}

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		LOGGER.info("serving bye");
       try(PrintWriter pwriter=res.getWriter()){
    	   pwriter.print("<html>");
	       pwriter.print("<body>");
	       pwriter.print("<h1>Bye bye</h1>");
	       pwriter.print("</body>");
	       pwriter.print("</html>");	    	   
       }
	}

	@Override
	public String getServletInfo() {
		return "Demo interface bye servlet ;)";
	}

	@Override
	public void destroy() {
		LOGGER.info("bye servlet life cycle finished");
	}

}
