package venor_07_2023;

import javax.swing.*;

public class Interteilar {

    public static void main(String[] args) {

        Persons_gencsin Tignary = new Persons_gencsin(782, 21356);
        Persons_gencsin Siun_li = new Persons_gencsin(756, 11256);
        Persons_gencsin Saxarosa = new Persons_gencsin(745, 12458);
        Persons_gencsin Sara = new Persons_gencsin();

        Sara.setSilla(753);
        Sara.setHP(12300);
        Tignary.instrykter(100537);
        Siun_li.instrykter(1536);
        Siun_li.isymrudnai_teni(192);
        Saxarosa.id();


        System.out.println("здоровье Тигнари " + Tignary.getHP() + " " + "сила " + Tignary.getSilla());
        System.out.println("здоровье Сян Лин " + Siun_li.getHP() + " " + "сила " + Siun_li.getSilla());
        System.out.println("здоровье Сахарозы " + Saxarosa.getHP() + " " + "сила " + Saxarosa.getSilla());
        System.out.println("здоровье Сары " + Sara.getHP() + " " + "сила " + Sara.getSilla());
        JOptionPane.showMessageDialog(null,
                    "здоровье Тигнари " + Tignary.getHP() + " " + "сила " + Tignary.getSilla()
                        + "\n" + "здоровье Сян Лин " + Siun_li.getHP() + " " + "сила " + Siun_li.getSilla()
                        + "\n" + "здоровье Сахарозы " + Saxarosa.getHP() + " " + "сила " + Saxarosa.getSilla()
        );

        System.exit(0);

    }
}
