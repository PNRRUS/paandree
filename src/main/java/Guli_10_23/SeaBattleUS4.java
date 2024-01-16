package Guli_10_23;

/* юзер стори 1 включает в себя поиск и уничтожение одного корабля на площади 5 на пять.
 Компьютер генерирует случайное число от одного до четырех, что составляет количеству палуб у корабля,
  координаты от одного до пяти по вертикали и горизонтали.
   Создается массив пять на пять по координатам корабля заполняется цифрой один остальные поля ноль по умолчанию
   вывести на экран полученный массив
 */
/*Юзер стори 2, завести массив 5 на 5 для отображения выстрелов пользователя тип массива char вывести на экран значения элементов массива
 */
/*сделать четыре выстрела гарантировано  потопить 1 корабль
 */import java.util.Scanner;

public class SeaBattleUS4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int counter2 = 1;
        int counter = 0;
        int counter1 = 0;
        int arrayWidth = 10;
        int[][] arr = new int[10][10];
        int numberShip = (int) Math.round((Math.random() * 3) + 1);
        int line = (int) Math.round((Math.random() * 9) + 1);
        int column = (int) Math.round((Math.random() * 9) + 1);
        //arr[line - 1][column - 1] = 1;
        for (int counter0 = 0;counter0 < 5;counter0++){
            while (column + numberShip > 11) {
                column = (int) Math.round((Math.random() * 9) + 1);}
        for(int v = 1;v <= numberShip;v++) {
            arr[line - 1][column - 2 + v] = numberShip;}
            numberShip = (int) Math.round((Math.random() * 3) + 1);
            line = (int) Math.round((Math.random() * 9) + 1);
            column = (int) Math.round((Math.random() * 9) + 1);

        }
        for (int counter0 = 0;counter0 < 5;counter0++){
            while (line + numberShip > 11)  {
                line = (int) Math.round((Math.random() * 9) + 1);}
            for(int v = 1;v <= numberShip;v++) {
                arr[line - 2 + v][column - 1] = numberShip;}
            numberShip = (int) Math.round((Math.random() * 3) + 1);
            line = (int) Math.round((Math.random() * 9) + 1);
            column = (int) Math.round((Math.random() * 9) + 1);

        }

System.out.println("    1 2 3 4 5 6 7 8 9 10");
        while (counter1 < arrayWidth) {
            if (counter2 == 10){System.out.print(counter2 + "[ ");
            } else {
            System.out.print(counter2 + " [ ");}



            counter2++;
            while (counter < arrayWidth) {
                System.out.print(arr[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n" );
            counter1++;
    }
        counter2 = 1;
        counter = 0;
        counter1 = 0;
        arrayWidth = 10;
        char[][] arrFire = new char[10][10];
        System.out.println("\n" + "    1 2 3 4 5 6 7 8 9 10");
        while (counter1 < arrayWidth) {
            if (counter2 == 10){System.out.print(counter2 + "[ ");
            } else { System.out.print(counter2 + " [ ");}
            counter2++;
            while (counter < arrayWidth) {
                System.out.print(arrFire[counter1][counter] + " ");

                counter++;
            }
            counter = 0;
            System.out.print("]" + "\n");
            counter1++;
        }

        int summa= 1;
             while (summa != 0) {
                 System.out.print("номер строки: ");
                 int gorisont = input.nextInt();
                 System.out.print("номер столбца: ");
                 int vertical = input.nextInt();
                 if (arr[gorisont - 1][vertical - 1] != 0) {
                     arrFire[gorisont - 1][vertical - 1] = 88;
                     arr[gorisont - 1][vertical - 1] = 0;
                 } else {
                     arrFire[gorisont - 1][vertical - 1] = 79;
                 }



            counter = 0;
            counter1 = 0;
            arrayWidth = 10;
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
            summa= 0;
        for (int g = 0; g < 10; g++) {
            for (int j = 0; j < 10; j++) {
                summa += arr[g][j];
            }}
       System.out.println("Сумма элементов: " + summa);
        }
    }}

//int max = arr[0][0];
//    int min = arr[0][0];
//            for (int i = 0; i < arrayHeight; i++) {
//        for (int j = 0; j < arrayWidth; j++) {
//        if (arr[i][j] >= max) {
//        max = arr[i][j];
//        }
//        if (arr[i][j] <= min) {
//        min = arr[i][j];
//        }
//        }
//        }
///*for(int v = 1;v <= numberShip;v++) {
//arr[number2][v] = 1;}
// */