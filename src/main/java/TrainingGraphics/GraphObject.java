package TrainingGraphics;

import Figures.*;
import Figures.Rectangle;

import javax.swing.*;
import java.awt.*;

public class GraphObject extends JComponent {

    public void drawCircle1(Circle dOval, Graphics cOval) {
        cOval.drawOval(dOval.x,dOval.y,dOval.r,dOval.r);
        cOval.drawOval(dOval.x + 1,dOval.y + 1 ,dOval.r,dOval.r);
        cOval.drawOval(dOval.x - 1,dOval.y - 1 ,dOval.r,dOval.r);
    }

    @Override
    protected void paintComponent(Graphics oval) {
        int y = 0;
        int gh = 0;
        int x2 = 0;
        int y2 = 0;

        super.paintComponent(oval);

        oval.setColor(Color.MAGENTA);
//        oval.drawLine(0, 1080, 1920, 0);
//        oval.drawLine(1, 1080, 1920, 1);

        Circle fOval = new Circle(45,87,100);
        Circle gOval = new Circle(1800,800,100);
        Circle pOval = new Circle(500,800,100);
        Circle hOval = new Circle(786,100,100);
        Rectangle rect1 = new Rectangle(200,100,100,200);
        Rectangle rect2 = new Rectangle(580,20,600,200);
        Square square1 = new Square(600,120,100);
        Square square2 = new Square(1200,600,200);
        Line Line1 = new Line(920,500,123,526);
        Line Line2 = new Line(520,600,665,519);
        Line Line3 = new Line(1920,0,0,1080);
        rect1.draw3DRect(rect1,oval);
        rect2.draw3DRect(rect2,oval);

        square1.drawSquare(square1,oval);
        square2.drawSquare(square2,oval);

        Line1.drawLine(Line1,oval);
        Line2.drawLine(Line2,oval);
        Line3.drawLine(Line3,oval);

        Circle emptyCircle = new Circle();
        emptyCircle.x = 45;
        emptyCircle.y = 260;
        emptyCircle.r = 45;
        emptyCircle.drawCircle(emptyCircle,oval);

        fOval.drawCircle(fOval,oval);
        pOval.drawCircle(pOval,oval);
        gOval.drawCircle(gOval,oval);
        hOval.drawCircle(hOval,oval);

        oval.setColor(Color.LIGHT_GRAY);

        for (int counter = 0; counter <= 90; counter++) {

            oval.drawLine(y, 0, gh, 1920);
            gh += 40;
            y += 40;

        }

        for (int reCounter = 0; reCounter < 90; reCounter++) {
            oval.drawLine(0, x2, 1920, y2);
            y2 += 40;
            x2 += 40;
        }




    }
//        oval.drawOval(101,89,52,7);
//        oval.draw3DRect(206,89,102,89,true);

}
