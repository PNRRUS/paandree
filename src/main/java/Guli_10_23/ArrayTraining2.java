package Guli_10_23;
import java.util.Scanner;
/*На вход подаётся натуральное число n > 0, на следующей строке - последовательность целых чисел,
а затем - индекс id < n. Создайте из неё массив и выведите на печать значение элемента массива c индексом id.

Sample Input:
5
1 2 3 4 5
1
Sample Output:
2
*/
public class ArrayTraining2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int width = input.nextInt();
        int[] arr = new int[width];
        for (int counter = 0; counter < width; counter++){
            arr[counter] = input.nextInt();
        }
        int numberId = input.nextInt();
        System.out.println(arr[numberId]);
    }
}
