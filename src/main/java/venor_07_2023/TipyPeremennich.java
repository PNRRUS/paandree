package venor_07_2023;

import java.util.Scanner;


public class TipyPeremennich {

    public static void main(String[] args) {

        var Silla = 1_000_000;
        var peremennaiTipaDouble = 5;

        var pytin = -7;
        double HP = 123.56, mrbeast = 786.39;
        String PTS = "хочешь мира, готовся к войне";
        boolean windi31, ww3;
        char venor = 'Z', sabito = 'A';
        boolean result = PTS instanceof String;


        windi31 = Silla < pytin;
        ww3 = pytin > HP;

        System.out.println(Silla + pytin);
        System.out.println(HP + mrbeast);
        System.out.println(PTS);
        System.out.println(windi31);
        System.out.println(ww3);
        System.out.println(venor + sabito);

        Scanner vvod = new Scanner(System.in);
        System.out.print("Как тебя зовут? ");
        String imya = vvod.nextLine();
        System.out.println("Привет " + imya + "!");

        System.out.print("сколько тебе лет? ");
        int vosrast = vvod.nextInt();
        System.out.println("Твой возраст " +  vosrast + " лет.");

        System.out.print("сколько ты пьёшь воды в день? ");
        double litres = vvod.nextDouble();
        System.out.println("Ты выпиваешь в день " +  litres + " литров воды.");

        vvod.close();



        }




    }


