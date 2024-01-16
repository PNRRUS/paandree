package Venor_08_2023;
/*на хвод подается вохраст человека вывести евляется ли человек тинейджиром 13 - 18, пенсионером после 65, ребенком
до 13, 20 - 65 работяга, старче после 75 проверить валидность введеноого возраста, если возраст не валиден вывести, что он неправильный.*/

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("для покупки данного товара 'пиво .Жигулевское.' ");
        System.out.println("введите свой возраст:");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if (age >= 1 && age <= 12) {
            System.out.println("ребенок:");
            System.out.println("ваш возраст не подходит под возрастные ограничения.");
            System.out.println("/товар неодобрен/");
        }
        if (age >= 13 && age <= 19) {
            System.out.println("тинейджер:");
            System.out.println("ваш возраст не подходит под возрастные ограничения.");
            System.out.println("рекомендуем вернуть деньги маме(папе).");
            System.out.println("/товар неодобрен/");
        }
        if (age >= 20 && age <= 65) {
            System.out.println("работяга:");
            System.out.println("ваш возраст подходит под возрастные ограничения.");
            System.out.println("/товар продан/");
        }
        if (age >= 66 && age <= 75) {
            System.out.println("пенсионер:");
            System.out.println("ваш возраст подходит под возрастные ограничения.");
            System.out.println("/товар продан/");
        }
        if (age >= 76 && age <= 120) {
            System.out.println("старче:");
            System.out.println("ваш возраст подходит под возрастные ограничения.");
            System.out.println("/товар продан/");
        }
        if (age <= 0 || age >= 121) {
            System.out.println("вы не человек:(");
        }
    }

}


//            System.out.println("тинейджер:" + "\n" + "ваш возраст не подходит под возрастные ограничения." + "\n"
//                    + "рекомендуем вернуть деньги маме(папе)." + "\n" + "/товар неодобрен/");



