package December23;
import java.util.Scanner;
import java.util.HashSet;

public class Stepik1_19_6 {
    public static void main(String[] args) {

        HashSet<Integer> states = new HashSet<>();
        Scanner input = new Scanner(System.in);
        int repeatNumber = input.nextInt();
        int vvod;
        for (int i = 0; i < repeatNumber; i++) {
            vvod = input.nextInt();
            states.add(vvod);
        }
        System.out.println(states);
        System.out.println(states.size());
    }
}