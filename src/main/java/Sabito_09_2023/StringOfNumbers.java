package Sabito_09_2023;

import java.util.Scanner;

public class StringOfNumbers {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int vvodNumber = 1;
    while (vvodNumber != 0)  {
        vvodNumber = input.nextInt();
        sum = sum + vvodNumber;
    }
    System.out.println(sum);
}
}