package Figures;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class Graphics4 extends JComponent {
    public Graphics4() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }
    protected void paintComponent(Graphics oval) {
        super.paintComponent(oval);
        Oval drawOval = new Oval((int) Math.round((Math.random() * 1920)),
                (int) (Math.random() * 1080),(int) (Math.random() * 500));
        drawOval.drawOvalExtends(drawOval,oval);

    }
    @Override
    protected void processMouseEvent(MouseEvent mouseEventForOval){
        super.processMouseEvent(mouseEventForOval);

        Graphics ovalS2 = getGraphics();

        if (mouseEventForOval.getID() == MouseEvent.MOUSE_PRESSED && mouseEventForOval.getClickCount() > 1) {

            Oval ovalMouse = new Oval(mouseEventForOval.getX(),
                    mouseEventForOval.getY(), (int) (Math.random() * 800));

            ovalMouse.drawOval(ovalMouse,ovalS2);
        }
    }

}
