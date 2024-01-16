package December23;
import java.util.Scanner;

//Площадь треугольника можно вычислить по формуле Герона. Напишите функцию geron,
// которая по трём действительным числам находит площадь треугольника и выводит её на экран.
// Если такого треугольника не существует, то выведите на экран "Такого треугольника не существует".
// Содержимое функции main менять запрещено.
//S=√
//
//
//Sample Input:
//
//3
//4
//5
//Sample Output:
//
//6.0
public class Stepik2_1_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(args.length);
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();

        geron(s1, s2, s3);
        //разместите свою функцию, например здесь
    }

    //a + b > c, b + c > a, a + c > b.
    static void geron(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            System.out.println(S);
        } else {
            System.out.println("Такого треугольника не существует");
        }
    }
}
