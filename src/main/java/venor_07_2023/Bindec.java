package venor_07_2023;
import javax.swing.*;
import java.util.Scanner;
public class Bindec {
    public static void main(String[] args) {
//        System.out.println("введите число в двоичном виде или один байт");
//        Scanner potokVvoda = new Scanner(System.in);
//        int binChislo = potokVvoda.nextInt();
//        int decChislo = binChislo % 10 + binChislo % 100 / 10 * 2 + binChislo % 1_000 / 100 * 2 * 2 +
//               binChislo % 10_000 / 1_000 * 2 * 2 * 2 + binChislo % 100_000 / 10_000 * 2 * 2 * 2 * 2 +
//               binChislo  % 1_000_000 / 100_000 * 2 * 2 * 2 * 2 * 2 +
//                binChislo % 10_000_000 / 1_000_000 * 2 * 2 * 2 * 2 * 2 * 2 +
//                binChislo % 100_000_000 / 10_000_000 * 2 * 2 * 2 * 2 * 2 * 2 * 2;
//        System.out.println("ваше число в десятичном виде");
//        System.out.println(decChislo);
        int peremennaiTipaByte1 = 0b11111111;
        int peremennaiTipaByte2 = 0b10000001;
        int peremennaiTipaByte3 = 0b10000001;
        int peremennaiTipaByte4 = 0b10000001;
        int peremennaiTipaByte5 = 0b10000001;
        int peremennaiTipaByte6 = 0b10000001;
        int peremennaiTipaByte7 = 0b11111111;


        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte1))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte2))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte3))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte4))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte5))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte6))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte6))))) ;
        System.out.println(String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte7))))) ;

        JOptionPane.showMessageDialog(null,
                String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte1))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte2))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte3))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte4))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte5))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte6))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte6))))
                        + "\n" + String.format("%08d",(Integer.parseInt(Integer.toBinaryString(peremennaiTipaByte7))))

        );

        System.out.println(peremennaiTipaByte2);
        System.out.println(peremennaiTipaByte3);
        System.out.println(peremennaiTipaByte4);
        System.out.println(peremennaiTipaByte5);
        System.out.println(peremennaiTipaByte6);
        System.out.println(peremennaiTipaByte6);
        System.out.println(peremennaiTipaByte7);
    }
}

