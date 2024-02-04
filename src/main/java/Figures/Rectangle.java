package Figures;

import java.awt.*;

public class Rectangle extends Figure{
    int dlina;
    int shirina;
    public Rectangle(int x, int y) {
        super(x, y);
    }

    public Rectangle(int x, int y, int dlina, int shirina) {
        super(x, y);
        this.dlina = dlina;
        this.shirina = shirina;
    }

    public Rectangle() {
    }

    public void draw3DRect(Rectangle rect1, Graphics cOval) {
        cOval.draw3DRect(x ,y ,shirina,dlina,true);
        cOval.draw3DRect(x - 1,y -1,shirina,dlina,true);
        cOval.draw3DRect(x + 1,y +1,shirina,dlina,true);
    }

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
