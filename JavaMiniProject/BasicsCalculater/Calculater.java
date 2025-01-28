import java.util.Scanner;

public class Calculater {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculate Me \u263A");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {

            // Display menu
            System.out.println("Enter You Witch Operation you want to  performe :");
            System.out.println("=== Advanced Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Power");
            System.out.println("6. Square Root");
            System.out.println("7. Factorial");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            

            switch (choice) {

                case 1:
                    System.out.print("Enter Number 1 :");
                    int a = scanner.nextInt();
                    System.out.print("Enter Number 2 :");
                    int b = scanner.nextInt();
                    int c = a + b;
                    System.out.println("Addition of A and B Is : " + c);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter Number 1 :");
                    int a1 = scanner.nextInt();
                    System.out.print("Enter Number 2 :");
                    int b1 = scanner.nextInt();
                    int c1 = a1 - b1;
                    System.out.println("Subtraction of A and B Is : " + c1);
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter Number 1 :");
                    int a2 = scanner.nextInt();
                    System.out.print("Enter Number 2 :");
                    int b2 = scanner.nextInt();
                    int c2 = a2 * b2;
                    System.out.println("Multiplication of A and B Is : " + c2);
                    System.out.println();
                    break;

                case 4:
                    System.out.print("Enter Number 1 :");
                    int a3 = scanner.nextInt();
                    System.out.print("Enter Number 2 :");
                    int b3 = scanner.nextInt();
                    int c3 = a3 / b3;
                    System.out.println("Division of A and B Is : " + c3);
                    System.out.println();
                    break;

                case 5:
                    System.out.print("Enter Number :");
                    int a4 = scanner.nextInt();
                    System.out.print("Enter Pow   :");
                    int b4 = scanner.nextInt();
                    System.out.println("Power of A and B Is : " + Math.pow(a4, b4));
                    System.out.println();
                    break;

                case 6:
                    System.out.print("Enter Number :");
                    int a5 = scanner.nextInt();
                    System.out.println("Square Root of A and B Is : " + Math.sqrt(a5));
                    System.out.println("square of A and B Is : " + (a5 * a5));
                    System.out.println();
                    break;

                case 7:
                    System.out.print("Enter Number :");
                    int a6 = scanner.nextInt();
                    int result = 1;
                    for (int i = 1; i <= a6; i++) {
                        result *= i;
                    }
                    System.out.println("factorial of A and B Is : " + result);
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 8.");
                    break;
            }

            scanner.nextLine();

        } while (choice != 8);

        scanner.close();
    }

}
