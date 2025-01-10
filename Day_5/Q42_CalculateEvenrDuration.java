import java.util.Scanner;

public class Q42_CalculateEvenrDuration {

    public static void main(String[] args) {
        System.out.println("Find Duration Between Start time and end time :");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Start Time in Hour: ");
        int startHour = sc.nextInt();

        System.out.print("Enter Start Time in Min :");
        int startMin = sc.nextInt();

        System.out.print("Enter End Time in Hour :");
        int endHour = sc.nextInt();

        System.out.print("Enter ENd Time in Min :");
        int endtMin = sc.nextInt();

        int totalStarmin = (startHour * 60) + startMin;
        System.out.println("Total Start minits :" + totalStarmin);

        int totalEndmin = (endHour * 60) + endtMin;
        System.out.println("Total End minits :" + totalEndmin);
        int durationMinutes = totalEndmin - totalStarmin;
        int durationHours = durationMinutes / 60;
        
        System.out.println("Total Duraction in Hour  :" + durationHours);
        System.out.println("Total Duraction in minits :" + durationMinutes);

        sc.close();
    }
}