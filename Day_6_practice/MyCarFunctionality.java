package Day_6_practice;

import java.util.Scanner;

public class MyCarFunctionality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for car model and mileage
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car mileage (km per liter): ");
        double mileage = scanner.nextDouble();

        // Creating an object of MyCar
        MyCar myCar = new MyCar(model, mileage);

        // Display initial car details
        myCar.displayCarInfo();

        // Refuel the car
        System.out.print("Enter fuel amount to refuel (liters): ");
        double fuelAmount = scanner.nextDouble();
        myCar.refuel(fuelAmount);

        // Drive the car
        System.out.print("Enter distance to drive (km): ");
        double distance = scanner.nextDouble();
        myCar.drive(distance);

        // Accelerate the car
        System.out.print("Enter speed to accelerate (km/h): ");
        double speedIncrease = scanner.nextDouble();
        myCar.accelerate(speedIncrease);

        // Brake the car
        System.out.println("Press any key to apply brakes...");
        scanner.nextLine(); // Consume newline
        scanner.nextLine(); // Wait for user input
        myCar.brake();

        // Display final car details
        myCar.displayCarInfo();

        scanner.close();
    }
}
