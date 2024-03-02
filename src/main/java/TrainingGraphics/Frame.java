package TrainingGraphics;

import Bildings.Library;
import Bildings.University;
import Figures.Graphics4;


import javax.swing.*;

public class Frame {
    public static void main(String[] Args) {
        JFrame okoshko = new JFrame("нуууууу");
        okoshko.setSize(600, 1080);
        okoshko.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okoshko.setLocationRelativeTo(null);
        okoshko.setVisible(true);

        Graphics3 ni = new Graphics3();
        okoshko.add(ni);

        JFrame zercalo = new JFrame("Hadgehog");
        zercalo.setSize(600, 1080);
        zercalo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        zercalo.setVisible(true);

        Graphics2 gh = new Graphics2();
        zercalo.add(gh);

        JFrame okno = new JFrame("Turtle");
        okno.setSize(600, 1080);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GraphObject tryangle = new GraphObject();
        okno.setVisible(true);
        okno.setResizable(true);
        okno.add(tryangle);

        JFrame iliminator = new JFrame("interpreter");
        iliminator.setSize(600, 1080);
        iliminator.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Graphics4 Oval = new Graphics4();
        iliminator.setVisible(true);
        iliminator.setResizable(true);
        iliminator.add(Oval);

        JFrame casement = new JFrame("Interstellar");
        casement.setSize(600, 1080);
        casement.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        casement.setLocationRelativeTo(null);
        casement.setVisible(true);
        Graphics5 cat = new Graphics5();
        casement.setVisible(true);
        casement.setResizable(true);
        casement.add(cat);

        System.out.println("БИБЛИОТЕКА" + "\n");
        Library pushinskaya = new Library();
        pushinskaya.isWarAndPeace = true;
        pushinskaya.numberOfBooks = 900;
        pushinskaya.numberOfbooksAWeek = 20;
        pushinskaya.numberOfFamilyMembers = 15;
        pushinskaya.weeksToEnd();
        System.out.println(pushinskaya.toString());
        pushinskaya.pumPUpPump();
        pushinskaya.numberOfPersons();
        System.out.println("\n");

        System.out.println("УНИВЕРСИТЕТ" + "\n");
        University lomonosova = new University();
        lomonosova.setFieldIsThereADormNearby(true);
        lomonosova.setNumbersOfUniversity(2);
        lomonosova.setWhatStudy("Higher mathematics");
        lomonosova.setNumberOfStudents(2000);
        lomonosova.setNumberOfPersonInGroup(20);
        lomonosova.setNumberOfStudyYears(5);
        lomonosova.groupCourse();
        lomonosova.howManyUniversities();
        lomonosova.isThereADormNearby();
        System.out.println(lomonosova.toString());
        System.out.println(lomonosova.getNumberOfStudents());

        JFrame window = new JFrame("университет");
        window.setSize(1500, 1080);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        GraphicsUniversity bea = new GraphicsUniversity();
        window.setVisible(true);
        window.setResizable(false);
        window.add(bea);

        JFrame IDoNotKnowWhatToCallIt = new JFrame("библиотека");
        IDoNotKnowWhatToCallIt.setSize(1200, 1080);
        IDoNotKnowWhatToCallIt.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        IDoNotKnowWhatToCallIt.setLocationRelativeTo(null);
        IDoNotKnowWhatToCallIt.setVisible(true);
        GraphicsLibrary dor = new GraphicsLibrary();
        IDoNotKnowWhatToCallIt.setVisible(true);
        IDoNotKnowWhatToCallIt.setResizable(false);
        IDoNotKnowWhatToCallIt.add(dor);
        //GraphicsMain app = new GraphicsMain();
    }
}
