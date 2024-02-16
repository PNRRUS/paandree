package TrainingGraphics;

import Figures.Cub;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

public class Graphics5 extends JComponent {
    public Graphics5() {
                enableEvents(AWTEvent.MOUSE_EVENT_MASK);
    }


    @Override
    protected void paintComponent(Graphics cubes) {
        super.paintComponent(cubes);

        try {
            cubes.drawImage(ImageIO.read(new File("C:/Roma Java/VenorJava/src/main/java/Figures/256.jpg")), 0, 0, null);
        } catch (IOException a) {
            throw new RuntimeException(a);}

        cubes.setColor(Color.black);

        Cub cubePaint = new Cub((int)((Math.random() * 1920)),
                (int) (Math.random() * 1080), (int) (Math.random() * 500));
        cubePaint.drawCube(cubePaint,cubes);

        //square1.drawSquareExtends(square1,oval);


    }

    @Override
    protected void processMouseEvent(MouseEvent mouseEventForCube) {
        super.processMouseEvent(mouseEventForCube);

        Graphics cubesS4 = getGraphics();

        if (mouseEventForCube.getID() == MouseEvent.MOUSE_PRESSED && mouseEventForCube.getClickCount() > 1) {

            Cub cub2 = new Cub (mouseEventForCube.getX(),
                    mouseEventForCube.getY(), (int) (Math.random() * 800));

            cubesS4.setColor(Color.black);
            cub2.drawCube(cub2,cubesS4);


        }
}}
