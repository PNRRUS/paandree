package Sabito_09_2023;

import java.util.Scanner;

public class NumberAtAnAngleFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  number = input.nextInt();
        for (int counter = 0; counter < number;counter++) {

            for (int counter1 = 0; counter1 < counter; counter1++) {
                System.out.print("   ");
            }
            System.out.println("*");
        }
        input.close();
    }
}

