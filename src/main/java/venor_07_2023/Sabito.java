package venor_07_2023;

import java.util.Scanner;

public class Sabito {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("my name is Roman");

        Scanner peremennayVvoda = new Scanner(System.in);

        System.out.print("чему равен вес хавчика? ");
        double vesChavchika = peremennayVvoda.nextDouble();

        System.out.print("чему равно настроение хавчика? ");
        int nastroenieChavchika = peremennayVvoda.nextInt();

        System.out.print("чему равен вес мольки? ");
        double vesMoliki = peremennayVvoda.nextDouble();

        System.out.print("чему равно настроение мольки? ");
        int nastroenieMoliki = peremennayVvoda.nextInt();

        System.out.print("чему равен вес валеры? ");
        double vesVeleri = peremennayVvoda.nextDouble();

        System.out.print("чему равно настроение валеры? ");
        int nastroenieVeleri = peremennayVvoda.nextInt();

        System.out.print("чему равен вес Витька? ");
        double vesVitek = peremennayVvoda.nextDouble();

        Sobaka Havchik = new Sobaka(vesChavchika, nastroenieChavchika);
        Sobaka Molka = new Sobaka(vesMoliki, nastroenieMoliki);
        Sobaka Valera = new Sobaka(vesVeleri, nastroenieVeleri);
        Sobaka Vitek = new Sobaka(vesVitek);
        Vitek.setNastroenie(2);
        Havchik.pokormit(0.5);
        Havchik.pomit(2);
        Molka.pogladit(1);
        Valera.pomit(2);

        System.out.println("вес Хавчика " +  Havchik.ves + " " + "настроение " + Havchik.getNastroenie());
        System.out.println("вес Мольки " + Molka.ves + " " + "настроение " + Molka.getNastroenie());
        System.out.println("вес Валеры " +  Valera.ves + " " + "настроение " + Valera.getNastroenie());
        System.out.println("вес Витька " +  Vitek.ves + " " + "настроение " + Vitek.getNastroenie());

    }
}

