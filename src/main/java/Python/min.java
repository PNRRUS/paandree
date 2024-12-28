package Python;
import java.util.Scanner;
//Вывести минмальнео число из трех заданных значений
public class min {
    public static void main(String[] Args)  {
    Scanner name = new Scanner(System.in);
    int number1 = name.nextInt();
    int number2 = name.nextInt();
    int number3 = name.nextInt();
    int minValue = number1;
    if(minValue > number2 ){
        minValue = number2;
    }
    if(minValue > number3){
        minValue = number3;
    }
System.out.print("Минимальное число равняется: " + minValue);
    }
}
