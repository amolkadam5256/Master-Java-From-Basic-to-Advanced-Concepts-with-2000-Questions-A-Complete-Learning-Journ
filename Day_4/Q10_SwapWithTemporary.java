public class Q10_SwapWithTemporary {
    public static void main(String[] args){
        int a = 12 , b = 22 ,temp = 0 ;
        System.out.println("a = : " + a);
        System.out.println("b = : " + b);
        System.out.println("temp = : " + temp);

        temp = a ;
        a = b;
        b= temp;

        System.out.println("a = : " + a);
        System.out.println("b = : " + b);
        System.out.println("temp = : " + temp);
    }
}
