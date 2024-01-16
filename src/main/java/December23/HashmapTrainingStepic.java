package December23;
import java.util.HashMap;
import java.util.Scanner;

//Вам дан словарь, состоящий из пар слов. Каждое слово является синонимом к парному ему слову. Все слова в словаре различны.
//
//        Для слова из словаря, записанного в последней строке, определите его синоним.
//
//        Вводится число n. Затем 2*n строк. И Ещё одна строка - синоним для которой нужно вывести.
//
//        Sample Input:
//
//        3
//        Hello
//        Hi
//        Bye
//        Goodbye
//        List
//        Array
//        Goodbye
//        Sample Output:
//
//        Bye
class HashmapTrainingStepic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> human = new HashMap<String, String>();

        int number2 = input.nextInt();
        String number3 = input.nextLine();
        String number4;
        String number5;
       for(int i = 1;i <= number2;i++){
            number4 = input.nextLine();
            number5 = input.nextLine();
           human.put(number5, number4);
           human.put(number4, number5);
       }
        String number6 = input.nextLine();
        System.out.println(human.get(number6));
    }
}