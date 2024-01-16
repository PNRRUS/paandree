package Sabito_09_2023;
//вывести на экран десять случайных целых чисел напротив каждого числа поставить признак четное или не четное
//вывести на экран количество четных и не четных чисел в последовательности,
public class WhileTraining5 {
    public static void main(String[] Args) {
        int number = 0;
        int odd = 0;
        int even = 0;
        int counter = 0;
        while (counter < 10) {
            number = (int) Math.round((Math.random() * 100)); // 0-100
            if (number % 2 == 0) {System.out.println(counter + 1 + ". " + number + " четное число.");
            even++;} else {System.out.println(counter + 1 + ". " + number + " нечетное число."); odd++;}
            counter++;

        }
System.out.println("количество четных = " + even +  "\n" + "количество нечетных = " + odd);

        System.out.print(3);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.print("\b");
        System.out.print("5");

    }
}
