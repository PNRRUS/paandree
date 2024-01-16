package December23;
import java.util.Scanner;

//Напишите функцию int min (int a, int b, int c, int d) , находящую наименьшее из четырех данных чисел и возвращающую
// ответ.
//
//Входные данные
//Вводится четыре числа.
//
//Выходные данные
//Необходимо вывести  наименьшее из 4-х данных чисел.
//
//Содержание функции main менять запрещено.
//
//Sample Input:
//
//3
//1
//2
//6
//Sample Output:
//
//1
public class Stepik2_3_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println(min(a, b, c, d));
    }

    static int min(int a, int b, int c, int d) {
        int counter = 0;
        if (a < b && a < c && a < d) {
            counter = a;
        }
        if (b < a && b < c && b < d) {
            counter = b;
        }
        if (c < b && c < a && c < d) {
            counter = c;
        }
        if (d < b && d < c && d < a) {
            counter = d;
        }
        return counter;
    }
}


