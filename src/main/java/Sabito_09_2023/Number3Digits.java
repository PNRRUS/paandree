package Sabito_09_2023;
import java.util.Scanner;

// вводится некоторое целое число

// на ввод подается кол-во разрядов в числе, которое необходимо проверить - вывести YES, если кол-во разрядов
// в числе совпадает с введенным значением, и вывести NO, если кол-во разрядов в числе не совпадает с введенным значением
// пример ввода: 999 3 YES
//1000 4 YES
//100 2 NO
public class Number3Digits {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Напишите число:");
            int vvodNumber = Math.abs(input.nextInt());
            System.out.println("Напишите число разрядов данного числа:");

            int inputNumOfDigits = Math.abs(input.nextInt());
            System.out.println(digitsMetode(vvodNumber,inputNumOfDigits));//System.out.println(vipMenSolution(men));
            input.close();
            }

            public static String digitsMetode(int vvodNumber, int inputNumOfDigits) {
            vvodNumber = Math.abs(vvodNumber);
            inputNumOfDigits = Math.abs(inputNumOfDigits);
                String inputNumber1 = Integer.toString(vvodNumber);
                if (inputNumOfDigits == inputNumber1.length()) {return ("YES");
                } else {return ("NO"); }
            }
            }



            //            String inputNumber1 = Integer.toString(vvodNumber);
//            if (inputNumOfDigits == inputNumber1.length()) {System.out.println("YES");
//            } else {System.out.println("NO"); }