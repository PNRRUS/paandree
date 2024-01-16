package Roma_11_23;
import java.util.ArrayList;
import java.util.Scanner;
public class Stepic1_18_10 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            ArrayList<String> number = new ArrayList<>();
            int counter = sc.nextInt();
            String counter2=sc.nextLine();
            int spaceCounter;

            for (int i = 1;i <= counter;i++) {
                counter2 = sc.nextLine();

                if (counter2.contains("занимал")) {
                    spaceCounter = 0;
                    for (int j = 0; j < counter2.length() - 1; j++) {

                        if (counter2.charAt(j) == ' ') {
                            spaceCounter = j;

                        }
                    }
                    //System.out.println(counter2.substring(spaceCounter + 1));
                    number.add(number.indexOf(counter2.substring(spaceCounter + 1)) + 1,
                            counter2.substring(0, counter2.indexOf(" ")));
                }

                if (counter2.equals("Следующий!")) {
                    number.remove(0);
                }
                if (counter2.contains("Добавить")) {
                    number.add(counter2.substring(9));
                }
                for(String j: number){
                    System.out.print(j + " ");
                }
                System.out.println();

            }
        }
}


