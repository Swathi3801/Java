public class ObjectCom
{    public static void main(String[] args)
    {
        book b1 = new book(1 , "haripoter");//b1 and b2 are the type of class
        Student b2 = new Student(1 , "haripoter");
       //book b2=null;
      if(b1.hashCode() == b2.hashCode())
        {
            if(b1.equals(b2))
                System.out.println("Both Objects are equal. ");
            else
                System.out.println("Both Objects are not equal. ");
        }
        else
        System.out.println("Both Objects are not equal. ");
    }
}