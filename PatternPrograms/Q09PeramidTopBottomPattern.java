
import java.util.Scanner;

public class Q09PeramidTopBottomPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number oF Rows :");
        int n = input.nextInt();

        for (int i = 0; i <= n - 1; i++) { // For loop for Rows

            for (int j = 0; j <= i; j++) { // For loop for Col

                System.out.print("0"); // blank space

            }

            for (int k = 0; k <= n - 1 - i; k++) {

                System.out.print("*" + " "); // prints * and blank space

            }

            System.out.println(); // Next line

        }

    }
}
