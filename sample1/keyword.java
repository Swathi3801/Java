//this and super keyword
public class keyword
{ 
    static int a = 10;
    int b = 20;
    public static void main(String[] args)
    {  
        keyword k = new keyword();
        superkey s = new superkey();
        s.t1();
    }

    void t1()
    {
        this.a = 100;
        System.out.println(this.a);
        System.out.println(this.b);
    }
}

class superkey extends keyword
{
    void t1()
    {
     super.b = 1000;
     System.out.println(super.b);
     super.t1();
    }
}
