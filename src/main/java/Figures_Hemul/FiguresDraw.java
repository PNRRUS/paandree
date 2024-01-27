package Figures_Hemul;

import javax.swing.*;
import java.awt.*;
import Figures_Hemul.*;

public class FiguresDraw extends JComponent {

//    Circle circleA;
//
//    public FiguresDraw(Circle circleA) {
//        super();
//        this.circleA = circleA;
//    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

          graphics.drawOval(10,  55, 8, 8);

       graphics.fill3DRect(140, 140, 10, 10, true);

    }
}
