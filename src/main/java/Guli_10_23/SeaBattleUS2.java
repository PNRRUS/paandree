package Guli_10_23;

import java.util.Scanner;

/* юзер стори 1 включает в себя поиск и уничтожение одного корабля на площади 5 на пять.
 Компьютер генерирует случайное число от одного до четырех, что составляет количеству палуб у корабля,
  координаты от одного до пяти по вертикали и горизонтали.
   Создается массив пять на пять по координатам корабля заполняется цифрой один остальные поля ноль по умолчанию
   вывести на экран полученный массив
 */
/*Юзер стори 2, завести массив 5 на 5 для отображения выстрелов пользователя тип массива char вывести на экран значения элементов массива
 */
public class SeaBattleUS2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int counter1 = 0;
        int arrayWidth = 5;
        int[][] arr = new int[5][5];
        int numberShip = (int) Math.round((Math.random() * 3) + 1);
        int line = (int) Math.round((Math.random() * 4) + 1);
        int column = (int) Math.round((Math.random() * 4) + 1);
        //arr[line - 1][column - 1] = 1;
        while (column + numberShip > 6) {
             column = (int) Math.round((Math.random() * 4) + 1);
        }
        for(int v = 1;v <= numberShip;v++) {
            arr[line - 1][column - 2 + v] = 1;}



        while (counter1 < arrayWidth) {
            System.out.print("[ ");
            while (counter < arrayWidth) {
                System.out.print(arr[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n" );
            counter1++;
    }
        counter = 0;
        counter1 = 0;
        arrayWidth = 5;
        char[][] arrFire = new char[5][5];
        while (counter1 < arrayWidth) {
            System.out.print("[ ");
            while (counter < arrayWidth) {
                System.out.print(arrFire[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n");
            counter1++;
        }
        System.out.print("номер строки: ");
        int gorisont = input.nextInt();
        System.out.print("номер столбца: ");
       int vertical = input.nextInt();
       if (arr[gorisont - 1][vertical - 1] == 1){
           arrFire[gorisont - 1][vertical - 1] = 88;
       } else {arrFire[gorisont - 1][vertical - 1] = 79;}

        counter = 0;
        counter1 = 0;
        arrayWidth = 5;
        while (counter1 < arrayWidth) {
            System.out.print("[ ");
            while (counter < arrayWidth) {
                System.out.print(arrFire[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n");
            counter1++;
        }
    }
}
/*for(int v = 1;v <= numberShip;v++) {
arr[number2][v] = 1;}
 */