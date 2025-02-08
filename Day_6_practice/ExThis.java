package Day_6_practice;

import java.util.Scanner;

public class ExThis {
    String FullName;
    int Myage;
    String Email;
    String Gender;
    String Dob; // Changed from int to String
    String Country;

    // Constructor for Personal Information
    ExThis(String FullName, int Myage, String Email, String Gender, String Dob, String Country) {
        this.FullName = FullName;
        this.Myage = Myage;
        this.Email = Email;
        this.Gender = Gender;
        this.Dob = Dob;
        this.Country = Country;
    }

    // Method to display personal info
    void Personal_Info() {
        System.out.println("\n--- Personal Information ---");
        System.out.println("Full Name: " + FullName);
        System.out.println("Age: " + Myage);
        System.out.println("Email: " + Email);
        System.out.println("Gender: " + Gender);
        System.out.println("Date of Birth: " + Dob);
        System.out.println("Country: " + Country);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter Your Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("\nEnter Your Age : ");
        int Myage = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Your Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Your Gender (Male/Female/Other): ");
        String gender = scanner.nextLine();
        
        System.out.print("Enter Your Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();
        
        System.out.print("Enter Your Country: ");
        String country = scanner.nextLine();
        
        // Create an object for personal information
        ExThis person2 = new ExThis(fullName, Myage, email, gender, dob, country);
        person2.Personal_Info();

        scanner.close();

    }
}
