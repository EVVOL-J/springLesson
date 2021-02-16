package ru.geekbrains;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "FirstServlet", urlPatterns = "/first_servlet")
public class FirstServlet implements Servlet {
    private ServletConfig servletConfig;

    private static Logger logger= LoggerFactory.getLogger(FirstServlet.class);
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        logger.info("FirstServlet initialized");
        this.servletConfig=servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("New request to FirstServlet");
        servletResponse.getWriter().println("<h1> Hello from servlet </h1>");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
