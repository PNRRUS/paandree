package TrainingGraphics;

import Figures.Line;

import javax.swing.*;
import java.awt.*;
    public class Graphics2 extends JComponent {
        @Override
        protected void paintComponent(Graphics ovalL) {
            super.paintComponent(ovalL);
//            oval.drawOval(101, 89, 52, 7);
//            oval.draw3DRect(150, 100, 200, 89, true);
//            oval.drawOval(302, 89, 52, 7);

            ovalL.setColor(Color.red);
            Line line1;
            line1 = new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                    (int) (Math.random() * 600),(int) (Math.random() * 1000));
            Line line2 = new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                    (int) (Math.random() * 400),(int) (Math.random() * 120));
            Line line3 = new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                    (int) (Math.random() * 1920),(int) (Math.random() * 1080));


          line1.drawLine1(line1,ovalL);
            line2.drawLine1(line2,ovalL);
            line3.drawLine1(line3,ovalL);
            for(int j = 0;j <= 100;j++){
                if(j <= 50 ) {
                    ovalL.setColor(Color.MAGENTA);
                    line3.drawLine1(new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                            (int) (Math.random() * 1920),(int) (Math.random() * 1080)), ovalL);
                }
                if(j > 50 ) {
                    ovalL.setColor(Color.GREEN);
                    line1.drawLine1(new Line((int) Math.round((Math.random() * 1920)),(int) (Math.random() * 1080),
                            (int) (Math.random() * 600),(int) (Math.random() * 1000)), ovalL);
                }
            }

        }
    }

