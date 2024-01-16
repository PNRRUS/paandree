package Roma_11_23;
import java.util.ArrayList;
import java.util.Scanner;
public class Stepic1_18_9 {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            ArrayList<String> number = new ArrayList<>();
            int counter = sc.nextInt();
            String counter2=sc.nextLine();

            for (int i = 1;i <= counter;i++){
                System.out.println(i);
                counter2 = sc.nextLine();


                if (counter2.equals("pop")){
                  System.out.println("воспроизводится " + number.get(0));
                 number.remove(0);
                 }
                else {
                number.add(counter2);
                }
            }


            for(String j: number){
                System.out.print(j + " ");
            }

        }
    }



