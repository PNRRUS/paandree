package Figures;

import java.awt.*;

public class Square extends Figure{
    int str;

    public Square(int x, int y) {
        super(x, y);
    }

    public Square(int str) {
        this.str = str;
    }

    public Square(int x, int y, int str) {
        super(x, y);
        this.str = str;
    }

    public Square() {
        super();
    }
    public void drawSquare(Square square, Graphics cOval) {
        cOval.drawRect(x ,y ,str,str);
        cOval.drawRect(x - 1,y -1,str,str);
        cOval.drawRect(x + 1,y +1,str,str);
    }
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
