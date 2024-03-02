package TrainingGraphics;

import Bildings.Library;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GraphicsLibrary extends JComponent {


    protected void paintComponent(Graphics art) {
        super.paintComponent(art);

        try {
            art.drawImage(ImageIO.read(new File("C:/Roma Java/VenorJava/src/main/java/TrainingGraphics/623.jpg")), 0, 0, null);
        } catch (IOException a) {
            throw new RuntimeException(a);}

        art.setColor(Color.black);
        //square1.drawSquareExtends(square1,oval);
        System.out.println("БИБЛИОТЕКА" + "\n");
        Library pushinskaya = new Library();
        pushinskaya.isWarAndPeace = true;
        pushinskaya.numberOfBooks = 40000;
        pushinskaya.numberOfbooksAWeek = 200;
        pushinskaya.numberOfFamilyMembers = 40;
        pushinskaya.weeksToEnd();
//        System.out.println(pushinskaya.toString());
        pushinskaya.pumPUpPump();
        pushinskaya.numberOfPersons();
        System.out.println("\n");

        Graphics2D g2 = (Graphics2D) art;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("Arial", Font.ITALIC, 20));
                art.drawString(pushinskaya.toString(), 20,950);
                art.drawString(pushinskaya.weeksToEnd(), 20,1000);
        art.drawString( pushinskaya.pumPUpPump(), 20,900);
        art.drawString(pushinskaya.numberOfPersons(), 20,850);

    }
}
