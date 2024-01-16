package Roma_11_23;

public class JavaSpiski {
    public static void main(String[] args) {
        double[] arr = {-8.336,5.569,9.463,6.269};
double minNumber = arr[0];
        for (double number : arr){
            System.out.print(number + " ");
            if (minNumber > number){
                minNumber = number;
            }
        }
        System.out.print("\n" + minNumber + " - это минимальное число");
        System.out.print("\n" + arr.length + " - это длина массива" );
    }
}