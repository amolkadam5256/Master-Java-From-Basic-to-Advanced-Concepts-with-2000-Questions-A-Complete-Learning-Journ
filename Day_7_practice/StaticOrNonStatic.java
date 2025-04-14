// Define a class named Example
class Example {

    // Instance variable - specific to each object created from the class
    int age;

    // Static variable - shared among all objects of the class, can be accessed without an object
    private static int age2 = 222;

    // Static method - can be called using class name, without creating an object
    public static void demo1() {
        System.out.println("Hello Demo1 method or function");

        // Accessing static variable directly in a static method ✅ allowed
        System.out.println("age :" + age2);
    }

    // Non-static method - requires an object to be called
    public void demo2() {
        System.out.println("Hello Demo2 method or function");

        // Accessing instance variable ✅ allowed
        System.out.println("age :" + age);

        // Accessing static variable ✅ also allowed
        System.out.println("age :" + age2);
    }
}

// Define another class named Outer
class Outer {

    // Static method
    public static void main(String[] args) {
        System.out.println("Outer class static main() method");
    }

    // Non-static method
    public void show() {
        System.out.println("Outer class show() method");
    }

    // Another non-static method (renamed from Inner)
    public void Inner() {
        System.out.println("Outer class Inner() method");
    }
}

// Main class
class StaticOrNonStatic {

    public static void main(String[] args) {

        // Print a welcome message
        System.out.println("Hello World");

        // Call static method from Example class
        Example.demo1();

        // Create object of Example to call non-static method
        Example obj = new Example();
        obj.demo2();

        // Call static method from Outer class
        // Outer.main(args);

        // Create object of Outer class
        Outer dem = new Outer();
        dem.show();     // Call show()
        dem.Inner();    // Call Inner()
        
    }
}
