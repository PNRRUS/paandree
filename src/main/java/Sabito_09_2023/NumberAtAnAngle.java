package Sabito_09_2023;

import java.util.Scanner;

public class NumberAtAnAngle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  number = input.nextInt();
        int counter = 0;
        int counter1 = 0;
        while (counter <= number) {

            while (counter1 < counter) {
                System.out.print("   ");
                counter1++;
            }
            System.out.println("*");
            counter++;
            counter1 = 0;
        }
        input.close();
    }
}
