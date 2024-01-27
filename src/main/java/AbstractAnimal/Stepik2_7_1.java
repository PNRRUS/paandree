package AbstractAnimal;

import javax.swing.*;

public class Stepik2_7_1 {
    public static void main(String[] args) {
        Owl owl = new Owl();
        owl.voice();
        Frog frog = new Frog();
        frog.voice();
        Duck Uti = new Duck();
        Uti.voice();

        JFrame okno = new JFrame("Turtle");
        okno.setSize(1920,1080);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okno.setVisible(true);

        JFrame zercalo = new JFrame("Hadgehog");
        zercalo.setSize(500,200);
        zercalo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        zercalo.setVisible(true);

        JFrame okoshko = new JFrame("нуууууу");
        okoshko.setSize(300,865);
        okoshko.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okoshko.setLocationRelativeTo(null);
        okoshko.setResizable(false);
        okoshko.setVisible(true);
    }
}

