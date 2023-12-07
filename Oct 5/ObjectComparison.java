public class ObjectComparison 
{    public static void main(String[] args)
    {
        book b1 = new book(1 , "haripoter");//b1 and b2 are the type of class
        book b2 = new book(1 , "haripoter");
        if(b1.hashCode() == b1.hashCode())
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

class book

{
    int id;
    String name ;
    book(int id ,  String name)
    {
     this.name = name;

     this.id = id;
    }

    public boolean equals(Object b2)
   {
      if(this == b2)
            return true;
        if(b2 == null || b2.getClass()!= this.getClass())
            return false;

            //typecasting from larger object to smaller object(i.e)downcasting
        book book = (book) b2;
        return (book.name == this.name && book.id == this.id);
   }
   public int hashCode()
   {
    return this.id;
   }
}

