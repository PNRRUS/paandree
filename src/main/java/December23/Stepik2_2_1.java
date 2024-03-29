package December23;
import java.util.Scanner;

//Сила Архимеда
//Закон Архимеда
//
//Выталкивающая сила, действующая на тело, погруженное в жидкость, равна по модулю весу вытесненной жидкости и противоположно ему направлена.
//
//
//
//Напишите функцию arhimed, которая принимает на вход 2 натуральных числа: плотность жидкости (кг/м^3), в которую погружают тело и объём тела (м^3). Функция должна именно вернуть значение силы Архимеда. Считать g = 10 H/кг. Содержание функции main менять запрещено.
//
//Sample Input:
//
//1000
//2
//Sample Output:
//
//F = 20000H
public class Stepik2_2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ro = sc.nextInt();
        int V = sc.nextInt();
        int F = arhimed(ro, V);
        System.out.println("F = " + F + "H");
    }

    static int arhimed(int ro, int V) {
        return 10 * ro * V;
    }
}


