package Python;
//num = int(input())
//        d = num // 1000
//        c = num % 10
//        b = (num // 10) % 10
//        a = num % 1000 // 100
//        print("Цифра в позиции тысяч равна",d)
//        print("Цифра в позиции сотен равна",a)
//        print("Цифра в позиции десятков равна",b)
//        print("Цифра в позиции единиц равна",c)

//        int number = test.nextInt();
//        int d = number / 1000;
//        int c = number % 10;
//        int b = (number / 10) % 10;
//        int a =  number % 1000 / 100;
//        System.out.println("Цифра в позиции тысяч равна " + d);
//        System.out.println("Цифра в позиции сотен равна " + a);
//        System.out.println("Цифра в позиции десятков равна " + b);
//        System.out.println("Цифра в позиции единиц равна " + c);
//        System.out.print(a);
//        System.out.print(c);


//a = int(input())
//        b = int(input())
//        c = int(input())
//        d = int(input())
//        print(a ** b + c ** d)


//        long a = test.nextLong();
////        long b = test.nextLong();
////        long c = test.nextLong();
////        long d = test.nextLong();
////        double x = Math.pow(a,b) + Math.pow(c,d);
//////        Long transformedLong = Double.valueOf(x).longValue();
////
////        System.out.println(x);


//number = int(input())
//        a = number % 10
//        b = number // 1000
//        c = (number % 100) // 10
//        d = (number % 1000) // 100
//        if a + b == d - c:
//        print("ДА")
//        else:
//
//        print("НЕТ")
import java.util.Scanner;
import java.lang.Math;

public class Stepic2_5 {
    public static void main(String[] Args) {
        Scanner test = new Scanner(System.in);

        int number = test.nextInt();
        int d = number / 1000;
        int c = number % 10;
        int b = (number / 10) % 10;
        int a = number % 1000 / 100;

        if (c + d == a - b) System.out.println("ДА");
        else System.out.println("НЕТ");

    }
}
