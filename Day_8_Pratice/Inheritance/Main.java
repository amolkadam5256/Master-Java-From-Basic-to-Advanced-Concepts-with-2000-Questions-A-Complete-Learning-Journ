package Day_8_Pratice.Inheritance;

// Parent class or Superclass
class Animal {

    // Method of parent class
    void eat(){
        System.out.println("Dog is Eat Food "); // Output when eat() is called
    }
}

// Child class or Subclass that inherits from Animal
class Dog extends Animal {

    // Method specific to Dog class
    void bark(){
        System.out.println("Dog barks"); // Output when bark() is called
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Animal is :");

        // Creating object of Dog class
        Dog d1 = new Dog();

        // Calling method of parent class using child class object
        d1.eat();  // Inherited method from Animal class

        // Calling method of child class
        d1.bark(); // Method of Dog class
    }
}
