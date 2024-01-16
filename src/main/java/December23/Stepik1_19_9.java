package December23;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;

//Несколько друзей решили сыграть в игру: кто больше слов знает. Они сели за стол и стали записывать все слова,
// которые только пришли им на ум. После чего стали сравнивать, у кого больше слов. В этот момент стало понятно,
// что некоторые ребята по ошибке записали какие-то слова несколько раз. Разумеется, повторяющиеся слова вычеркнули.
// Потом они поняли, что слов слишком много, поэтому решили считать только те, длина которых не меньше, чем K.
// Помогите ребятам узнать, кто же знает больше слов. Гарантируется, что есть единственный победитель .
//
//Входные данные:
//Сначала вводится число n - количество ребят. Затем идёт n строк вида:
//
//"Имя ребёнка: слово1 слово2 слово3 и т.д."
//
//После чего вводится число K.
//
//Выходные данные:
//Выведите на экран имя ребёнка и количество слов, которое он знает (они не должны повторяться и их длина должна быть не меньше К).
//
//Учтите, что некоторые слова дети могут написать в разных регистрах. Например, слова "Слово" и "слово" - это одно и то же.
//
//Sample Input:
//3
//Андрей: гусь Мама папа крик машина кто где вот таз кар рак так
//Маша: карлик планета монета Планета Карлик Монета
//Игорь: ковролин математика физика кот суп душ май химия хитрость
//5
//Sample Output:
//Игорь 5
public class Stepik1_19_9 {
    public static void main(String[] args) {
        HashMap<String, LinkedHashSet> words = new HashMap<String, LinkedHashSet>();
        LinkedHashSet<String> friends;
        Scanner input = new Scanner(System.in);
        int repeatNumber = input.nextInt();
        String[] arrFire = new String[repeatNumber];
        String vvod, name, sloveshki;
        String jnduiv = input.nextLine();
        int vvod2;
        for (int i = 0; i < repeatNumber; i++) {
            vvod = input.nextLine();
            arrFire[i] = vvod.toLowerCase() ;
            }
        int wordsLength = input.nextInt();
        for (int i = 0; i < repeatNumber; i++) {
            friends = new LinkedHashSet<>();
            name = arrFire[i].substring(0, arrFire[i].indexOf(":"));
            sloveshki = arrFire[i].substring(arrFire[i].indexOf(":") + 2);
            String[] words2 = sloveshki.split(" ");
            for (String test : words2) {
                if(test.length() >= wordsLength) {
                    friends.add(test);
                }
                words.put(name, friends);
            }

        }
        System.out.println(words);
        String maxKey =  "";
        int maxSize = 0;
        for (String key: words.keySet()){


        if(words.get(key).size() >= maxSize){
            maxSize = words.get(key).size();
            maxKey = key;

        }
        }
            System.out.print(maxKey + " ");
            System.out.print(maxSize);
        }

    }
