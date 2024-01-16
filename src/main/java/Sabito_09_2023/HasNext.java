package Sabito_09_2023;

import java.util.Scanner;

class HasNext {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int counter = 0;
        String a;
        while (input.hasNext()) {
            a = input.next();
            counter++;
        }
        System.out.println(counter);
        input.close();
    }

}
