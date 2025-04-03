import javax.swing.JOptionPane;

public class ExplicitTypeCasting {
    public static void main(String[] args) {

        System.out.println("2. Explicit (Narrowing) Type Casting\n");

        double num = 9.78;
        int intNum = (int) num; // Explicit casting: double to int

        System.out.println("Double value: " + num);
        System.out.println("Integer value (after casting): " + intNum);
        
        JOptionPane.showMessageDialog(null, "Hello, World!");

    }
}
