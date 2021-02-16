package ru.geekbrains.homework;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "HomeServlet", urlPatterns = "/homeservlet")
public class HomeServlet extends HttpServlet {
    private static Logger logger= LoggerFactory.getLogger(HomeServlet.class);
    private List<Product> products;
    @Override
    public void init(ServletConfig config) throws ServletException {
        logger.info("Init procedure");
        products= Arrays.asList(
                new Product(0,"One", 100),
                new Product(1,"Two", 200),
                new Product(2,"Three", 300),
                new Product(3,"Four", 400),
                new Product(4,"Five", 500),
                new Product(5,"Six", 600),
                new Product(6,"Seven", 700),
                new Product(7,"Eight", 800),
                new Product(8,"Nine", 900),
                new Product(9,"Ten", 1000)
        );
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New Get request");
       StringBuilder sb=new StringBuilder();
       sb.append("<ol>");
       for (int i=0; i<products.size();i++) {
            sb.append("<li>");
            sb.append("Id= "+products.get(i).getId());
            sb.append(" Title= "+products.get(i).getTitle());
            sb.append(" Cost="+products.get(i).getCost());
            sb.append("</li>"); }
       sb.append("</ol>");
       resp.setHeader("Content-Type", "text/html; charset=utf-8");
       resp.getWriter().println(sb);
    }
}
