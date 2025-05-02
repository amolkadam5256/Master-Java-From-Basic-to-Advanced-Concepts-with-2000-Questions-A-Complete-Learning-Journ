package Day_8_Pratice.StaticDemo;

// 👇 Non-public class (can be in the same file as Main if not public)
class Demo {

    // 🔵 Non-static (Instance) variable
    int x = 10;

    // 🔴 Static (Class-level) variable
    static String name = "amol";

    // 🔴 Static block (runs only once when class is loaded)
    static {
        System.err.println("Static block is executed");
    }

    // 🔵 Constructor (called when object is created)
    public Demo() {
        System.err.println("Inside Constructor:");
        System.err.println("x is: " + x);           // instance variable
        System.err.println("name is: " + name);     // static variable
    }

    // 🔴 Static Method (can be called without object)
    public static void staticGreeting() {
        System.err.println("Hello from static method!");
        System.err.println("Static name is: " + name); // access static variable directly
        // Cannot access instance variable x here without object ❌
    }

    // 🔵 Non-static Method  instance Method
    public void sum() {
        int x = 2;
        int y = 3;
        int sum = x + y;
        System.err.println("sum is :" + sum);
    }

    // 🔴 Static Nested Class
    static class InnerStaticClass {
        void show() {
            System.err.println("Inside Static Nested Class");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        System.err.println("Main Method Started");

        // ✅ Static Method - Call using class name (preferred)
        Demo.staticGreeting();

        // ✅ Create object to access instance members
        Demo item = new Demo();

        // ✅ Access instance variable
        System.err.println("item.x = " + item.x); // 10

        // ✅ Access static variable (not recommended via object)
        System.err.println("item.name = " + item.name);

        // ✅ Access static variable (recommended way)
        System.err.println("Demo.name = " + Demo.name);

        // ✅ Call instance method
        item.sum();

        // ✅ Access static nested class
        Demo.InnerStaticClass nested = new Demo.InnerStaticClass();
        nested.show();
    }
}
