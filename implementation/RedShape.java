package implementation;


import java.awt.*;
import javax.swing.*;

public class RedShape implements Interface {
    private int side;
    private int[] X, Y;


        // Swing states
    private JFrame frame;
    private Polygon polygon;
    
    // Define Constants
    private final int RADIUS = 50;
    private final int CenterX = 100;
    private final int CenterY = 100;


    public RedShape(int side) {
        this.side = side;
        this.X = new int[side];
        this.Y = new int[side];
        this.InitComponents ();
    }
    private void InitComponents () {
        this.frame = new JFrame();
        this.frame.setSize(400, 400);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    private void getCoordinates () {
        for (int i = 0; i < this.side; i++) {
            this.X[i] = (int) (CenterX + RADIUS * Math.cos(2 * Math.PI * i / this.side));
            this.Y[i] = (int) (CenterY + RADIUS * Math.sin(2 * Math.PI * i / this.side));
        }

    }

    public void draw() {
        this.getCoordinates();
        this.polygon = new Polygon (this.X, this.Y, this.X.length);
        JPanel p = Panel();

        this.frame.add (p);

        this.frame.pack ();
        this.frame.setVisible (true);

    }

    private JPanel Panel () {
        return new JPanel () {
            @Override 
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.RED);
                g.drawPolygon(polygon);
            }

            @Override 
            public Dimension getPreferredSize() {
                return new Dimension(400, 400);
            }
        };
    }


}