package examples.swing;

import javax.swing.*;
import java.awt.*;

public class Oval extends JFrame {

    public static void main(String[] args) {
        Oval drawing = new Oval();
        drawing.setVisible(true);
    }

    public Oval() {
        super("Oval Picture");

        setSize(500, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);

        g.fillOval(250, 250, 50, 50);
        g.drawOval(50, 50, 50, 50);

        g.drawLine(100, 70, 200, 200);

        g.drawRect(300, 300, 100, 100);
        g.fillRect(50, 300, 100, 100);
    }
}