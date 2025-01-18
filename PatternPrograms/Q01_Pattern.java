package PatternPrograms;

import java.util.Scanner;

public class Q01_Pattern {
    public static void main(String[] args) {
        // star pattern 1

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number To Print Pattern :");
        int n = input.nextInt();

        // print row
        for (int i = 1; i <= n; i++) {

            // print coloum
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // add next line 
            System.out.println();
        }

        input.close();
    }

}
