import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args) {

        Scanner inputChar = new Scanner(System.in);

        System.out.print("Enter a character: ");
        String input = inputChar.nextLine(); // Read the entire line

        // Check if the input length is valid for a single character
        if (input.length() == 1) {
            char ch = input.charAt(0); // Get the first character

            // Check if the ASCII value of ch is between 'a' and 'z'
            if (ch >= 'a' && ch <= 'z') {
                System.out.println(ch + " is a lowercase letter.");
            } else if (ch >= 'A' && ch <= 'Z') {
                System.out.println(ch + " is an uppercase letter.");
            } else {
                System.out.println(ch + " is not a valid lowercase or uppercase alphabet character.");
            }
        } else {
            System.out.println(" Please enter exactly one character.");
        }

        inputChar.close(); // Close the scanner
    }
}
