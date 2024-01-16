package Guli_10_23;
import java.util.Scanner;
public class stepic {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int width = input.nextInt();
            int counter = 0;
            for (int i = 1;i < width + 1;i++) {
                if(i % 3 == 0 && i % 2 == 0){
                    System.out.print(i + " ");
                    counter++;
                }
            }
            if (counter == 0) {
                System.out.print("Таких чисел нет");
            }
        }
    }

