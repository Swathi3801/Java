class Parent
{
    void run()
    {
        System.out.println("Parent class is running");
    }
}

class FinalChild extends Parent
{
    void run()
    {
        System.out.println("Child class is running");
    }
}

public class FinalExample 
{
    public static void main(String[] args) {
        Parent obj=new FinalChild();
        obj.run();

    }
}
    

