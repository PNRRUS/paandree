package Guli_10_23;

import java.util.Scanner;

/*создать одномерный массив размерностью десять элементов заполнить массив случайными числами от нуля
 до ста распичатать элементы массива найти минимальный и максемальный элемент */
public class MinMaxArray {
    public static void main(String[] args) {
        System.out.print("Введите размерность массива: ");
        Scanner input = new Scanner(System.in);
        int j = input.nextInt();
        int[] arr = new int[j];
        System.out.print("[ ");
        for (int counter = 0; counter < j - 1; counter++) {
            arr[counter] = (int) Math.round(Math.random() * 200) - 100;
            System.out.print(arr[counter] + " ");
        }
        System.out.print("]");
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i <= j - 1; i++) {
            if (arr[i] >= max) {
                max = arr[i];
            }
            if (arr[i] <= min) {
                min = arr[i];
            }
        }
        System.out.println();
        System.out.println("минимальное число " + min + "\n" + "максимальное число " + max);
    }
}
