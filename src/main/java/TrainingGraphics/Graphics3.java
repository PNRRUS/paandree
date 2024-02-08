package TrainingGraphics;

import Figures.Square;

import javax.swing.*;
import java.awt.*;

public class Graphics3 extends JComponent {
    @Override
    protected void paintComponent(Graphics oval) {
        super.paintComponent(oval);
//        oval.drawOval(101, 89, 52, 7);
//        oval.fill3DRect(562, 695, 163, 96, true);
//        oval.drawArc(500,410,196,340,30,120);
//        oval.drawOval(1500, 89, 52, 7);
//        oval.drawLine(40, 50, 440, 40);
//        oval.drawRoundRect(462, 295,120,120,40,65);
        oval.setColor(Color.pink);
        Square square1 = new Square((int) Math.round((Math.random() * 1920)),
                (int) (Math.random() * 1080),(int) (Math.random() * 500));
        Square square2 = new Square((int) Math.round((Math.random() * 1920)),
                (int) (Math.random() * 1080),(int) (Math.random() * 800));

        //square1.drawSquare(square1,oval);


        //square1.drawSquareExtends(square1,oval);
        square2.drawSquareExtendsNoCity(square2,oval);

        }
    }
