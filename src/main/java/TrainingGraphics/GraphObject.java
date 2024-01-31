package TrainingGraphics;

import javax.swing.*;
import java.awt.*;

public class GraphObject extends JComponent {

    @Override
    protected void paintComponent(Graphics oval) {
        int y = 0;
        int gh = 0;
        int x2 = 0;
        int y2 = 0;

        super.paintComponent(oval);

        oval.setColor(Color.MAGENTA);
        oval.drawLine(0, 1080, 1920, 0);
        oval.drawLine(1, 1080, 1920, 1);
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
