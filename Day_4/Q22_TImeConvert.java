import java.util.Scanner;

public class Q22_TImeConvert {
    public static void main(String[] args){
        System.out.println("Convert Hours and Minutes into Second ?");
        Scanner input= new Scanner(System.in);

        System.out.print("Enter Hours : ");
        int hours = input.nextInt();
        System.out.print("Enter minutes : ");
        int minutes = input.nextInt();
        int second ;
        int totalSeconds = (hours * 60 * 60) + (minutes * 60);
//      calculation  1 hours and 30 min = 5400 sec
//        1 * 60 = 60
//        60*60 = 3600
//        30 * 60 = 1800
//        3600 + 1800 = 5400
        System.out.println("Total Second in : " + hours +":"+ minutes + " is :" + totalSeconds);

        int totalmin = totalSeconds /60;
        System.out.println("Total minites is :" +  totalmin);


        float totalhours = totalmin /60.0f;
        System.out.println("Total hours is :" +  totalhours);
        input.close();

    }
}
