import java.util.Scanner;

public class EmiPlan{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        // Input: Principal loan amount ₹ 100000
        System.out.print("Enter the principal loan amount: ");
        double principal = scanner.nextDouble();

        // Input: Annual interest rate 1%
        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();

        // Input: Loan tenure in years 1 Yr
        System.out.print("Enter the loan tenure (in years): ");
        int tenureYears = scanner.nextInt();

        double monthlyRate = annualRate / (12 * 100);

        // Convert tenure to months
        int totalMonths = tenureYears * 12;

        // Calculate EMI using the formula
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                (Math.pow(1 + monthlyRate, totalMonths) - 1);

        // Output the EMI
        System.out.printf("The monthly EMI is: %.2f%n", emi);

        scanner.close();

    }
}