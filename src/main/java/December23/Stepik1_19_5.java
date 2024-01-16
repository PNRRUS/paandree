package December23;

import java.util.LinkedHashMap;
import java.util.Scanner;

//Вводится число n. Затем 2*n строк. Каждая пара строк - имя человека и его профессия. Определите,
// сотрудников какой профессии больше всего. Выведите на экран это количество, профессию и их имена на экран в том же
// порядке,в котором они вводились. Гарантируется, что будет введено не более 100 сотрудников.
//
//        Sample Input:
//
//        7
//        Иван
//        Токарь
//        Семён
//        Программист
//        Анатолий
//        Кузнец
//        Вася
//        Финансист
//        Кирилл
//        Программист
//        Оля
//        Программист
//        Валера
//        Токарь
//        Sample Output:
//
//        3
//        Программист
//        Семён
//        Кирилл
//        Оля
public class Stepik1_19_5 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number2 = input.nextInt();
        LinkedHashMap<String, Integer> professionNumber = new LinkedHashMap<String, Integer>();
        LinkedHashMap<String, String> profession = new LinkedHashMap<String, String>();
        String wordName = input.nextLine();
        String wordProfession;
        for (int i = 0; i < number2; i++) {
            wordName = input.nextLine();
            wordProfession = input.nextLine();
            profession.put(wordName, wordProfession);
            if (professionNumber.get(wordProfession) == null) {
                professionNumber.put(wordProfession, 1);
            } else {
                professionNumber.put(wordProfession, professionNumber.get(wordProfession) + 1);
            }
        }
        int maxValue = 0;
        String maxKey = null;
        System.out.println(professionNumber);
        for (String key : professionNumber.keySet()) {
            if (professionNumber.get(key) > maxValue) {
                maxValue = professionNumber.get(key);
                maxKey = key;
            }
        }
        System.out.println(maxKey);
        for (String value : profession.keySet()) {
            if (profession.get(value).equals(maxKey)) {
                System.out.println(value);
            }
        }
    }
}


