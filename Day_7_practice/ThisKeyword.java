// File: ThisKeyword.java
public class ThisKeyword {
    public static void main(String[] args) {
        // Creating an object of Car with a parameter
        System.out.println("Hello Everyone! Today we learn This Keyword in Java.");
        Car carObj = new Car("Lamborghini");

        System.out.println("");
        // Creating an object of Calculator with parameters
        Calculator calcObj = new Calculator(20, 10);
        carObj.method1();
        System.out.println("");

        // Performing arithmetic operations
        System.out.println("Addition: " + calcObj.add());
        System.out.println("Subtraction: " + calcObj.subtract());
        System.out.println("Multiplication: " + calcObj.multiply());
        System.out.println("Division: " + calcObj.divide());
    }
}

class Car {
    String carName = "Ferrari";

    // Constructor with a parameter
    public Car(String carName) {
        this.carName = carName; // Assigning local parameter to instance variable
        System.out.println(this.carName); // Printing the instance variable
    }

    void method1() {
        System.out.println("Method1 is called");
        this.method2(); // Calling another method in the same class
    }

    void method2() {
        System.out.println("Method2 is called");
    }

}

class Calculator {
    int num1, num2;

    // Parameterized constructor
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Method for addition
    public int add() {
        return this.num1 + this.num2;
    }

    // Method for subtraction
    public int subtract() {
        return this.num1 - this.num2;
    }

    // Method for multiplication
    public int multiply() {
        return this.num1 * this.num2;
    }

    // Method for division
    public double divide() {
        if (this.num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return (double) this.num1 / this.num2;
    }
}
