import java.util.Scanner;

public class SwitcDemo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any choice :");
        int dayNumber = sc.nextInt();
        String switchval = switch (dayNumber) {
            case 1 ->
                "Monday";
            case 2 ->
                "Sunday";
            case 3 ->
                "Tuesday";
            case 4 ->
                "Wednesday";
            case 5 ->
                "Thursday";
            case 6 ->
                "Friday";
            case 7 ->
                "Saturday";
            default ->
                "Invalid day";
        };

        System.out.println(" day is :" + switchval);
    }
}
