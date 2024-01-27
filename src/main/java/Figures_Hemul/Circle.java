package Figures_Hemul;

import java.awt.*;

public class Circle extends Figure{

    int radius;


    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void square() {
        System.out.println("Square: " + Math.PI * radius * radius);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Circle moved: " + "dx=" + dx + " dy=" +dy);
    }

    public void drawCircle (Circle d, Graphics graphics) {
        graphics.drawOval(d.x, d.y, d.radius, d.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
