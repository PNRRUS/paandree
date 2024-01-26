package Figures_Hemul;

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

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
