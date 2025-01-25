
import java.util.Scanner;

public class Q02_RightTrianglePattern {
    public static void main(String[] args) {
        // star pattern 1

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number To Print Pattern :");
        int n = input.nextInt();

        // print row
        for (int i = 1; i <= n; i++) {

            // space loop
            for (int k = n; k >= i; k--) {
                System.out.print(" -");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        input.close();
    }

}
