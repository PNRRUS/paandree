package Roma_11_23;

import java.util.ArrayList;
import java.util.Scanner;

//Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s на позицию m. Выведите список на экран через пробел.
//
//        Sample Input:
//
//        5
//        2
//        Строка
//        Sample Output:
//
//        0 1 Строка 2 3 4
class Stepic1_18_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> number = new ArrayList<>();
//        int scan = sc.nextInt();
//        int counter = sc.nextInt();
//        String kot = sc.next();
//
//
//        for (int i = 0;i < scan;i++){
//            number.add(Integer.toString(i));
//
//        }
//        number.add(counter,kot);
//        for(String j: number){
//            System.out.print(j + " ");
//        }

        String counter2 = sc.nextLine();
        System.out.println(counter2.substring(2));
    }
}
