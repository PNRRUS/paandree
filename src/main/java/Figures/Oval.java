package Figures;

import java.awt.*;

public class Oval extends Figure {
    public int r;

    public Oval() {
    }

    public Oval(int x, int y, int r) {
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

    public void drawOvalExtends(Oval oval, Graphics drawOval) {
        int j = (int) (Math.random() * 500);

        for(int i = 0;i <= 500;i += 25) {
            drawOval.drawOval(x - i ,y - i,r + i * 4 ,r + i * 2);
        }
        for(int i = 0;i <= 500;i += 25) {
            drawOval.drawOval(x - i + 1 ,y - i + 1,r + i * 4 ,r + i * 2);
        }
    }


    @Override
    public String toString() {
        return "ovalicic {" +
                "r=" + r +
                ", x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}


