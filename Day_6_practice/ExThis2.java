package Day_6_practice;

import java.util.Scanner;

// Class to store personal information
class Person {
    String fullName;
    int age;
    String email;
    String gender;
    String dob;
    String country;

    // Constructor
    Person(String fullName, int age, String email, String gender, String dob, String country) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.country = country;
    }

    // Method to display personal info
    void displayInfo() {
        System.out.println("\n--- Personal Information ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Gender: " + gender);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Country: " + country);
    }
}

// Main class
public class ExThis2 {
    Person person; // Reference to Person class

    // Constructor that initializes Person class using this
    ExThis2(String fullName, int age, String email, String gender, String dob, String country) {
        this.person = new Person(fullName, age, email, gender, dob, country);
    }

    // Method to call Person's method using 'this'
    void showPersonalInfo() {
        this.person.displayInfo();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Your Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("\nEnter Your Age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Fix: Consume leftover newline

        System.out.print("\nEnter Your Email: ");
        String email = scanner.nextLine();

        System.out.print("\nEnter Your Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();

        System.out.print("\nEnter Your Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("\nEnter Your Country: ");
        String country = scanner.nextLine();

        // Creating ExThis object, which in turn creates a Person object
        ExThis2 ex = new ExThis2(fullName, age, email, gender, dob, country);
        
        // Calling method using 'this'
        ex.showPersonalInfo();

        scanner.close();
    }
}
