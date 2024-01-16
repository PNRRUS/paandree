package Sabito_09_2023;

import java.util.Scanner;

/*на вход подается целое число - ширина прямоугольника и целое число  - высота прямоугольника,
 вывести на экран прямоугольник по периметру которого напечатана звездочка
 задачу выполняет рома*/
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int number2 = input.nextInt();
        for (int counter = 0; counter < number; counter++){
            System.out.print("*");
            for (int counter1 = 1;counter1 < number2; counter1++) {
                if (counter == 0 || counter == number - 1){
                    System.out.print("*");}
                if (counter > 0 && counter < number - 1 ) {
                        System.out.print(" ");}

            }
            System.out.println("*");
        }

        input.close();
    }
}
