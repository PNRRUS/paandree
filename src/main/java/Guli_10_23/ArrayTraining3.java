package Guli_10_23;

import java.util.Scanner;

/*
На вход подаётся целое число n > 1. Сформируйте массив чётных чисел от 2 до n (включительно).

Выведите на печать массив в одной строке, через пробел.

Посчитайте и выведите на печать сумму элементов массива.

Sample Input:

10
Sample Output:

2 4 6 8 10
30
*/
public class ArrayTraining3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int firstNumber = 2;
        int sum = 0;
        int[] arr = new int[width / 2];
        for (int counter = 0; counter < width / 2; counter++){
            arr[counter] = firstNumber;
            sum += firstNumber;
            firstNumber += 2;
            System.out.print(arr[counter] + " ");
        }
        System.out.print("\n" + sum);
    }
}
