import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;

@HandlesTypes({
    javax.servlet.http.HttpServlet.class,
    javax.servlet.Filter.class
})
public class AppInitializer implements ServletContainerInitializer {

    @Override
    public void onStartup(Set<Class<?>> arg0, ServletContext arg1) throws ServletException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'onStartup'");
    }
 
    
}
