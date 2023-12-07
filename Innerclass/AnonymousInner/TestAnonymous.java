public class TestAnonymous 
{
    int id;
    public static void main(String args[])
    {  
        Eatable e=new Eatable() {

            @Override
            void eat() {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'eat'");
                System.out.println("nice fruits");
            }

            @Override
            void eat1() {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'eat1'");
                System.out.println("eat1");
            }
            
            
        };
        e.eat();
      e.eat1();
      e.msg();
      display();
       
        }  

        static void display(){
            System.out.println("display");
        }
}
