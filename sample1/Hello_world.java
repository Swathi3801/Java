/**
 * Hello_world
 */
public class Hello_world {
static 
        {
            System.out.println("static block");
        }
        
        {
            System.out.println("non static block");
        }
        public Hello_world()
        {
            System.out.println("Constructor called");
        }
    public static void main(String[] args) 
    {
        Hello_world obj = new Hello_world();
        // Hello_world obj1 = new Hello_world();
        System.out.println("hello world");     
        
    }
}