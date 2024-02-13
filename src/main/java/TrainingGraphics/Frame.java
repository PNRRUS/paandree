package TrainingGraphics;

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
        //GraphicsMain app = new GraphicsMain();
    }
}
