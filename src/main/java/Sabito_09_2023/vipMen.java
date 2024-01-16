package Sabito_09_2023;
import java.util.Scanner;
public class vipMen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String men = input.nextLine();
        System.out.println(vipMenSolution (men));

        input.close();
    }

    public static String vipMenSolution (String greeting) {
        String Ilon = "Илон Маск";
        String Mark = "Марк Цукерберг";
        String Bill = "Билл Гейтс";
        String Dgef = "Джефф Безос";
        if (greeting.contains(Ilon) || greeting.contains(Mark) || greeting.contains(Bill) || greeting.contains(Dgef))
        {return ("Добро пожаловать!");}
        else {return("Здесь никого нет, Вы ошиблись дверью");}

    }

}


//String Ilon = "Илон Маск";
//String Mark = "Марк Цукерберг";
//        String Bill = "Билл Гейтс";
//        String Dgef = "Джефф Безос";
//        if (men.contains(Ilon) || men.contains(Mark) || men.contains(Bill) || men.contains(Dgef))
//        {System.out.println("Добро пожаловать!");} else {System.out.println("Здесь никого нет, Вы ошиблись дверью");}