package December23;
import java.util.Scanner;

//Возведение в степень
//Напишите функцию возведения числа в степень pow.
//
//Входные данные
//Вводится 2 числа - a (вещественное) и n (целое неотрицательное).
//
//Выходные данные
//Необходимо вывести  значение an.
//
//Пользоваться функцией pow из библиотеки Math запрещено. Содержание функции main менять запрещено.
//
//Sample Input:
//
//2
//5
//Sample Output:
//
//32.0
public class Stepik2_3_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        int n = sc.nextInt();
        System.out.println(pow(a, n));
    }

    static double pow(double a, int n) {
        double power = a;
        if (n == 0) {return 1;}
        for (int i = 1; i < n; i++){
        power = power * a;}
        return power;
    }
}


