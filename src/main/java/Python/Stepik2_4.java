package Python;
//a1 = int(input())
//        d = int(input())
//        n = int(input())
//        print(a1 + d * (n - 1))
import java.util.Scanner;
public class Stepik2_4 {
    public static void main(String[] Args){
        Scanner test = new Scanner(System.in);
        int a1 = test.nextInt();
        int d = test.nextInt();
        int n = test.nextInt();
        System.out.println(a1 + d * (n - 1));
        test.close();
    }
}
