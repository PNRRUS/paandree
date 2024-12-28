package Python;

import java.util.Scanner;

public class Stepik4_1_1 {
    public static void  main (String[] Args) {
        Scanner test = new Scanner(System.in);
        double number1 = test.nextDouble();
        double number2 = test.nextDouble();
        double number3 = test.nextDouble();
        double number4 = test.nextDouble();
        double number5 = test.nextDouble();
        double max = number1;
        if (max < number2){
            max = number2;
        }
        if (max < number3){
            max = number3;
        }
        if (max < number4){
            max = number4;
        }
        if (max < number5){
            max = number5;
        }
        System.out.print(max);
    }
}
