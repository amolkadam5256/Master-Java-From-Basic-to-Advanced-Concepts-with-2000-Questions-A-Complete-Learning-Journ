package PatternPrograms;

import java.util.Scanner;

public class Q07PeramidPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number oF Rows :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = n-1; k >= i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("  1 ");
            }
            System.out.println();
        }
    }
}
