package December23;

import java.util.HashSet;
import java.util.Scanner;
//Дан текст: в первой строке записано число строк, далее идут сами строки. Определите, сколько различных слов содержится
//        в этом тексте.
//
//        Словом считается последовательность непробельных символов идущих подряд, слова разделены одним или большим
//        числом пробелов или символами конца строки.
//
//        Sample Input:
//
//        4
//        She sells sea shells on the sea shore;
//        The shells that she sells are sea shells I'm sure.
//        So if she sells sea shells on the sea shore,
//        I'm sure that the shells are sea shore shells.
//        Sample Output:
//
//        19
public class Stepik1_19_8 {
    public static void main(String[] args) {

        HashSet<String> quantityWords = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int repeatNumber = input.nextInt();
        String vvod;
        for (int i = 0; i < repeatNumber; i++) {
            vvod = input.nextLine();
            String[] words = vvod.split(" ");
            for(String test : words){
            quantityWords.add(test);
            }
        }
        System.out.println(quantityWords.size());
    }
}