package Venor_08_2023;

//        Используя генератор псевдослучайных чисел (long rand = Math.round(Math.random() * макс_число)),
//        который генерирует целые числа от 0 до макс_число, написать генератор супергеройских имен.
//        Для этого сгенерировать два числа, и, пользуюсь таблицей, вывести получившееся имя с эпитетом. Примерная таблица:
//        Эпитет:
//        0 - РАДИОАКТИВНЫЙ, 1 - ГРЕЧНЕВЫЙ, 2 - ДЕМОНИЧЕСКИЙ,  3 - прозрачный, 4 - ОЗОРНОЙ 5 - ПРИЗРАЧНЫЙ 6 - КОСМИЧЕСКИЙ 7 - ЗВЕЗДНЫЙ 8 - токийский 9 - НЕПОБЕДИМЫЙ
//        10 - славный
//        Имя:
//        0 - КАПИТАН, 1 - ЭЛЬФ, 2 - ПИНГВИН, 3 - ИНДЕЕЦ, 4 - ГНОМ, 5 - ГУЛЬ, 6 - БОРОДАЧ, 7 - БОБЕР, 8 - КОРОЛЬ, 9 - БОКСЕР, 10 - КИЛЛЕР
public class Switch2 {
    public static void main(String[] args){
        int rand1 = (int) Math.round(Math.random() * 11);
        int rand2 = (int)Math.round(Math.random() * 11);
        switch (rand1) {
            case 0:
                System.out.print("КИТАЙСКИЙ ");
                break;
            case 1:
                System.out.print("РАДИОАКТИВНЫЙ ");
                break;
            case 2:
                System.out.print("ГРЕЧНЕВЫЙ ");
                break;
            case 3:
                System.out.print("ДЕМОНИЧЕСКИЙ ");
                break;
            case 4:
                System.out.print("ПРОЗРАЧНЫЙ ");
                break;
            case 5:
                System.out.print("ОЗОРНОЙ ");
                break;
            case 6:
                System.out.print("ПРИЗРАЧНЫЙ ");
                break;
            case 7:
                System.out.print("КОСМИЧЕСКИЙ ");
                break;
            case 8:
                System.out.print("ЗВЕЗДНЫЙ ");
                break;
            case 9:
                System.out.print("ТОКИЙСКИЙ ");
                break;
            case 10:
                System.out.print("НЕПОБЕДИМЫЙ ");
                break;
            case 11:
                System.out.print("СЛАВНЫЙ ");
                break; }

        switch (rand2) {
            case 0:
                System.out.print("БЕРСЕРК ");
                break;
            case 1:
                System.out.print("КАПИТАН");
                break;
            case 2:
                System.out.print("ЭЛЬФ");
                break;
            case 3:
                System.out.print("ПИНГВИН");
                break;
            case 4:
                System.out.print("ИНДЕЕЦ");
                break;
            case 5:
                System.out.print("ГНОМ");
                break;
            case 6:
                System.out.print("УПЫРЬ");
                break;
            case 7:
                System.out.print("БОРОДАЧ");
                break;
            case 8:
                System.out.print("БОБЕР");
                break;
            case 9:
                System.out.print("КОРОЛЬ");
                break;
            case 10:
                System.out.print("БОКСЕР");
                break;
            case 11:
                System.out.print("КИЛЛЕР");
                break;
        }
    }
}


