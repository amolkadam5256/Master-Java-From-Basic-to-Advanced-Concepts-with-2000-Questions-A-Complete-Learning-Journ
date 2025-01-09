// on persantage show student Grade on basic of marks 

import java.util.Scanner;

public class Q34_GradeOfStudent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student Marks :");
        float marks = input.nextFloat();
        if (marks >= 100) {
            System.out.println("Student Grade is : High Score (A++)");
        } else if (marks > 95) {
            System.out.println("Student Grade is : High Score (A++)");
        } else if (marks > 80) {
            System.out.println("Student Grade is : Pass (B++)");
        } else if (marks > 50) {
            System.out.println("Student Grade is : Pass (C++)");
        } else if (marks >= 35) {
            System.out.println("Student Grade is : Pass (D++)");
        } else {
            System.out.println("Student Grade is : Fall (F)");
        }

        input.close();
    }

}
