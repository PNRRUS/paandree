package Figures_Hemul;

public class Rectangle extends Figure{
    int sideA;
    int sideB;

    public Rectangle(int x, int y, int sideA, int sideB) {
        super(x, y);
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public void square() {
        System.out.println("Square: " + sideA * sideB);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Rectangle moved: " + "dx=" + dx + " dy=" +dy);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
