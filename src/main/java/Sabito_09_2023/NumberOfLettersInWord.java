package Sabito_09_2023;
import java.util.Scanner;
public class NumberOfLettersInWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        System.out.println(NumberInWord(word));
    }

    public static String NumberInWord(String wordNumber) {
        int vordnumber = wordNumber.length();
        switch (vordnumber) {
            case 1:
                return("Одна буква");
            case 2:
                return("Две буквы");
            case 3:
                return("Три буквы");
            case 4:
                return("Четыре буквы");
            case 5:
                return("Пять букв");
            default:
                return("Длинное слово");
        }
    }
}