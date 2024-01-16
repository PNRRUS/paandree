package Sabito_09_2023;
//вести на экран десять случайных чисел от нуля до ста

public class WhileTraining3 {
    public static void main(String[] args){
        int counter = 1;
        int number;

              while (counter != 11) {
                 number = (int) Math.round((Math.random() * 100 ) + 1);
                  System.out.println(number);
                  counter++;
              }

        counter = 101;
              while (counter != -1) {
            System.out.println(counter);
            counter--;
        }

    }
}
