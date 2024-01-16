package Guli_10_23;

import java.util.Scanner;

public class RandomArr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int number;
        int[] arr = new int[width];
            System.out.print("[");
        for (int counter = 0; counter < width; counter++) {
            number = (int) Math.round(Math.random() * 1000);
            arr[counter] = number;
            System.out.print(" " + arr[counter]);

        }
            System.out.print(" ]");


        input.close();
    }
}