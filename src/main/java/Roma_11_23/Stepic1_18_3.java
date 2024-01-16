package Roma_11_23;

import java.util.ArrayList;
import java.util.Scanner;
//Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый
// и последний элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.
//        Sample Input:
//        3
//        Sample Output:
//        1 0 0 0 1
class Stepic1_18_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> number = new ArrayList<>();
        int scan = sc.nextInt();
        number.add(1);
        for (int i = 1;i <= scan;i++){
            number.add(0);
        }
        number.add(1);
        for(int j: number){
            System.out.print(j + " ");
        }
    }
}
