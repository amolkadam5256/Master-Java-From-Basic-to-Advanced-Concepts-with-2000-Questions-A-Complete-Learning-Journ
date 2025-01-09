import java.util.Scanner;

public class Q35_ClockConveter12_to_24 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Time For 24 Hour Format :");
        int H;
        int M;
        int tempH;
        String label = "";
        // use input Houre and check it is valid or not

        while (true) {
            System.out.print("Enter Time For 24 Hour:");
            H = input.nextInt();

            if (H >= 0 && H <= 23) {
                System.out.println("Hour input is valid: " + H);
                break;
            } else {
                System.out.println("Error: Invalid hour. Please enter a value between 0 and 23.");
            }
        }

        // use input Minute and check it is valid or not
        while (true) {
            System.out.print("Enter Time In Minute :");
            M = input.nextInt();

            if (M >= 0 && M <= 59) {
                System.out.println("Minute input is valid: " + M);
                break;
            } else {
                System.out.println("Error: Invalid Minute. Please enter a value between 0 and 59.");
            }
        }
        // Show Am Or PM on Time Base

        if (H == 0) {
            label = "AM";
        } else if (H <= 11) {
            label = "AM";
        } else if (H >= 12) {
            label = "PM";
        } 

        System.out.println("This Time is 24 Hour Format  :" + H + ":" + M + " " + label);

        if (H < 12) {
            System.out.println("This Time is 12 Hour Format  :" + H + ":" + M + " " + label);
        } else {
            tempH = H - 12;
            H = tempH;
            System.out.println("This Time is 12 Hour Format  :" + H + ":" + M + " " + label);
        }

        input.close();
    }
}
