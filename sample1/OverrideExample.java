// class Animal
// {  
// void eatSomething()
// {
//     System.out.println("eating something");
// }
// }  
  
// class Dog extends Animal
// {  
// @Override  
// void eatSomething()
// {
//     System.out.println("eating foods");
// }
  
// public static class Override1 {
//     public static void main(String[] args) {
        
//         Animal a=new Dog();  
//         a.eatSomething();  
         
//     }
// }
// }



class Override1 {
	public void display()
	{
		System.out.println("Base display");
	}
}


class Derived extends Override1 {

	@Override public void display()
	{
		System.out.println("Derived display");
	}
}

	public class OverrideExample
	{
	public static void main(String args[])
	{
		Derived obj = new Derived();
		obj.display();
	}
}
	