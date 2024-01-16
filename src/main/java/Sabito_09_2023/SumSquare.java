package Sabito_09_2023;

import java.util.Scanner;
//На ввод подаётся натуральное число n. Выведите на печать в возрастающем порядке через пробел квадраты натуральных чисел, если эти квадраты не превышают n.
     //   Sample Input:
     //   30
    //    Sample Output:
//          1 4 9 16 25
public class SumSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sqaereNumber = Math.abs(input.nextInt());
        int counter = 1;
        while (sqaereNumber > counter * counter){
            System.out.println(counter * counter);
            counter++;

    }

}}
