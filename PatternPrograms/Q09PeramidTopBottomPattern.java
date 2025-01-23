package PatternPrograms;

import java.util.Scanner;

public class Q09PeramidTopBottomPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number oF Rows :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n; k++) {
                System.out.print(" 1 ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print(" 0 ");
            }
            System.out.println();
        }

    }
}
