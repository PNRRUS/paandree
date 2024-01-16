package Venor_08_2023;
import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        System.out.println("\n" + "загадайте месяц и напишите его номер:");
       Scanner input = new Scanner(System.in);
       int month = input.nextInt();
       switch (month) {
           case 1:
               System.out.println("январь: зима ");
               break;
           case 2:
               System.out.println("февраль: зима");
               break;
           case 3:
               System.out.println("март: весна");
               break;
           case 4:
               System.out.println("апрель: весна");
               break;
           case 5:
               System.out.println("май:весна");
               break;
           case 6:
               System.out.println("июнь: лето");
               break;
           case 7:
               System.out.println("июль: лето");
               break;
           case 8:
               System.out.println("август: лето");
               break;
           case 9:
               System.out.println("сентябрь: осень");
               break;
           case 10:
               System.out.println("октябрь: осень");
               break;
           case 11:
               System.out.println("ноябрь: осень");
               break;
           case 12:
               System.out.println("декабрь: зима");
               break;
           default: System.out.println("вы запрашиваете несуществующий месяц 0_0");
       }
input.close();
    }

}



// Задание_3 добавлен switch
//        3) По номеру времени года выведите его название. Например, для 0 – вывести «зима», для 3 – «лето».
//        Для вывода используете System.out.println("ТЕКСТ ДЛЯ ВЫВОДА");