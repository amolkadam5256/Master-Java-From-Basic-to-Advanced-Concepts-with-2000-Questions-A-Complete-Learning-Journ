// Each String is left-justified with trailing whitespace through the first  characters. The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.
package HackerRankProblems;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        outPutFormat();
    }

    public static void outPutFormat() {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter String " + (i + 1) + " : ");
            String strInput = sc.next(); // Read single-word string

            System.out.print("Enter Integer " + (i + 1) + " : ");
            int intInput = sc.nextInt(); // Read integer

            // Print formatted output
            System.out.printf("%-15s%03d%n", strInput, intInput);
        }

        System.out.println("================================");

        sc.close(); // Close Scanner to prevent memory leak
    }
}
