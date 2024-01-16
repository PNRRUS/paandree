package venor_07_2023;

import java.util.Scanner;
class MaxOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();
        int maxNumber = 0;
        if (firstNumber % 2 == 0 && secondNumber % 2 == 0 && thirdNumber % 2 == 0) {
            if (firstNumber > secondNumber && firstNumber  > thirdNumber) {System.out.print(firstNumber);}
            else if (secondNumber > thirdNumber) {System.out.println("secondNumber");}
             else {System.out.println(thirdNumber);}}

        if (firstNumber % 2 == 0 && secondNumber % 2 == 0 && thirdNumber % 2 != 0) {
            if (firstNumber > secondNumber) System.out.print(firstNumber);
            else System.out.println(secondNumber);}

        if (firstNumber % 2 == 0 && secondNumber % 2 != 0 && thirdNumber % 2 == 0) {
            if (firstNumber > thirdNumber) System.out.print(firstNumber);
            else System.out.println(thirdNumber);}

        if (firstNumber % 2 == 0 && secondNumber % 2 != 0 && thirdNumber % 2 != 0) {
            System.out.println(firstNumber);
        };
        if (firstNumber % 2 != 0 && secondNumber % 2 == 0 && thirdNumber % 2 == 0) {
            if (secondNumber > thirdNumber) System.out.print(secondNumber);
            else System.out.println(thirdNumber);}
        if (firstNumber % 2 != 0 && secondNumber % 2 == 0 && thirdNumber % 2 != 0) {
            System.out.println(secondNumber);
        };
        if (firstNumber % 2 != 0 && secondNumber % 2 != 0 && thirdNumber % 2 == 0) {
            System.out.println(thirdNumber);}
        if (firstNumber % 2 != 0 && secondNumber % 2 != 0 && thirdNumber % 2 != 0) {
            System.out.println("Чётных чисел нет");
        };
            input.close();
    }}
