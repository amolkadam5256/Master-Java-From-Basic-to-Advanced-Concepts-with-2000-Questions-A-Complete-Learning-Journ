import java.util.Scanner;

public class ArrayAcceptPrint {
    public static void main(String[] args){
        System.out.println("Accept array form user and print ?");

        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        int n=0;
        while (i<size){
            System.out.print("Enter element : ");
            nums[i]=input.nextInt(); //i = 0 now
            i++;
        }
        while (n<size){
            System.out.println("element index no " +  nums[n]);
            n++;
        }
    }
}
