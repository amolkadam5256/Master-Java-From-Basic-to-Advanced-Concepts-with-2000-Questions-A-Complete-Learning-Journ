package Day_8_Pratice.Constructors;

class Box {
    int length, width;

    // Default Constructor
    Box() {
        length = 10;
        width = 5;
    }

    // One-parameter Constructor
    Box(int l) {
        length = l;
        width = l;
    }

    // Two-parameter Constructor
    Box(int l, int w) {
        length = l;
        width = w;
    }

    void display() {
        System.out.println("Length: " + length + ", Width: " + width);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Box b1 = new Box();         // Calls default constructor
        Box b2 = new Box(7);        // Calls constructor with one argument
        Box b3 = new Box(4, 6);     // Calls constructor with two arguments

        b1.display();
        b2.display();
        b3.display();
    }
}
