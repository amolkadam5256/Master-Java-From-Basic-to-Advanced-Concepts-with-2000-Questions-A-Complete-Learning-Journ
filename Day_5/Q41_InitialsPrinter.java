import java.util.Scanner;

public class Q41_InitialsPrinter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Your Full Name With Follow THis Pattern firstname space midlename space and lastname ?");
        System.out.print("Enter Your Full Name :");
        String fullName = sc.nextLine();

        fullName = " " + fullName;

        System.out.println("Your Full Name is :" + fullName);
        int pos = fullName.lastIndexOf(" ");

        {

            System.out.println("Your Initials: Like A.K.Kadam ");
            System.out.print("Your Initials: ");
            for (int i = 0; i < pos; i++) {
                if (fullName.charAt(i) == ' ') {
                    // Get the first character of the next word (after a space)
                    System.out.print(fullName.charAt(i + 1) + ".");
                }
            }

            System.out.print(fullName.substring(pos));
            System.out.println("\n");
        }
        {

            System.out.println("\n");
            System.out.println("Your Initials : Like A.T.K ");
            System.out.print("Your Initials: ");
            for (int i = 0; i < fullName.length(); i++) {
                if (fullName.charAt(i) == ' ') {
                    // Get the first character of the next word (after a space)
                    System.out.print(fullName.charAt(i + 1) + ".");
                }
            }
        }

    }
}
