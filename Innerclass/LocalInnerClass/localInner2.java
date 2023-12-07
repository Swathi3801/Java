class localInner2
{
 int data=30;
 void display()
 {
  int value=50;
  class Local
  {
   void msg()
   {
    System.out.println(data);
    }
  }
  Local l=new Local();
  l.msg();
 }
}
