import java.util.Scanner;

public class ConvertTimeInSec {
    public static void main(String[] args){
        int hours , minutes, totalSeconds;

        Scanner input = new Scanner(System.in);
        hours = input.nextInt();
        minutes = input.nextInt();

        totalSeconds = (hours * 3600) + (minutes * 60);
        System.out.println("Total time in seconds: " + totalSeconds);
    }
}
