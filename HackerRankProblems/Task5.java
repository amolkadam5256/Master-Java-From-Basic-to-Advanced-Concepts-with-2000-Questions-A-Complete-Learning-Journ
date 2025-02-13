
package HackerRankProblems;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number To print Table : ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resutlt = i * n;
            System.out.println(i + " * " + n + " = " + resutlt);
        }
        sc.close();

    }
}
