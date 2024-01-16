package Roma_11_23;

//на вход подаётся два натуральных числа - n и m. Напечатайте число n, повторённое m раз в одной строке через пробел.
//
//        Sample Input:
//
//        3 5
//        Sample Output:
//
//        3 3 3 3 3
//На вход подаётся два натуральных числа x и y. Выведите на печать прямоугольник из звёздочек размером x*y.
//
//        Sample Input:
//
//        4 2
//        Sample Output:
//
//        **
//        **
//        **
//        **
import java.util.Scanner;
public class Stepik4_2 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int m = input.nextInt();
//        for (int i = 0;i != m;i++){
//            System.out.print(n + " ");
//        }
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        for (int i = 1;i <= x;i++) {
            for (int j = 1; j <= y;j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }}
