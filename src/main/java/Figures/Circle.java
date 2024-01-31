package Figures;

public class Circle extends Figure{
    int r;

    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void S() {
        int a = (int)Math.PI * r * r;
System.out.println(a);
    }

    @Override
    public String toString() {
        return "krugoc {" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}
