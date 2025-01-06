import java.util.Scanner;

public class Q20_AreaTringle {
    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner input = new Scanner(System.in);

        // Prompt the user for the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        int base = input.nextInt();

        System.out.print("Enter the height of the triangle: ");
        int height = input.nextInt();

        // Calculate the area of the triangle
        int area = (base * height) / 2;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the scanner to prevent memory leak
        input.close();
    }
}
