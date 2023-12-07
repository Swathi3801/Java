import java.lang.reflect.Method;

class Annotation_Example1
{
    public static void main(String args[])throws Exception
    {
    
    CustomAnnotation h=new CustomAnnotation();
    Method m=h.getClass().getMethod("sayHello");
    
    MyAnnotation obj=m.getAnnotation(MyAnnotation.class);
    System.out.println("value is: "+obj.value());
}
    }