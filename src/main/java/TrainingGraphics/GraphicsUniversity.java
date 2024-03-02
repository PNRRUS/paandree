package TrainingGraphics;

import Bildings.University;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class GraphicsUniversity extends JComponent {
    protected void paintComponent(Graphics artist) {
        super.paintComponent(artist);
//        return "University{" +
//                "whatStudy ='" + whatStudy + '\'' +
//                ", numberOfStudents =" + numberOfStudents +
//                ", numberOfPersonInGroup =" + numberOfPersonInGroup +
//                ", numberOfStudyYears =" + numberOfStudyYears +
//                ", name ='" + name + '\'' +
//                ", adress ='" + adress + '\'' +
//                ", architectorName ='" + architectorName + '\'' +
//                ", culturePlace =" + culturePlace +
//                ", yearOfBuild=" + yearOfBuild +
//                '}';
        try {
            artist.drawImage(ImageIO.read(new File("C:/Roma Java/VenorJava/src/main/java/TrainingGraphics/456.jpg")), 0, 0, null);
        } catch (IOException a) {
            throw new RuntimeException(a);}
        University itmo = new University();
        itmo.setNumberOfStudents(18000);
        itmo.setNumberOfPersonInGroup(40);
        itmo.setNumberOfStudyYears(6);
        itmo.setFieldIsThereADormNearby(true);
        itmo.setNumbersOfUniversity(15);
        itmo.setWhatStudy("Higher mathematics");
        artist.setColor(Color.black);
        Graphics2D g2 = (Graphics2D) artist;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setFont(new Font("Arial", Font.ITALIC, 15));
        //square1.drawSquareExtends(square1,oval);


artist.drawString(itmo.toString(),20,700);
        g2.setFont(new Font("Arial", Font.ITALIC, 20));
        artist.drawString(itmo.isThereADormNearby(),20,800);
        artist.drawString(itmo.howManyUniversities(),20,850);
        artist.drawString(itmo.groupCourse(),20,900);
    }
}
