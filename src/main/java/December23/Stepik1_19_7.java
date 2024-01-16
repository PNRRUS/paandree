package December23;

import java.util.HashSet;
import java.util.Scanner;
//Вводится число n, затем n целых чисел. Для каждого числа выведите слово YES (в отдельной строке),
//        если это число ранее встречалось в последовательности или NO,  если не встречалось.
//
//        Sample Input:
//
//        6
//        1 2 3 2 3 4
//        Sample Output:
//
//        NO
//        NO
//        NO
//        YES
//        YES
//        NO
public class Stepik1_19_7 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int repeatNumber = input.nextInt();
        int vvod;
        for (int i = 0; i < repeatNumber; i++) {
            vvod = input.nextInt();
            if(numbers.contains(vvod)){
System.out.println("YES");
            } else {System.out.println("NO");}
            numbers.add(vvod);
        }
        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}