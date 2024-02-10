package TrainingGraphics;

import Figures.Circle;
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
        Rectangle kOval = new Rectangle();
        oval.setColor(Color.MAGENTA);
//        oval.drawLine(0, 1080, 1920, 0);
//        oval.drawLine(1, 1080, 1920, 1);
       int x1 = (int) Math.round((Math.random() * 1920));

        Circle aOval = new Circle((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                (int) (Math.random() * 500));
        Circle gOval = new Circle((int) Math.round((Math.random() * 1920)),(int) Math.round((Math.random() * 1080)),
                (int) Math.round((Math.random() * 500)));
        Circle pOval = new Circle((int) Math.round((Math.random() * 1920)),(int) Math.round((Math.random() * 1080)),
                (int) (Math.random() * 500));
        Circle hOval = new Circle((int) Math.round((Math.random() * 1920)),(int) Math.round((Math.random() * 1080)),
                (int) (Math.random() * 500));

        Circle emptyCircle = new Circle();
        emptyCircle.x = 45;
        emptyCircle.y = 260;
        emptyCircle.r = 45;
        emptyCircle.drawCircle(emptyCircle,oval);

        for(int j = 0;j <= 100;j++){
                if(j <= 50 ) {
                    oval.setColor(Color.MAGENTA);
                    aOval.drawCircle(new Circle((int) Math.round((Math.random() * 1920)), (int) Math.round((Math.random() * 1080)),
                            (int) Math.round((Math.random() * 500))), oval);
                }
            if(j > 50 ) {
                oval.setColor(Color.black);
                aOval.drawCircle(new Circle((int) Math.round((Math.random() * 1920)), (int) Math.round((Math.random() * 1080)),
                        (int) Math.round((Math.random() * 500))), oval);
            }
        }
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
aOval.drawCircleExtends(aOval,oval);



    }
//        oval.drawOval(101,89,52,7);
//        oval.draw3DRect(206,89,102,89,true);

}
