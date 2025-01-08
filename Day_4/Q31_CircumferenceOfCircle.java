import java.util.Scanner;

public class Q31_CircumferenceOfCircle {

    public static void main(String[] args) {
        System.out.println("calculate the circumference of a circle ?");

        // Circumference = 2 × π × r,

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius of Circle :");
        int radius = input.nextInt();
        final Float PI = 3.14159f;
        float Circumference = 2 * (PI * radius);

        System.out.println("the circumference of a circle is :" + Circumference);
    }
}