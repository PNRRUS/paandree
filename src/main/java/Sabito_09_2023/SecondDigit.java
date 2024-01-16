package Sabito_09_2023;
import java.util.Scanner;
public class SecondDigit {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int threeDigitNumber = Math.abs(input.nextInt());
    int number = Math.abs(input.nextInt());
    if (threeDigitNumber > 99 && threeDigitNumber < 999) {
        if (threeDigitNumber % 100 / 10 == number) {System.out.println("true");}
    else {System.out.println("false");}} else {System.out.println("error");}

    input.close();
    }
}
