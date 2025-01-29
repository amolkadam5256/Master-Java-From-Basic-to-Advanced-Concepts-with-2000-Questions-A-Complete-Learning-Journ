// Task

// In this challenge, you must read integers from stdin and then print them to
// stdout. Each integer must be printed on a new line. To make the problem a
// little easier, a portion of the code is provided for you in the editor below.

package HackerRankProblems;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read integers until there is no more input
        while (scanner.hasNext()) {
            int myInt = scanner.nextInt();
            System.out.println(myInt);
        }
        scanner.close();

    }
}
