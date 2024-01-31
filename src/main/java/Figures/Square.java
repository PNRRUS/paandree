package Figures;

public class Square extends Figure{
    int str;
    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void S() {
        System.out.println(str * str);
    }

    @Override
    public String toString() {
        return "kvadratic {" +
                "str=" + str +
                ", x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}