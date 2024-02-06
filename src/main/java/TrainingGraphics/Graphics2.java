package TrainingGraphics;

import Figures.Line;

import javax.swing.*;
import java.awt.*;
    public class Graphics2 extends JComponent {
        @Override
        protected void paintComponent(Graphics oval) {
            super.paintComponent(oval);
//            oval.drawOval(101, 89, 52, 7);
//            oval.draw3DRect(150, 100, 200, 89, true);
//            oval.drawOval(302, 89, 52, 7);
            oval.setColor(Color.red);
            Line Line1 = new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                    (int) (Math.random() * 600),(int) (Math.random() * 1000));
            Line Line2 = new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                    (int) (Math.random() * 400),(int) (Math.random() * 120));
            Line Line3 = new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                    (int) (Math.random() * 1920),(int) (Math.random() * 1080));

            Line1.drawLine(Line1,oval);
            Line2.drawLine(Line2,oval);
            Line3.drawLine(Line3,oval);
        }
    }

