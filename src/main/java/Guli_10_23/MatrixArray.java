package Guli_10_23;

import java.util.Scanner;

public class MatrixArray {
        public static void main(String[] Args){
            int number;
            int counter = 0;
            int counter1 = 0;
int counterMin = 0;
int counterMax = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("Введите высоту матрицы: ");
            int arrayHeight = input.nextInt();
            System.out.println("Введите ширину матрицы: ");
            int arrayWidth = input.nextInt();
            int[][] arr = new int[arrayHeight][arrayWidth];
            while (counter1 < arrayHeight) {
                System.out.print("[ ");
                while (counter < arrayWidth) {
                    number = (int) Math.round((Math.random() * 200) + 100);
                    System.out.print(number + " ");
                    arr[counter1][counter] = number;
                    counter++;
                }
                counter = 0;
                System.out.print("]" + "\n" );
                counter1++;
            }
            int max = arr[0][0];
            int min = arr[0][0];
            for (int i = 0; i < arrayHeight; i++) {
                for (int j = 0; j < arrayWidth; j++) {
                    if (arr[i][j] >= max) {
                        max = arr[i][j];
                    }
                    if (arr[i][j] <= min) {
                        min = arr[i][j];
                    }
                }
            }
            System.out.println("Минимальное число " + min + "\n" + "максимальное число " + max + ".");
            for (int i = 0; i < arrayHeight; i++) {
                for (int j = 0; j < arrayWidth; j++) {
                    if (arr[i][j] == max) {
                        counterMax++;
                    }
                    if (arr[i][j] == min) {
                        counterMin++;
                    }
                }
            }
            System.out.println(counterMin + " раз повторялось минимальное число "  + "\n" + counterMax + " раз повторялось максимальное число "  + ".");
        }
    }


