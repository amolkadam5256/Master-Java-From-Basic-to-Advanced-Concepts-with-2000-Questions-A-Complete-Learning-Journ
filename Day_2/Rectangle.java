import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for length and breadth
        System.out.print("Enter length :");
        double l = input.nextDouble();
        System.out.print("Enter breadth :");
        double b = input.nextDouble();

        // Call methods with passed parameters
        PerimeterOfRectangle(l, b);
        AreaOfRectangle(l, b);
    }

    // Method to calculate perimeter
    public static void PerimeterOfRectangle(double length, double breadth ) {
        // Calculate perimeter
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }

    // Method to calculate area
    public static void AreaOfRectangle(double length, double breadth) {
        // Calculate area
        double area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }
}

