import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {
        // Print the program title
        System.out.println("Electricity Bill Calculator");

        // Create a Scanner object to get user input
        Scanner input = new Scanner(System.in);

        // Prompt the user for electri~city usage in kWh
        System.out.print("Enter electricity usage in kWh: ");
        double usageInKWh = input.nextDouble();  // Store usage in kilowatt-hours

        // Prompt the user for rate per kWh
        System.out.print("Enter rate per kWh (in your currency): ");
        double ratePerKWh = input.nextDouble();  // Store the rate per kWh

        // Calculate the electricity bill
        double billAmount = usageInKWh * ratePerKWh;

        // Display the calculated bill amount
        System.out.printf("Your electricity bill is: %.2f\n", billAmount);

        // Close the scanner to release resources
        input.close();
    }
}
