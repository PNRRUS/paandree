package Figures_Hemul;

import javax.swing.*;
import java.awt.*;

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

        Circle circleSabito = new Circle(100,89,56);
        System.out.println(circleB.toString());
        circleSabito.drawCircle(circleB, graphics);
        circleSabito.square();


        circleSabito.move(89,26);
        System.out.println(circleSabito.toString());
        circleSabito.drawCircle(circleSabito, graphics);

        Circle circlePav2 = new Circle(700,102,89);
        System.out.println(circleB.toString());
        circlePav2.drawCircle(circleB, graphics);
        circlePav2.square();


        circlePav2.move(-100,63);
        System.out.println(circlePav2.toString());
        circlePav2.drawCircle(circlePav2, graphics);


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
