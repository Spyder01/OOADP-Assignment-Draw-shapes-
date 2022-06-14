

import java.util.*;
import implementation.RedShape;
import implementation.BlueShape;

import abstraction.DrawPolygon;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        DrawPolygon draw;

        System.out.println("Enter the Number of Sides to the shape to be drawn...");
        int sides = sc.nextInt();

        if (sides < 3) {
            System.out.println("There should be at least three sides to form a shape...");
            sc.close();
            return;
        }

        System.out.println ("Choose the color of your shape \n 1 for Red \n 2 for Blue");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: draw = new DrawPolygon (new RedShape(sides));
            break;
            case 2: draw = new DrawPolygon(new BlueShape(sides));
            break;
            default: System.out.println("Invalid Choice");
            sc.close();
            return;
        }

        sc.close();

        System.out.println("Shape will be shown now...");

        draw.draw();
    }
}