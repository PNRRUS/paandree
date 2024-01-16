package Sabito_09_2023;
//На вход подаётся натуральное число n. Создайте массив натуральных чисел от единицы до n включительно и выведите
// его на печать (в одной строке, через пробел).
//
//Sample Input:
//
//5
//Sample Output:
//
//1 2 3 4 5

import java.util.Scanner;

public class ArrayTraining1 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int width = input.nextInt();

int[] arr = new int[width];
          int counter = 0;
    System.out.print("[");
    while (counter < width)
    {      arr[counter] = (width - counter) * (width - counter);
        System.out.print(arr[counter]  + " ");
    counter++;}
    System.out.print("\b" + "]");
    char[] arrChar = new char[width];
   counter = 0;
    System.out.print("\n" + "[");
    while (counter < width)
    {      arrChar[counter] = (char)(((counter)) + 97);
        System.out.print(arrChar[counter] + " ");
        counter++;}
    System.out.print("\b" + "]" + "\n" );
    char[] arrCharLowerCase = new char[width];
    counter = 0;
    System.out.print( "[");
    while (counter < width)
    {      arrChar[counter] = (char)(((counter)) + 1072);
        System.out.print(arrChar[counter] + " ");
        System.out.print(arrCharLowerCase[counter] + " ");
        counter++;}
    System.out.print("\b" + "]" + "\n" );
    char Japan = 'а';
    System.out.println((int)Japan);
    System.out.println(arrCharLowerCase[9]);
               }
}
