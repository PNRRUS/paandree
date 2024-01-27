package Figures_Hemul;

import javax.swing.*;
import java.awt.*;
import Figures_Hemul.*;

public class FiguresDraw extends JComponent {

//    Circle circleA;
//
//    public FiguresDraw(Circle circleA) {
//        this.circleA = circleA;
//
//    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        Circle circleB = new Circle(110,120,45);
        System.out.println(circleB.toString());
        circleB.drawCircle(circleB, graphics);
        circleB.square();


        circleB.move(45,25);
        System.out.println(circleB.toString());
        circleB.drawCircle(circleB, graphics);



    }
    //        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        graphics.drawOval(circleB.x,  circleB.y, circleB.radius, circleB.radius);
//    @Override
//    public String toString() {
//        return "FiguresDraw{" +
//                "circleB=" + circleB +
//                ", ui=" + ui +
//                ", listenerList=" + listenerList +
//                ", accessibleContext=" + accessibleContext +
//                '}';
//    }
}
