package Venor_08_2023;

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
public class RandomDice {
    public static void main(String[] args) {
        System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                "пишите здесь: ");
Scanner input = new Scanner(System.in);
int daIliNet = input.nextInt();
int summa = 0;
int number = (int) Math.round(Math.random() * 5) + 1;
if (daIliNet == 7) {
    summa += number;
    if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa + "\n");
        System.out.print("очередь другого игрока: "); daIliNet = 8;
    }
    else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa + "\n");

} else {System.out.print(" очередь другого игрока: ");}

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }
        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

        if (daIliNet == 7) {
            System.out.print("\n" + "хотите бросить кости?" + "( да - 7, " + " нет - 8 )" + "\n" +
                    "пишите здесь: ");
            daIliNet = input.nextInt();
            number = (int) Math.round(Math.random() * 5) + 1;
            if (daIliNet == 7) {
                summa += number;
                if (number == 1) { System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + "0");
                    System.out.print(" очередь другого игрока: "); daIliNet = 8;
                }
                else System.out.println("\n" + "вам выпало: " + number + "\n" + "ваш счет: " + summa  + "\n");
            } else {
                System.out.print("ваш счет: " + summa + "\n");
                System.out.print("очередь другого игрока: ");
            }
        }

input.close();

    }
}

//System.out.println("\n" + "случайное число от нуля до единицы " + (int) Math.round(Math.random() * 6));




































