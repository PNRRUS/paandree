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
        String variable1 = text.nextLine();
        String variable2 = text.nextLine();
        String variable3 = text.nextLine();
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);

        String footballBand = text.nextLine();
        System.out.print(footballBand + " - чемпион!");
        text.close();
    }
}
