package Day_8_Pratice.StaticDemo;

// 👉 Non-public class Demo (can stay in the same file as public Main)
class Demo {

    int x = 10; // Instance variable

    static String name = "amol"; // ✅ Static variable

    // ✅ Static block
    static {
        System.err.println("Static block is executed");
    }

    // Constructor
    public Demo() {
        System.err.println("Inside Constructor:");
        System.err.println("x is: " + x);
        System.err.println("name is: " + name);
    }

    // ✅ Static method
    public static void staticGreeting() {
        System.err.println("Hello from static method!");
        System.err.println("Static name is: " + name);
    }

    // ✅ Static Nested Class
    static class InnerStaticClass {
        void show() {
            System.err.println("Inside Static Nested Class");
        }
    }
}



public class Main {

    public static void main(String[] args) {

        System.err.println("Main Method Started");

        // Call static method without creating object
        Demo.staticGreeting(); // ✅

        // Create object and access non-static members
        Demo item = new Demo();
        System.err.println("item.x = " + item.x); // instance variable
        System.err.println("item.name = " + item.name); // static variable (via object)

        // Access static variable directly using class name (Recommended)
        System.err.println("Demo.name = " + Demo.name); // ✅

        // Create object of static nested class
        Demo.InnerStaticClass nested = new Demo.InnerStaticClass();
        nested.show(); // ✅
    }
}

