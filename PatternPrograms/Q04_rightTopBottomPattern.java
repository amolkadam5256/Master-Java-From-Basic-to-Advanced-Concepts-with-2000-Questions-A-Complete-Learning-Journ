package PatternPrograms;

import java.util.Scanner;

public class Q04_rightTopBottomPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Pattern No 4 right ");

        System.out.print("Enter number of column :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = i; j <= (n - 1); j++) {
                System.out.print(" - ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        input.close();
    }
}