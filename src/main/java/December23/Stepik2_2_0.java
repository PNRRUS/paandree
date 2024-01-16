package December23;
import java.util.Scanner;

//Напишите функцию simpleAB, которая принимает 2 натуральных числа a и b (a <= b) и анализирует все числа на промежутке
// от
//        a до b включительно на их простоту. Она должна вывести на экран для
//        каждого числа строку вида "{число} - {простое/составное/1}". Содержание функции main менять запрещено.
//
//        Sample Input:
//
//        1
//        6
//        Sample Output:
//
//        1 - 1
//        2 - простое
//        3 - простое
//        4 - составное
//        5 - простое
//        6 - составное
public class Stepik2_2_0 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        area(a, b, c);
    }

    static void area(int a,int b,int c) {
System.out.println((a * b) * 2 + (a * c) * 2 + (c * b) * 2);
        }
    }


