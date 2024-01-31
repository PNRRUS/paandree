package Figures;

import java.awt.*;

public class Circle extends Figure{
    public int r;

    public Circle() {
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }


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
    public void drawCircle(Circle dOval, Graphics cOval) {
        cOval.drawOval(dOval.x,dOval.y,dOval.r,dOval.r);
        cOval.drawOval(dOval.x + 1,dOval.y + 1 ,dOval.r,dOval.r);
        cOval.drawOval(dOval.x - 1,dOval.y - 1 ,dOval.r,dOval.r);
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
