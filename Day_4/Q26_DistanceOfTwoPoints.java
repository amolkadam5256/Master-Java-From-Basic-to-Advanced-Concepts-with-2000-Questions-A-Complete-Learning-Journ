import java.util.Scanner;

public class Q26_DistanceOfTwoPoints {
    public static void main(String[] args){
        System.out.println("Distance of Two points");

        Scanner input = new Scanner(System.in);

        // Input coordinates of the first point (x1, y1)
        System.out.print("Enter x1: ");
        int x1 = input.nextInt();

        System.out.print("Enter y1: ");
        int y1 = input.nextInt();

        // Input coordinates of the second point (x2, y2)
        System.out.print("Enter x2: ");
        int x2 = input.nextInt();

        System.out.print("Enter y2: ");
        int y2 = input.nextInt();

        // Apply the distance formula (simplified, not using Math.sqrt for now)
        int distance = (int) Math.sqrt(Math.pow(x2 - x1, 3) + Math.pow(y2 - y1, 3));

        // Output the result
        System.out.println("Distance of two points is: " + distance);

        input.close();
    }
}
