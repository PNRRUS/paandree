package Sabito_09_2023;

public class Matrix {
    public static void main(String[] Args){
       char number;
       int counter = 0;
        int counter1 = 0;


        while (counter1 < 80) {
                   while (counter <= 500) {
                       number = (char) Math.round((Math.random() * 128) + 100);
                       System.out.print(number);
                       counter++;
                   }
                   counter = 0;
                   System.out.print("\n");
                   counter1++;
               }
           }
}
