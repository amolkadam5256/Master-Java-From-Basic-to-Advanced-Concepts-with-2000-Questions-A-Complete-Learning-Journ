import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal, rate, time, and compounding frequency
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual interest rate (r) in percentage: ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time (t) in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int compoundingFrequency = scanner.nextInt();

        // Convert rate to decimal
        rate = rate / 100;

        // Calculate the final amount (A)
        double amount = principal * Math.pow(1 + (rate / compoundingFrequency), compoundingFrequency * time);

        // Calculate compound interest
        double compoundInterest = amount - principal;

        // Output results
        System.out.printf("Final amount (A): %.2f%n", amount);
        System.out.printf("Compound interest (CI): %.2f%n", compoundInterest);
    }
}
