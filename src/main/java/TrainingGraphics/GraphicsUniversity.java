package TrainingGraphics;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GraphicsUniversity extends JComponent {
    protected void paintComponent(Graphics artist) {
        super.paintComponent(artist);

        try {
            artist.drawImage(ImageIO.read(new File("C:/Roma Java/VenorJava/src/main/java/TrainingGraphics/456.jpg")), 0, 0, null);
        } catch (IOException a) {
            throw new RuntimeException(a);}

        artist.setColor(Color.black);
        //square1.drawSquareExtends(square1,oval);


    }
}
