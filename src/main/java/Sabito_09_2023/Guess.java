package Sabito_09_2023;

import javax.swing.*;

//компьютер генерит целое случайное число от нуля до ста цель игры угадать числ за минимальное количество попыток
//игрок вводит  число с клавиатуры компьютер выводит на экран либо больше либо меньше далее игрок повторяет попытку до
// тех пор, пока не угадает число после выводит вы выйграли и количество попыток
public class Guess {
    public static void main(String[] args) throws InterruptedException {
//       int counter = 1;
//       int guessNumber = (int) Math.round((Math.random() * 100));
//        System.out.println("Компьютер: я загадал вам число от 0 до 100, попробуйте отгадать!");
//        Thread.sleep(2042);
//        System.out.println("Это довольно трудно:)" + "\n" + "игрок: ");
//        Scanner input = new Scanner(System.in);
//        int  number = input.nextInt();
//        do {
//            if (number < guessNumber) {
//                System.out.println("больше");
//            } else {System.out.println("меньше");}
//            counter++;
//            number = input.nextInt();
//        } while (number != guessNumber);
//        Thread.sleep(1205);
//        System.out.println("Использовано попыток: " + counter);
//        Thread.sleep(1400);
//        System.out.println("компьютер: " + "хнык, хнык");
//
//        System.out.println("если хотите извинится перед компьютером, напишите 8" + "\n" + "если нет, то напишите 7");
//        int  xm = input.nextInt();
//        Thread.sleep(1400);
//        if (xm == 8) {
//            System.out.println("компьютер: спасибо" + "\n" + " :) ");
//        } else {System.out.println("компьютер уходит.......");
Icon imageIcon = new ImageIcon("D:/Downloads/S64s.gif");
            JLabel label = new JLabel(imageIcon);
            JFrame frame = new JFrame("pepe");
            frame.getContentPane().add(label);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
            frame.setAlwaysOnTop(true);

        }
//        input.close();
        }
//    }