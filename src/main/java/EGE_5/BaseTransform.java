package EGE_5;

public class BaseTransform {

public static String transformToAnotherBase(int N, int base) {
        String s="";
        while (N>0) {
            s = N % base + s;
            N = N / base;
        }
        return s;
}

}
