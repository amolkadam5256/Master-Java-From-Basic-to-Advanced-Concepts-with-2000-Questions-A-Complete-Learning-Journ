import javax.swing.*;
import java.awt.*;

public class CubeDrawing extends JPanel {

    // Override the paintComponent method to draw the cube
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set anti-aliasing for smooth lines
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Coordinates for the front and back vertices of the cube
        int x1 = 100, y1 = 100; // front top-left corner
        int x2 = 200, y2 = 100; // front top-right corner
        int x3 = 200, y3 = 200; // front bottom-right corner
        int x4 = 100, y4 = 200; // front bottom-left corner

        int x5 = 150, y5 = 50;  // back top-left corner
        int x6 = 250, y6 = 50;  // back top-right corner
        int x7 = 250, y7 = 150; // back bottom-right corner
        int x8 = 150, y8 = 150; // back bottom-left corner

        // Drawing the front face of the cube
        g2d.drawLine(x1, y1, x2, y2);
        g2d.drawLine(x2, y2, x3, y3);
        g2d.drawLine(x3, y3, x4, y4);
        g2d.drawLine(x4, y4, x1, y1);

        // Drawing the back face of the cube
        g2d.drawLine(x5, y5, x6, y6);
        g2d.drawLine(x6, y6, x7, y7);
        g2d.drawLine(x7, y7, x8, y8);
        g2d.drawLine(x8, y8, x5, y5);

        // Connecting the front face to the back face (lines to create depth)
        g2d.drawLine(x1, y1, x5, y5);
        g2d.drawLine(x2, y2, x6, y6);
        g2d.drawLine(x3, y3, x7, y7);
        g2d.drawLine(x4, y4, x8, y8);
    }

    // Main method to run the program
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        CubeDrawing cubePanel = new CubeDrawing();
        frame.add(cubePanel);
        frame.setSize(1000, 1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
