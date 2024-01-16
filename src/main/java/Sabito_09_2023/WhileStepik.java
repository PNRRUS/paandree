package Sabito_09_2023;
/* На вход подаются числа, которые делятся на 11. Концом последовательности будет любое число, не делящееся на 11
(это число не входит в последовательность).
Посчитайте количество введённых чисел и сумму тех из них, которые кратны 3.
Sample Input:
11 22 33 121 99 15
Sample Output:

5
13*/

import java.util.Scanner;

public class WhileStepik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int counter = 0;
        int summa = 0;
        do {number = input.nextInt();
            if (number % 3 == 0) {
            summa += number;
        }
        counter++;
        } while (number % 11 == 0);
System.out.println((counter - 1) + "\n" + summa);
input.close();
    }

}
