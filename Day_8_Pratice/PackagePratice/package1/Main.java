package Day_8_Pratice.PackagePratice.package1;

import Day_8_Pratice.PackagePratice.package2.ShowPersonalData;
import Day_8_Pratice.PackagePratice.package2.CarData;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello! Let's input your personal data.");
        collectAndDisplayData();
        CarDataDisplay();
    }

    // 🔹 Method to collect user input and display info
    public static void collectAndDisplayData() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Full Name: ");
        String fullName = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        System.out.print("Enter Gender: ");
        String gender = scanner.nextLine();

        ShowPersonalData display = new ShowPersonalData(fullName, age, gender);
        display.displayInfo();

        scanner.close();
    }

    //  carData show in details 
    public static void CarDataDisplay() {


        CarData carObj = new CarData("Honda", "City", 2021, "White", 18.7);
        carObj.displayCarInfo();
    }
}
