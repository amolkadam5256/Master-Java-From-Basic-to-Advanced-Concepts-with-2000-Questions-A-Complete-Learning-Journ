package PatternPrograms;

import java.util.Scanner;

public class Q06_PyramidPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pattern No 4 right ");

        System.out.print("Enter number of column :");
        int n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int k=i ; k<n;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n; i >= 0; i--) {
            for(int k=i; k<n;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();   
        }
        input.close();

    }
}
