public class squareName {
    public static void main(String[] args){
                String leftText = "Welcome";
                String rightText = "to Java!";

                // %-15s aligns left in a 15-character width, %15s aligns right in a 15-character width
                System.out.printf("%-15s %100s\n", leftText, rightText);

    }
}
