import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // System.out.println("doget called");
         resp.setContentType("text/html");  
            PrintWriter out=resp.getWriter();  
            out.print("<h1><i><center>You are successfully logged in!</center></i></h1>"); 
            req.setAttribute("name", "Swathi N");
        req.getRequestDispatcher("index1.jsp").include(req, resp); 

    }

}
