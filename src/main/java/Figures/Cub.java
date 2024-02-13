package Figures;

import java.awt.*;

public class Cub extends Figure {
int dlinaRedra;

    public Cub(int x, int y) {
        super(x, y);
    }

    public Cub() {
    }

    public Cub(int dlinaRedra) {
        this.dlinaRedra = dlinaRedra;
    }

    public Cub(int x, int y, int dlinaRedra) {
        super(x, y);
        this.dlinaRedra = dlinaRedra;
    }

    @Override
    public void move(){
        x = x + dx;
        y = y + dy;
    }
    public void drawCube(Cub Cubic, Graphics cCub) {
//        int x = (int) (Math.random() * 900);
//        int y = (int) (Math.random() * 900);
        int a = (int) (Math.random() * 800);
        cCub.drawRect(x,y,a,a);
        cCub.drawRect((int) (x + (a * 0.75)),(int) (y + (a * 0.75)),a,a);
        cCub.drawLine(x,y,(int) (x + (a * 0.75)),(int) (y + (a * 0.75)));
        cCub.drawLine(x + a,y,(int) (x + (a * 0.75) + a),(int) (y + (a * 0.75)));
        cCub.drawLine(x,y + a,(int) (x + (a * 0.75)),(int) (y + (a * 0.75) + a));
        cCub.drawLine(x + a,y + a,(int) (x + (a * 0.75) + a),(int) (y + (a * 0.75) + a));
         x++;
         y--;
        cCub.drawRect(x,y,a,a);
        cCub.drawRect((int) (x + (a * 0.75)),(int) (y + (a * 0.75)),a,a);
        cCub.drawLine(x,y,(int) (x + (a * 0.75)),(int) (y + (a * 0.75)));
        cCub.drawLine(x + a,y,(int) (x + (a * 0.75) + a),(int) (y + (a * 0.75)));
        cCub.drawLine(x,y + a,(int) (x + (a * 0.75)),(int) (y + (a * 0.75) + a));
        cCub.drawLine(x + a,y + a,(int) (x + (a * 0.75) + a),(int) (y + (a * 0.75) + a));

        }
    @Override
    public void S() {
System.out.println(dlinaRedra * 2 * 6);
    }

    @Override
    public String toString() {
        return "cubic {" +
                "dlinaRedra=" + dlinaRedra +
                ", x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}
