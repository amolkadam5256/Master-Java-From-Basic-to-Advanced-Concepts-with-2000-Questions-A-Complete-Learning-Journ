package Day_6;

import java.util.Scanner;

public class Q43_quadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for coefficients
        System.out.print("Enter value of a: ");
        float a = input.nextFloat();
        System.out.print("Enter value of b: ");
        float b = input.nextFloat();
        System.out.print("Enter value of c: ");
        float c = input.nextFloat();

        // Check if 'a' is zero
        if (a == 0) {
            System.out.println("This is not a quadratic equation (a cannot be 0).");
            return;
        }

        float discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The equation has two distinct real roots:");
            System.out.printf("Root 1 = %.2f\n", root1);
            System.out.printf("Root 2 = %.2f\n", root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The equation has one repeated real root:");
            System.out.printf("Root = %.2f\n", root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The equation has complex roots:");
            System.out.printf("Root 1 = %.2f + %.2fi\n", realPart, imaginaryPart);
            System.out.printf("Root 2 = %.2f - %.2fi\n", realPart, imaginaryPart);
        }

        input.close();
    }
}
