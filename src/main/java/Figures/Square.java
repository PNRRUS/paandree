package Figures;

public class Square extends Figure{
    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void S() {
        System.out.println(x * y);
    }

    @Override
    public String toString() {
        return "Square{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
