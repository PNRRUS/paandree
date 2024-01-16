package Guli_10_23;

import java.util.Scanner;
public class TrainingInformatics {
    public static void main(String[] Args) {
        System.out.println("Введите количество символов в алфавите: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int z = 2;
System.out.println("x" + " N");
int counter;
        for (counter = 0;counter <= 10; counter++){
            System.out.println(counter + " " + (int) Math.pow(2, counter));
        }
counter = 1;
       while (n > z) {
           counter++;
               z *= 2;}
               System.out.println( "один символ займет " + counter + " бит");
               input.close();
       }
    }

