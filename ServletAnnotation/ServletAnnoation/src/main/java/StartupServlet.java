// import java.io.IOException;

// import javax.servlet.ServletConfig;
// import javax.servlet.ServletException;
// import javax.servlet.annotation.WebServlet;
// import javax.servlet.http.HttpServlet;
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;
 
// @WebServlet(
//         urlPatterns = "/myController",
//         loadOnStartup = 1,
//         asyncSupported = true
// )
// public class StartupServlet extends HttpServlet {
     
//     public void init(ServletConfig config) {
//         System.out.println("My servlet has been initialized");
//     }
     
//     @Override
//     protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         resp.getWriter().println("doget method runs");
//         doPost(req, resp);
//     }
//     @Override
//     protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//         resp.getWriter().println("dopost method runs");
//     }
// }