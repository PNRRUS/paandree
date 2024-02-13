package Figures;

import java.awt.*;

public class Oval extends Figure {
    public int r;


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
    public void drawOval(Oval oval, Graphics drawOvalGraphics) {
        int randomColor = (int) (Math.random() * 6);
        switch (randomColor) {
            case 1:
                drawOvalGraphics.setColor(Color.GRAY);
                break;
            case 2:
                drawOvalGraphics.setColor(Color.black);
                break;
            case 3:
                drawOvalGraphics.setColor(Color.CYAN);
                break;
            case 4:
                drawOvalGraphics.setColor(Color.yellow);
                break;
            case 5:
                 drawOvalGraphics.setColor(Color.MAGENTA);
                break;

            default: System.out.println("вы запрашиваете несуществующий месяц 0_0");
        }
        int j = (int) (Math.random() * 500);
        int g = (int) (Math.random() * 500);
        drawOvalGraphics.drawOval(x,y,j,g);
        drawOvalGraphics.fillOval(x,y,j,g);
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


