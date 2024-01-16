package Venor_08_2023;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();


        if (x != 5) {
            System.out.println("Yes");
        } else {
            System.out.print("No");
        }
    }
}

