import java.util.Scanner;

public class arraysUtility {
    public static int[] inputArray(){
        Scanner  input = new Scanner(System.in);
        System.out.print("Please enter the number of elements : ");
        int size = input.nextInt();
        int[] nums = new int[size];
        int i=0;
        while(i < size){
            System.out.print("Enter the element of array : ");
            nums[i]= input.nextInt();
            i++;

        }

        return nums;
    }
}
