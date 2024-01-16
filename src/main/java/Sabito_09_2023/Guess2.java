package Sabito_09_2023;

import java.util.Scanner;

public class Guess2 {

public static void main(String[] args) throws InterruptedException {
    int counter = 1;
    int guessNumber = (int) Math.round((Math.random() * 100));
    Scanner input = new Scanner(System.in);
    int  number = input.nextInt();
     while (number != guessNumber) {
         if (number < guessNumber) {
        System.out.println("больше");
    } else {System.out.println("меньше");}
        counter++;
        number = input.nextInt();
    }
    System.out.println("Вы угадали");
    System.out.println("Использовано попыток: " + counter);
    }
}

