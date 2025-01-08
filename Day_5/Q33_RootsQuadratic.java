import java.util.Scanner;

public class Q33_RootsQuadratic {

    public static void main(String[] args) {
        // Algorithm to Find the Roots of a Quadratic Equation

        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if discriminant is greater than or equal to 0
        if (discriminant >= 0) {
            // Calculate the two real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // Display the roots
            System.out.println("The roots of the equation are: " + root1 + " and " + root2);
        } else {
            // If discriminant is negative, print complex roots
            System.out.println("The equation has complex roots.");
        }

        input.close();
    }
}
