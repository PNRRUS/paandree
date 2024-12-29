package Python;

public class Calculator {
    public static void main(String[] Args) {

    }
    public static int addition(int a, int b){
        return a + b;
    }
    public static int subtraction(int a, int b){
        return a - b;
    }
    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int division(int a, int b){
        return a / b;
    }
    public static int squaring(int a){
        return a * a;
    }
    public static double exponentiation(double a, double b){
        return Math.pow(a,b);

    }
     public static double square_root(double a){
               return Math.sqrt(a);
     }
     public static double min_number(int a,int b,int c){
        int min = a;
        if(b < min) {
            min = b;
        }
        if(c < min) {
            min = c;
        }
       return min;
     }

     public static double max_number(int a,int b,int c){
         int max = a;
         if(b > max) {
             max = b;
         }
         if(c > max) {
             max = c;
         }
         return max;
     }
}