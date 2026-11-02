//          Ќа вход алгоритма подаетс€ натуральное число N.
//          јлгоритм строит по нему новое число R следующим образом.
//        1.—троитс€ троична€ запись числа N.
//        2.≈сли N кратно 3, то в конец записи дописываютс€ две последние троичные цифры.
//        3.≈сли N не кратно 3, то остаток от делени€ умножаетс€ на 5,
//        переводитс€ в троичную систему и затем дописываетс€ к числу
//        ѕолученна€ таким образом запись €вл€етс€ троичной записью искомого числа R.
//        ”кажите максимальное число R, не превышающее 173,
//        которое может быть получено с помощью описанного алгоритма. ¬ ответе запишите это число в дес€тичной системе счислени€.

package EGE_5;
import static EGE_5.BaseTransform.transformToAnotherBase;

public class task_1 {
    public static void main(String[] args) {
        int base = 3, Rmax = 1, r;
        String R;
        for (int N = 1; N < 100; N++) {
            R = transformToAnotherBase(N, base);
            if (N % 3 == 0) {
                R += R.substring(R.length() - 2);
            } else {
                R += transformToAnotherBase((N % 3) * 5, base);
            }
            r = Integer.parseInt(R, base);
            if (r < 173 && r > Rmax) {
                Rmax = r;
            }
        }
        System.out.println(Rmax);
    }
}
