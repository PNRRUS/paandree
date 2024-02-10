package Figures;

import javax.swing.*;
import java.awt.*;

public class Graphics4 extends JComponent {
    protected void paintComponent(Graphics oval) {
        super.paintComponent(oval);
        Oval drawOval = new Oval((int) Math.round((Math.random() * 1920)),
                (int) (Math.random() * 1080),(int) (Math.random() * 500));
        drawOval.drawOvalExtends(drawOval,oval);
    }
}
