import java.util.Scanner;

public class Q17_round {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for three decimal numbers
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = input.nextDouble();

        // Calculating the sum
        double sum = num1 + num2 + num3;

        // Printing the result rounded to 2 decimal places
        System.out.printf("The sum of the numbers rounded to 2 decimal places is: %.2f%n", sum);

        // Closing the scanner to avoid resource leak-
        input.close();
    }
}
