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
public class Stepik2_1_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        simpleAB(x, y);
    }

    static void simpleAB(int x,int y) {
        boolean simpleYN = true;
        for (int i = x; i <= y; i++) {
            simpleYN = true;
            if (i == 1){
                System.out.println("1 - 1");
                simpleYN = false;
            }
            if (i == 2){
                System.out.println("2 - простое");
                simpleYN = false;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println(i + " - " + "составное");
                    simpleYN = false;
                    break;
                }
            }
                if (simpleYN) {
                    System.out.println(i + " - " + "простое");

                }
        }
    }
}

