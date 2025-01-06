import java.util.Scanner;

public class Q25_Avrage {
    public static void main(String[] args){
        System.out.println("Enter any five number Find avrage of number");
        Scanner input =new Scanner(System.in);

        int[] arr = new int[6];
        for (int i=1 ; i<arr.length; i++){
            arr[i] = input.nextInt();
        }

        for (int i=1 ; i<arr.length; i++){
            System.out.println("array index [" + i + "] : "+ arr[i]);
        }

        int sum = 0;
        for (int i=1 ; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of array is : "+ sum);

        double avrage = sum/(double)arr.length;

        System.out.println("Avrage  of array is : "+ avrage);


        input.close();



    }
}
