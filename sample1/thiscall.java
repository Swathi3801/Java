//Constructor chaining or this call 

class thiscall
{

thiscall()
{
    this(10);
    System.out.println("default is running");
}

thiscall(int a)
{
    this("String");
    System.out.println("Integer is running");
}

thiscall(String s)
{
    this("string1","string1");
    System.out.println("String is running");
}

thiscall(String a,String b)

{
    System.out.println("String1 is running");
}


public static void main(String[] args) {
    thiscall obj=new thiscall();
}
}