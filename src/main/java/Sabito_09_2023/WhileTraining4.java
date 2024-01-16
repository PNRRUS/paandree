package Sabito_09_2023;

import java.util.Scanner;

// задачу составляет рома, а делает папа
//есть танк, у него есть хп, то есть,  переменная сканер. Потом рандомайзером отнять какое-то количество хп
// и когда хп кончится - написать ,танк уничтожен,
public class WhileTraining4 {
    public static void main(String[] Args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Начальный HP : ");
        int HP = input.nextInt(); // 1-4000
        int counter = 1;

        int damage = 0; // 0-800

        while (HP > 0) {

            damage = (int) Math.round((Math.random() * 800)); // 0-800
            HP = HP - damage;
            if (HP > 0) {System.out.println("Выстрел " + counter + " Остаток HP : " + HP); counter++;}
        }
input.close();
    }

}
