package Venor_08_2023;
//вводятся два слова, например, РОМА и --++ ответ - --РОМА++

// makeWrapWord("Hello", "(())") -> ((Hello))
// makeWrapWord("Crabs", "}}{{") -> }}Crabs{{
//длина wrap = 4 всегда
import java.util.Scanner;
public class Wrap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstWord = input.nextLine();
        String SecondWord = input.nextLine();
        System.out.println("" + SecondWord.charAt(0) + SecondWord.charAt(1) + firstWord + SecondWord.charAt(2)
        + SecondWord.charAt(3));
        input.close();
    }

}
