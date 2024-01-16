package Venor_08_2023;

import java.util.Scanner;

public class India {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Integer x = Integer.valueOf(input.next());
        //Integer y = Integer.valueOf(input.next());
        int x = input.nextInt();
        int y = input.nextInt();
        if (x > y) {
            System.out.println("Махатма");
        } else {
            System.out.print("Джавахарлал");
        }
    }
}

