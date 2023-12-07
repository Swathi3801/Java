// abstract class Vehicle{
//     abstract void brake();

//     void run()
//     {
//         System.out.println("Vehicle is running");

//     }
// }



// class Bike extends Vehicle
// {
//     void brake(){
//         System.out.println("bike brake is running");

//     }
//     void wheels()
//     {
//         System.out.println("Bike has 2 wheels");
//     }
// }

// class Car extends Vehicle{
//     void brake(){
//         System.out.println("Car brake is running");
//     }
//     void acceraltor(){
//         System.out.println("Acceralator is running");
//     }
//     void wheels()
//     {
//         System.out.println("Bike has 4 wheels");
//     }
// }
// public class Abstract_class {
//     public static void main(String[] args) {
//         Bike b=new Bike();
//         Car c=new Car();

//         b.run();
//         b.brake();
//         b.wheels();
//         c.brake();
//         c.acceraltor();
//         c.brake();

//     }
// }

abstract class Animal
 {
    abstract void walk();
    

    public void run()
    {
        System.out.println("Animal runs");
    }
    void eat()
    {
        System.out.println("Animal Eats");

    }

}

class Dog extends Animal
{
    void walk()
    {
        System.out.println("Dog walks..");
    }

    void bark()
    {
        System.out.println("Dog barks..");
    }
}

class Cat extends Animal
{
    void walk()
    {
        System.out.println("Cat walks..");
    }

    void meow()
    {
        System.out.println("cat meows");
    }
}

class Abstract_class {
    public static void main(String [] args)
{
    Dog d=new Dog();

    Cat c=new Cat();
    Cat c1= new Cat();

    // Animal a=new Dog();

    System.out.println(c.equals(c1));
    System.out.println(c.hashCode());
    System.out.println(c1.hashCode());
    System.out.println(c.toString());
    System.out.println(c1.toString());
    System.out.println(c);
    System.out.println(c1);
    c.run();
    c.eat();
    d.eat();
    d.walk();
    d.bark();
    c.walk();
    c.meow();
}
}