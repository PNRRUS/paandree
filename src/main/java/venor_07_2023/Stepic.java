package venor_07_2023;

import java.util.Scanner;

public class Stepic
    {
        public static void main(String[] args) {
            Scanner vvod = new Scanner(System.in);
            System.out.println("введите целое число");
            int zeloeChislo = vvod.nextInt();
            int ostatok = zeloeChislo % 10;
            System.out.print(Math.abs(ostatok));
        }
    }


