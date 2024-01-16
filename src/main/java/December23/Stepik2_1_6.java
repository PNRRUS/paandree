package December23;
import java.util.Scanner;

//Необходимо написать программу для поиска площади и периметра квадрата или круга. Напишите две функции: perimeter и area,
//        каждая из них принимает строку - название фигуры и одно целое число (либо радиус круга, либо сторону квадрата).
//        Как результат они выводят периметр и площадь фигуры соответственно. В ответ они должны вывести именно целое
//        число (при надобности округлять "вверх", то есть до ближайшего большего целого числа). Содержание функции main
//        менять запрещено. Пи брать как 3.14.
//
//        Sample Input 1:
//
//        Квадрат
//        5
//        Sample Output 1:
//
//        20
//        25
//        Sample Input 2:
//
//        Круг
//        3
//        Sample Output 2:
//
//        19
//        29
       public class Stepik2_1_6 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String figure = sc.nextLine();
            int x = sc.nextInt();
            perimeter(figure, x);
            area(figure, x);
        }
    static void perimeter(String figure,int x) {
       if(figure.equals("Квадрат")) {
           System.out.println((int)Math.ceil((x * 4)));
       }
        if(figure.equals("Круг")) {
            System.out.println((int)Math.ceil(3.14 * (x * 2)));
        }
    }
    static void area(String figure,int x) {
        if(figure.equals("Квадрат")) {
            System.out.println((int)Math.ceil((x * x)));
        }
        if(figure.equals("Круг")) {
            System.out.println((int) Math.ceil((x * x) * 3.14));
        }
    }
}
