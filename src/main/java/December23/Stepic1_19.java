package December23;
import java.util.Scanner;
import java.util.HashMap;
//Вводится натуральное число n, затем n слов на разных строках. Определите, какое слово встречается чаще всего.
// Гарантируется, что такое слово одно. Все слова вводятся в нижнем регистре на русском языке.
//
//        Sample Input 1:
//
//        6
//        да
//        я
//        прикалывался
//        просто
//        да
//        успокойся
//        Sample Output 1:
//
//        да
//        Sample Input 2:
//
//        10
//        просто
//        будь
//        собой
//        просто
//        будь
//        весел
//        просто
//        будь
//        добр
//        будь
//        Sample Output 2:
//
//        будь
public class Stepic1_19 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number2 = input.nextInt();
        HashMap<String, Integer> randomNumbers = new HashMap<String, Integer>();
        String word2 =  input.nextLine();

        int number = 0;
        for(int i = 0;i < number2;i++){
            word2 = input.nextLine();
            if(randomNumbers.get(word2) == null){
                randomNumbers.put(word2,1);
            } else{
                randomNumbers.put(word2,randomNumbers.get(word2) + 1);
            }



        }
        int maxValue = 0;
        String maxKey = null;
        System.out.println(randomNumbers);
        for (String key: randomNumbers.keySet()){
            if(randomNumbers.get(key) > maxValue) {
                maxValue = randomNumbers.get(key);
                maxKey = key;
            }
        }
        System.out.println(maxKey);
    }
}
