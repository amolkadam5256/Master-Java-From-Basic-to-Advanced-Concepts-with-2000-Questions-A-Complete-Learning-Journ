package PatternPrograms;

import java.util.Scanner;

public class Q03_LeftTopBottomPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of Rows to print: ");
        int n = input.nextInt();

        // First part of the pattern (left-aligned increasing stars)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Second part of the pattern (full stars with spaces after)
        for (int i = 1; i <= n; i++) {
            // Print stars
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            // Print spaces after stars
            System.out.println();
        }

        input.close();
    }
}
