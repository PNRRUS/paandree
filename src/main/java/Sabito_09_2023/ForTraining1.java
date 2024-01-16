package Sabito_09_2023;

public class ForTraining1 {
    public static void main(String[] Args) {
        for (int i = 20; i >= 1; i--) {
            if (i < 10) {
                System.out.print(0);
            System.out.print(i + ". ");
            } else {System.out.print(i + ". ");}
            for (int j = 1; j <= 50; j++) {
                System.out.print( (int) Math.round(Math.random() * 89) + 10 + " ");
            }
            System.out.println();
        }

    }
}
