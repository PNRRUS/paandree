package Sabito_09_2023;
//на вход подается два положительных целых числа - возраст и год рождения человека.
//вывести список годов прожитых человеком до текущего года
import java.util.Scanner;

public class WhileTraining2 {
    public static void main (String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("введите свой год рождения: ");
        int yearOfBirth = input.nextInt();
        System.out.println("введите свой возраст: ");
        int age = input.nextInt();
        int counter = 1;
        System.out.println("ваши прожитые годы: ");
        while (counter <= age) {
        System.out.println(counter  + "-й год: " + (yearOfBirth + 1));
        yearOfBirth++;
       counter++;
        }
        input.close();
    }
}
