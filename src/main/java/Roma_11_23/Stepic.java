package Roma_11_23;

import java.util.Scanner;

public class Stepic {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String scan = sc.nextLine();
for(int i = 0;i < scan.length() - 1;i++) {

    if (scan.charAt(i) == ' ') {
       System.out.println(i);
    }
}
if(scan.contains("занимал")){
    System.out.println(" он занимал");
}
            System.out.println(scan.charAt(0));
            System.out.println(scan.charAt(scan.length() - 1));
        }}


