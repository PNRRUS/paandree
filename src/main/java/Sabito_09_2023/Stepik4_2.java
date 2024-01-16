package Sabito_09_2023;

import java.util.Scanner;

public class Stepik4_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int  number = input.nextInt();
        for (int counter = 0; counter <= number; counter++){
            if (counter % 2 == 0 || counter % 3 == 0) {
                System.out.print(counter);

            }
        }
    }
}
