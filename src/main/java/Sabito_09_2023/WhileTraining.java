package Sabito_09_2023;

import java.util.Scanner;

public class WhileTraining {
    public static void main(String[] Args){
        Scanner input = new Scanner(System.in);
        String numberOfPrints = input.nextLine();
        int numberOfTimes = input.nextInt();
        int counter = 1;
        while (counter <= numberOfTimes) {
        System.out.println(counter + ": " + numberOfPrints);
            counter++;
            //
        }
input.close();
    }
}
