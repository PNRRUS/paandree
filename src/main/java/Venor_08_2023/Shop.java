package Venor_08_2023;
//вывести на экран пронумерованый список товаров с ценами на товар пользователь воодит номер выбранного товара запросить
// необходимое количество для покупки запросить наличные  вывести успешная покупка и размер здачиили не хватает дененг
// если сумма меньше требуемой

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        System.out.println("/1/ арбуз цена: 23 р." + "\n" + "/2/ шампунь 'русская банька' цена: 183 р." + "\n" +
                "/3/ лимонад 'ключик'(1 литр) цена: 56 р." + "\n" + "/4/ кабачок импортный(1кг) цена: 128 р.");
        System.out.print("введите номер товара: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("какое количество товара вы возьмете(штук)?: ");
        int colichestvo = input.nextInt();
        if (number == 1) {
            System.out.println("сумма покупки равна = " + colichestvo * 23 + " р.");
        }
        if (number == 2) {
            System.out.println("сумма покупки равна = " + colichestvo * 183 + " р.");
        }
        if (number == 3) {
            System.out.println("сумма покупки равна = " + colichestvo * 56 + " р.");
        }
        if (number == 4) {
            System.out.println("сумма покупки равна = " + colichestvo * 128 + " р.");
        }
        System.out.println("какую сумму в можете предложить?: ");
        int cocheloc = input.nextInt();

        if (number == 1 && cocheloc < 23 * colichestvo) {
            System.out.print("товар не одобрен." + "\n" + "недостаточно средств");
        } else {
            if (number == 1 && cocheloc >= 23 * colichestvo) {
                System.out.print("товар продан." + "\n" + "ваша сдача:" + (cocheloc - colichestvo * 23));
            }

            if (number == 2 && cocheloc < 183 * colichestvo) {
                System.out.print("товар не одобрен." + "\n" + "недостаточно средств");
            } else {
                if (number == 2 && cocheloc >= 183 * colichestvo) {
                    System.out.print("товар продан." + "\n" + "ваша сдача:" + (cocheloc - colichestvo * 183));
                }

                if (number == 3 && cocheloc < 56 * colichestvo) {
                    System.out.print("товар не одобрен." + "\n" + "недостаточно средств");
                } else {
                    if (number == 3 && cocheloc >= 56 * colichestvo) {
                        System.out.print("товар продан." + "\n" + "ваша сдача:" + (cocheloc - colichestvo * 56));
                    }

                    if (number == 4 && cocheloc < 128 * colichestvo) {
                        System.out.print("товар не одобрен." + "\n" + "недостаточно средств");
                    } else {
                        if (number == 4 && cocheloc >= 128 * colichestvo) {
                            System.out.print("товар продан." + "\n" + "ваша сдача:" + (cocheloc - colichestvo * 128));
                        }
                    }
                }
            }
        }
    }
}
