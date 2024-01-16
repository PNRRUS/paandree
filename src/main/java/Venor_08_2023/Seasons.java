package Venor_08_2023;
/*на вход подается номер месяца
* вывести на экран время года, соотвесвующее введенному месяцу.
* Если номер месяцап не валиден вывести сообщение "номер  месяца введен неправильно"*/

import java.util.Scanner;

public class Seasons {
    public static void main(String[] Args) {
        System.out.print("Введите номер месяца:");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        if (month == 12 || month == 1 || month == 2) {
            System.out.print("winter");
        } else {
            if (month ==3 || month == 4 || month == 5) {
                System.out.print("spring");
            } else {
                if (month == 9 || month == 10 || month == 11) {
                    System.out.print("autumn");
                } else {
                    if (month == 6 || month == 7 || month == 8) {
                        System.out.print("summer");
                    } else {
                        System.out.print("номер  месяца введен неправильно");
                    }


                }
            }
        }
    }
}