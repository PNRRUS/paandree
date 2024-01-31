package Figures;

public class Rectangle extends Figure{
    int dlina;
    int shirina;

    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void S() {
System.out.println(dlina * shirina);
    }

    @Override
    public String toString() {
        return "primougolinic {" +
                "dlina=" + dlina +
                ", shirina=" + shirina +
                ", x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}
