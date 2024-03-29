package TrainingGraphics;

import Figures.Square;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;


public class Graphics3 extends JComponent {

    public Graphics3() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }


    @Override
    protected void paintComponent(Graphics ovalS) {
        super.paintComponent(ovalS);

        ovalS.setColor(Color.pink);

        Square square1 = new Square((int) Math.round((Math.random() * 1920)),
                (int) (Math.random() * 1080), (int) (Math.random() * 500));
        Square square2 = new Square((int) Math.round((Math.random() * 1920)),
                (int) (Math.random() * 1080), (int) (Math.random() * 800));

        square1.drawSquare(square1,ovalS);
        ovalS.setColor(Color.gray);
        square1.drawSquare(square1,ovalS);
        square1.dx = 50;
        square1.dy = 80;
        square1.move();
        ovalS.setColor(Color.pink);
        square1.drawSquare(square1,ovalS);

        //square1.drawSquareExtends(square1,oval);
        square2.drawSquareExtendsNoCity(square2, ovalS);

    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEvent) {
        super.processMouseEvent(mouseEvent);

        Graphics ovalS2 = getGraphics();

        if (mouseEvent.getID() == MouseEvent.MOUSE_PRESSED) {

            Square square2 = new Square(mouseEvent.getX(),
            mouseEvent.getY(), (int) (Math.random() * 800));

            ovalS2.setColor(Color.gray);
            square2.drawSquare(square2,ovalS2);
            square2.dx =  (int) (Math.random() * 20);
            square2.dy =  (int) (Math.random() * 20);
            square2.move();
            ovalS2.setColor(Color.pink);
            square2.drawSquare(square2,ovalS2);
        }
//        if (mouseEvent.getID() == MouseEvent.MOUSE_PRESSED && mouseEvent.getClickCount() > 1) {
//
//            Square square2 = new Square(mouseEvent.getX(),
//                    mouseEvent.getY(), (int) (Math.random() * 800));
//
//            square2.drawSquare(square2,ovalS2);
//
//            square2.drawSquareExtendsNoCity(square2, ovalS2);
//
//
//
//
//
//
//        }
    }


}