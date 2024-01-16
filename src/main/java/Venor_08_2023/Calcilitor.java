package Venor_08_2023;
import java.util.Scanner;

public class Calcilitor {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

        String multiplication = "*";
        String division = "/";
        String subtraction = "-";
        String addition = "+";
        String remains = "%";
      System.out.print("введите первое число: ");
      double  firstNumber = input.nextDouble();
      System.out.print("введите второе число: ");
      double  secondNumber = input.nextDouble();
      input.nextLine();

        System.out.print("введите знак действия, которое вы хотите сделать с числами: ");
        String deistvie = input.nextLine();

     if (deistvie.equals(multiplication)) {
         System.out.print( "ответ равен: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
     }
     if (deistvie.equals(division)) {
         System.out.print("ответ равен: " +   firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
     }
     if (deistvie.equals(addition)) {
         System.out.print("ответ равен: " +   firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
     }
     if (deistvie.equals(subtraction)) {
         System.out.print("ответ равен: " +   firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
     }
     if (deistvie.equals(remains)) {
         System.out.print("ответ равен: " +   firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
     }
input.close();

    }
}
