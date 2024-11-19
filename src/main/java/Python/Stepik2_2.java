package Python;
//текст с питона
// text1 = input()
//text2 = input()
//text3 = input()
//print(text1)
//print(text2)
//print(text3)
//
//name = input()
//print(name,"- чемпион!")

import java.util.Scanner;
public class Stepik2_2 {
    public static void main (String[] args){
        Scanner text = new Scanner(System.in);
//        String variable1 = text.nextLine();
//        String variable2 = text.nextLine();
//        String variable3 = text.nextLine();
//        System.out.println(variable1);
//        System.out.println(variable2);
//        System.out.println(variable3);
//
//        String footballBand = text.nextLine();
//        System.out.print(footballBand + " - чемпион!");


//       int variable9 = text.nextInt();
//        String variable10 = Integer.toString(variable9);
//        System.out.println(variable10 + " Андреев Павел Юрьевич");
//        int variable11 = Integer.valueOf(variable10);
//        System.out.print(variable11 + 7);
//        text.close();

//        x = int(input())
//        print(x, "---", x * 2, "---", x * 3, "---", x * 4, "---", x * 5, sep = "")
        int x = text.nextInt();
        System.out.print(x + "---" + x * 2 + "---" + x * 3 + "---" + x * 4 + "---" + x * 5);
        text.close();
    }
}
