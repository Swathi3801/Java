import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

 public class LcServlet extends HttpServlet{
    {
        System.out.println("Non static block");
    }
    // LcServlet(){
    //     System.out.println("Constructor is running");

    // }
    @Override
    public void init() throws ServletException {
                System.out.println("init");
    }
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
    // @Override
    // public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
    //     System.out.println("service");
    // }
    
    
}
