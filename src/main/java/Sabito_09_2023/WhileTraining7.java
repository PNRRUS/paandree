package Sabito_09_2023;

import java.util.Scanner;

public class WhileTraining7 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        int taim = input.nextInt();
        while (taim > 0) {
            if (taim >= 10) {System.out.print("\b");}
            if (taim == 9) {System.out.print("\b");}
            System.out.print(taim);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            taim--;
            System.out.print("\b");

        }
    }}


