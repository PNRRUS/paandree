package Guli_10_23;

/*  вывести на экран - бросить кость? (да - 7, нет - 8 (переход хода)
    генерится число от 1 до 6 и выводится на экран "вам выпало "... число
    ваша сумма очков = ... 0+число (+=)
    сумма очков игрока = 0 изначально плюс сгенеренное число
    игрок бросает кость до тех пор, пока не введет 8, или не выпадет цифра 1 (свинья)
    повторить ход 10 раз

    если выпало 1 - сумма обнуляться. Ход переходит к другому игроку.
    выводится кол-во очков 0 либо набранная сумма по итогу серии бросков кости

    цель игры - набрать 100 очков.
 */


import java.util.Scanner;

public class RandomDiceOpt1 {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int daIliNet;
int summa = 0;
int number;
do {
    System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
            "пишите здесь: ");
    daIliNet = input.nextInt();
    if (daIliNet == 7) {
    number = (int) Math.round(Math.random() * 5) + 1;
        summa += number;

    if (number == 1) {
            System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
            System.out.print(" очередь другого игрока: ");
            daIliNet = 8;
        } else { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa + "\n");
        }
    }
} while (daIliNet != 8);

input.close();
    }
}




































