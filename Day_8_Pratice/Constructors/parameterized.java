// Package declaration - this code is part of the Day_8_Pratice.Constructors package
package Day_8_Pratice.Constructors;

// Declaring a class named 'parameterized'
public class parameterized  {
    // Two instance variables: name and age
    String name;
    int age;

    // This is a parameterized constructor that takes name and age as input
    public parameterized(String name, int age){
        // 'this' keyword is used to refer to the current class variables
        this.name = name;
        this.age = age;        
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        // Simple print statement to check output
        System.out.println("parameterized Constructor");

        // Creating an object of the class using the parameterized constructor
        parameterized d = new parameterized("Amol", 22);

        // Printing the object data
        System.out.println("name :" + d.name);  // Prints the name
        System.out.println("age :" + d.age);    // Prints the age
    }
}
