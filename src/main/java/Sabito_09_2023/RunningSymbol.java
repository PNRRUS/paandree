package Sabito_09_2023;

import java.util.Scanner;

//однозначное целое число введено с клавиатуры напечатать это число правее на десять символов  и бегущий символ до начала строки
public class RunningSymbol {
    public static void main(String[] Args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int counter = 0;
        System.out.print("          " + v);
        while (counter <= 10) {
            System.out.print("\b" + "\b" + v);
            Thread.sleep(100);
            counter++;
        }

        while (counter > 10 && counter < 20) {
//                System.out.print("\b" + "\t" + vvod);
            System.out.print("\b" + "  " + v);
            Thread.sleep(100);
            counter++;
        }
        while (counter > 19 && counter < 30) {
            System.out.print("\b" + "\n" + "                   " +  v );
            Thread.sleep(100);
            counter++;
        }
        while (counter > 29 && counter < 50) {
            System.out.print("\b" + "\b" + v);
            Thread.sleep(100);
            counter++;
        }
        System.out.println("\b" + "       " + v + v + v + v + "      " );
        Thread.sleep(600);
        System.out.println("     " + v + v + v + v + v + v + v + v + "    " );
        Thread.sleep(600);
        System.out.println("    " + v + v + v + v + v + v + v + v + v + v + "   " );
        Thread.sleep(600);
        System.out.println(" " +  v + v + v + v + v + v + v + v + v + v + v + v + v + v + v + v + " ");
        Thread.sleep(600);
        System.out.println("      "  + v + v + v + v + v + v + "      " );
        Thread.sleep(600);
        System.out.println("       " + v + v + v + v + "       " );
        Thread.sleep(600);
        System.out.println("        " + v + v + "        " );
        Thread.sleep(600);
        System.out.println("        " + v + v + "        " );
        Thread.sleep(600);
        System.out.println("       " + v + v + v + v + "       " );
        Thread.sleep(600);
        System.out.println("    " + v + v + v + v + v + v + v + v + v + v + "    " );
        Thread.sleep(600);
        System.out.println("" + v +  v + v + v + v + v + v + v + v + v + v + v + v + v + v + v + v + v);
        Thread.sleep(600);
        java.awt.Toolkit.getDefaultToolkit().beep();
        input.close();

    }
}

