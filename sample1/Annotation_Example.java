import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation{
    int value();
}
 class CustomAnnotation{

//Applying annotation
@MyAnnotation(value=10)
public void sayHello(){System.out.println("hello annotation");}
}

//Accessing annotation
class Annotation_Example{
public static void main(String args[])throws Exception{

CustomAnnotation h=new CustomAnnotation();
Method m=h.getClass().getMethod("sayHello");

MyAnnotation obj=m.getAnnotation(MyAnnotation.class);
System.out.println("value is: "+obj.value());}
}
