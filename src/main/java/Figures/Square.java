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
    public void drawSquareExtends(Square square, Graphics cOval) {
        cOval.setColor(Color.gray);
        cOval.fillRect(x + 100 ,y + 100 ,str + 600 ,str + 600);
        cOval.setColor(Color.lightGray);
        cOval.fillRect(x + 120 , y + 120,str,str);
        cOval.setColor(Color.pink);
        for(int i = 0;i <= 100;i += 5) {
                cOval.drawRect(x + i ,y + i ,str ,str);
                }
        cOval.drawRect(x + 100 - 1,y + 100 -1,str,str);
        cOval.drawRect(x + 100, y +1 + 100,str,str);


        cOval.drawRect(x + 500- 1,y -1,str,str);
        cOval.drawRect(x + 500 + 1,y +1,str,str);
        cOval.setColor(Color.lightGray);
        cOval.fillRect(x + 620 , y + 120,str,str);
        cOval.setColor(Color.pink);
        for(int i = 0;i <= 100;i += 5) {
            cOval.drawRect(x + 500 + i ,y + i ,str ,str);

        }
        cOval.drawRect(x + 600 - 1,y + 100 -1,str,str);
        cOval.drawRect(x + 600, y +1 + 100,str,str);


    }
    public void drawSquareExtendsNoCity(Square square, Graphics cOval) {
        int j = (int) (Math.random() * 500);
        cOval.setColor(Color.green.darker().darker().darker());
        cOval.fill3DRect(100,200,100,50,true);
        for(int i = 0;i <= 500;i += 5) {
            cOval.drawRect(x - i ,y - i ,str + i * 2 ,str + i * 2);


        }
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
