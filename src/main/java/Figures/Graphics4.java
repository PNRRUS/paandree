package Figures;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Graphics4 extends JComponent {
    public Graphics4() {
        enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }
    protected void paintComponent(Graphics oval) {
        try {
            oval.drawImage(ImageIO.read(new File("C:/Roma Java/VenorJava/src/main/java/Figures/659.jpg")), 0, 0, null);
        } catch (IOException a) {
            throw new RuntimeException(a);}
        super.paintComponent(oval);
        oval.setColor(Color.white);
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
