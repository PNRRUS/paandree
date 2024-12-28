package Python;

import java.util.Scanner;

public class Stepik4_1 {
    public static void main (String[] Args) {
        Scanner test = new Scanner(System.in);
        int number1 = test.nextInt();
        int number2 = test.nextInt();
        int number3 = test.nextInt();
        int number4 = test.nextInt();
        int min = number1;
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        if (number4 < min) {
            min = number4;
        }
        System.out.print(min);
    }
}
