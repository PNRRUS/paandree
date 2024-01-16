package venor_07_2023;

//Реализуйте простые домашние часы.
//
//На вход подаётся число секунд, которое прошло с момента начала суток (00:00:00). Выведите текущее время в формате
//ЧЧ:ММ:СС.
//вывести количество суток в формате дд.чч.мм.сс
import java.util.Scanner;

public class ElektricWatch {

        public static void main(String[] args) {
            Scanner vvod = new Scanner(System.in);
            int sekindy = vvod.nextInt();
            int days = sekindy / 86400;
            int maxShisloSekyndVSytkax = sekindy % 86400;
            int hours = maxShisloSekyndVSytkax / 3600;
            int minutes = sekindy % 3600 / 60;
            int seconds = sekindy % 60;
            System.out.print( days / 10 + "" + days % 10 + ":" + hours / 10 + "" + hours % 10 + ":" + minutes / 10 + "" + minutes % 10 + ":"
                    + seconds / 10 + "" + seconds % 10);

        }
}
