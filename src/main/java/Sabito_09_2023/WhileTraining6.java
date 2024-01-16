package Sabito_09_2023;
//на вход подается целое число секунд вывести на экран таймер уменьшающий время до но нуля с задержкой 1 секунда

import java.util.Scanner;

public class WhileTraining6 {
    public static void main(String[] Args) {
  Scanner input = new Scanner(System.in);
  int taim = input.nextInt();
  int counter = 0;
  while (taim > counter) {
      if (counter >= 10) {System.out.print("\b");}
        System.out.print(counter);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
      counter++;
        System.out.print("\b");

    }
}}
