package Venor_08_2023;

public class ArifmeticOperators {
        public static void main(String args[]) {
            int a = 2_142_000_000;
            int b = 30;
            int c = 15;
            int d = 5;
            System.out.println("a + b  = " + (a + b));//40
            System.out.println("a - b  = " + (a - b));//-20
            System.out.println("a * b  = " + (a * b));//300
            System.out.println("b / a  = " + (b / a));//3
            System.out.println("b % a  = " + (b % a));//0
            System.out.println("c % a  = " + (c % a));//5
            System.out.println("a++    = " + (a++));//10
            System.out.println("a--    = " + (a--));//11
            System.out.println("d++    = " + (d++));//5
            System.out.println("++d    = " + (++d));//7
            System.out.println("a += b = " + (a += b));//40
            System.out.println("a      = " + (a));//40
            System.out.println("a -= b = " + (a -= b));//10
            System.out.println("a      = " + (a));//10
            System.out.println("2 + 2 = " + 2 + 2);//2 + 2 = 22
        }

}
