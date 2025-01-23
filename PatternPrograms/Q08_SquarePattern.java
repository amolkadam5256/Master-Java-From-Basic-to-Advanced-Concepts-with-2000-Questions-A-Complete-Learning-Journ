import java.util.Scanner;

public class Q08_SquarePattern {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number of row to Print :");
        int n = input.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}