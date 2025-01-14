package Day_5_Pratic;

public class Pratice {

    public static void main(String[] args) {
        // Call the Process_Oriented method
        Process_Oriented();

        // Call the Object-Oriented method
        ObjectOriented();
    }

    // Process-Oriented Approach (Procedural Programming)
    public static void Process_Oriented() {
        System.out.println("Process-Oriented Approach (Procedural Programming):\n" +
                "\nThis approach emphasizes functions or procedures to perform tasks.\n" +
                "In this approach, methods are typically not tied to a specific object or class.\n" +
                "The program is structured as a sequence of instructions to manipulate data.\n");

        // Variables for the calculation
        int num1 = 10;
        int num2 = 5;

        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);

        // Perform the operations using procedural methods
        add(num1, num2);
        subtract(num1, num2);
    }

    // Function to add two numbers (Process-Oriented)
    public static void add(int num1, int num2) {
        int result = num1 + num2;
        System.out.println("Addition Result: " + result);
    }

    // Function to subtract two numbers (Process-Oriented)
    public static void subtract(int num1, int num2) {
        int result = num1 - num2;
        System.out.println("Subtraction Result: " + result);
    }

    // Object-Oriented Approach
    public static void ObjectOriented() {
        System.out.println("\nObject-Oriented Approach:\n" +
                "In this approach, data and methods are encapsulated in classes and objects.\n" +
                "Each object can have attributes (variables) and behaviors (methods).\n");

        // Create an instance of the Calculator class and perform operations
        Calculator calc = new Calculator();
        calc.num1 = 10;
        calc.num2 = 5;
        calc.add(); // Calling add method of Calculator class
        calc.subtract(); // Calling subtract method of Calculator class
    }

    // Calculator class for Object-Oriented Approach
    static class Calculator {
        int num1;
        int num2;

        // Method to add two numbers (Object-Oriented)
        public void add() {
            int result = num1 + num2;
            System.out.println("Addition Result: " + result);
        }

        // Method to subtract two numbers (Object-Oriented)
        public void subtract() {
            int result = num1 - num2;
            System.out.println("Subtraction Result: " + result);
        }
    }
}
