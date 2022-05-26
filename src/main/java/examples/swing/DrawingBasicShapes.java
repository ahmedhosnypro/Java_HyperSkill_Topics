package examples.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class DrawingBasicShapes extends JFrame implements MouseMotionListener {
    private boolean drawShape;
    private int rectX = 50;
    private int rectY = 50;
    final ActionListener shapeActionListener = e -> {
        drawShape = true;
        repaint();
    };

    public static void main(String[] args) {
        DrawingBasicShapes drawingBasicShapes = new DrawingBasicShapes();
        drawingBasicShapes.setVisible(true);
    }

    public DrawingBasicShapes() {
        super("Drawing Basic Shapes");
        setSize(500, 500);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);

        final JButton shapeButton = new JButton("Click for a square");
        shapeButton.addActionListener(shapeActionListener);
        add(shapeButton, BorderLayout.SOUTH);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);

        g.fillOval(250, 250, 50, 70);
        g.drawOval(50, 50, 50, 70);

        g.drawLine(100, 70, 200, 200);

        g.drawRect(300, 300, 100, 80);
        g.fillRect(50, 300, 100, 80);

        if (drawShape) {
            g.drawRect(350, 350, 100, 80);
        }
        g.setColor(Color.RED);
        g.fillRect(rectX, rectY, 50, 50);
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        rectX = e.getX();
        rectY = e.getY();
        repaint();
    }

    public void mouseMoved(MouseEvent e) {
    }
}
