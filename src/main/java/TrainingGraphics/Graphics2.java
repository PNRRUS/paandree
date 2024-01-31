package TrainingGraphics;

import javax.swing.*;
import java.awt.*;
    public class Graphics2 extends JComponent {
        @Override
        protected void paintComponent(Graphics oval) {
            super.paintComponent(oval);
            oval.drawOval(101, 89, 52, 7);
            oval.draw3DRect(150, 100, 200, 89, true);
            oval.drawOval(302, 89, 52, 7);
        }
    }

