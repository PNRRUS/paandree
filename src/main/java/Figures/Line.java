package Figures;

import java.awt.*;

public class Line extends Figure {

    public int x1;
    public int y1;
    public Line(){};
    public Line(int x1, int y1) {
        this.x1 = x1;
        this.y1 = y1;
    }


    public Line(int x, int y, int x1, int y1) {
        super(x, y);
        this.x1 = x1;
        this.y1 = y1;
    }

    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
        y1 = y + dy;
        x1 = x + dx;
    }

    @Override
    public void S() {
System.out.println("S = 0");
    }
    public void drawLine1(Line dLine, Graphics cOval) {
        cOval.drawLine(x,y,x1,y1);
        cOval.drawLine(x - 1,y - 1,x1 - 1 ,y1 - 1);
        cOval.drawLine(x + 1,y + 1,x1 + 1,y1 + 1);
    }
}
