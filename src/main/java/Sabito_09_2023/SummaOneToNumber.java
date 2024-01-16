package Sabito_09_2023;
import java.util.Scanner;
public class SummaOneToNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int counter = 0;
        while (counter < x){
            System.out.println(counter);
            counter++;
        }
input.close();

    }
}
