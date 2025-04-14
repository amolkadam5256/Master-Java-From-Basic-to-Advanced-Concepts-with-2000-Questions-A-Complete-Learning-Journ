
public class CLA {

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please provide at least 4 arguments.");
            return;
        }

        int i = 0;
        while (i <= 3) {
            System.out.println(args[i]);
            i++;
        }
    }
}


// CLA stands for Command Line Arguments — values passed to the main() method when you run a program.
// javac CLA.java
// java CLA amol amit ajit sham

// op

    // amol
    // amit
    // ajit
    // sham
