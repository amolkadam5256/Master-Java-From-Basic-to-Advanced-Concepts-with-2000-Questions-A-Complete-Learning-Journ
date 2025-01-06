import java.util.Scanner;

public class Q11_UseBoolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num =input.nextInt();
        boolean isEven = (num%2 == 0);
        if(isEven){
            System.out.println("Number is even : " + num);
        }
        else {
            System.out.println("Number is odd : " + num);
        }
    }
}
