package ZeroToHeroChallenge;

public class _001Pattern1 {

    static void pattern1() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern2() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }

     static void pattern3() {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10-i; j++) {

                System.out.print("  ");
            }
             for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    

    public static void main(String[] args) {
        System.out.println("Pattern 1 ");

        pattern1();
        System.out.println("Pattern 2 ");

        pattern2();
         System.out.println("Pattern 3 ");

        pattern3();
    }
}
