import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet1 extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //System.out.println("Welcome Servlet 1");
        resp.setContentType("text/html");
         PrintWriter out=resp.getWriter();  
            out.print("<h1><i><center>Welcome !!!</center></i></h1>"); 
            req.setAttribute("name", "Swathi N");
            req.setAttribute("age", "22");
        req.getRequestDispatcher("index2.jsp").forward(req, resp); 

    }
    
}
