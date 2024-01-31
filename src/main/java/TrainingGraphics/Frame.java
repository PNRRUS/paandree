package TrainingGraphics;

import javax.swing.*;

public class Frame {
    public static void main(String[] Args) {
        JFrame okoshko = new JFrame("нуууууу");
        okoshko.setSize(1920, 1080);
        okoshko.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        okoshko.setLocationRelativeTo(null);
        okoshko.setVisible(false);

        Graphics3 ni = new Graphics3();
        okoshko.add(ni);

        JFrame zercalo = new JFrame("Hadgehog");
        zercalo.setSize(500, 200);
        zercalo.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        zercalo.setVisible(false);

        Graphics2 gh = new Graphics2();
        zercalo.add(gh);

        JFrame okno = new JFrame("Turtle");
        okno.setSize(1920, 1080);
        okno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GraphObject tryangle = new GraphObject();
        okno.setVisible(true);
        okno.setResizable(true);
        okno.add(tryangle);

        //GraphicsMain app = new GraphicsMain();
    }
}
