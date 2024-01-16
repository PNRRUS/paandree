package venor_07_2023;
import java.util.Scanner;

public class Kabanchik {

//  public static void main(String[] args) {
//        Напишите программу, которая присваивает трем переменным значения 100, 200 и 300.
//        Выведите на печать значения переменных в столбик, а затем в строку через пробел.
//            Примечание 1. Вспомните о различии методов println() и print().
//            Примечание 2. Пробел - это не пустота, а тоже символ.

//        int a = 100, b = 200;
//        double c = 300;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(a + " " + b + " " + c);
//
//        System.out.println("c/b=" + c / b);
//        System.out.println("c%b=" + c % b);
//



            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();
                System.out.println((a + b + c) / 3);

                double x = 29; int y = 6;
                double result = x / y;
                System.out.println(result);

            }
}
