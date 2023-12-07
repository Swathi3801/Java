import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
    // @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext ctx = getServletContext();          
        System.out.println(ctx.getAttribute("ContextParam"));
        // ServletContext context = getServletContext();
        //  String ctx = context.getInitParameter("ContextParam");
        //     System.out.println(ctx);

        // ServletConfig config = getServletConfig();
        // String pack = config.getInitParameter("packages");
        // System.out.println(pack);

        // ServletContext context = req.getServletContext();
        //  String ctx = context.getInitParameter("contextConfigLocation");
        //     System.out.println(ctx);

    //     String name = req.getParameter("uname");
    //     String password = req.getParameter("psd");           
    //     System.out.println(name);
    //     System.out.println(password);

        // Map<String, String[]> map = req.getParameterMap();
        // map.entrySet().stream()
        //         .flatMap(entry -> Arrays.stream(entry.getValue())
        //                 .map(value -> entry.getKey() + " = " + value))
        //         .forEach(System.out::println);

        // map.values().stream().flatMap(Arrays::stream).forEach(System.out::println);

        // Enumeration<String> names = req.getParameterNames();
        // Collections.list(names).stream().forEach(System.out::println);

        // String[] username = req.getParameterValues("uname");
        // String[] password1 = req.getParameterValues("psd");
        // Arrays.stream(username).forEach(System.out::println);
        // Arrays.stream(password1).forEach(System.out::println);

    }

    // @Override
    // protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    //     String name = req.getParameter("uname");
    //     String password = req.getParameter("psd");
    //     System.out.println(name);
    //     System.out.println(password);

    //     Map<String, String[]> map = req.getParameterMap();
    //     map.entrySet().stream()
    //             .flatMap(entry -> Arrays.stream(entry.getValue())
    //                     .map(value -> entry.getKey() + " = " + value))
    //             .forEach(System.out::println);

    //     Enumeration<String> names = req.getParameterNames();
    //     Collections.list(names).stream().forEach(System.out::println);

    //     String[] username = req.getParameterValues("uname");
    //     String[] password1 = req.getParameterValues("psd");
    //     Arrays.stream(username).forEach(System.out::println);
    //     Arrays.stream(password1).forEach(System.out::println);

    // }
}
