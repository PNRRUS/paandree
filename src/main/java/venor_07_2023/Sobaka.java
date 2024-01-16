package venor_07_2023;

public class Sobaka {

    double ves; // вес собаки
    private int nastroenie; // настроение собаки

    public int getNastroenie() {
        return nastroenie;
    }

    public void setNastroenie(int nastroenie) {
        this.nastroenie = nastroenie;
    }

    // создание собаки по конкретным данным - конструктор
    public Sobaka(double ves, int nastroenie) {
        this.ves = ves;
        this.nastroenie = nastroenie;
    }

    public Sobaka(double ves) {
        this.ves = ves;
    }

    public Sobaka() {
    }

    public Sobaka(int nastroenie) {
        this.nastroenie = nastroenie;
    }

    // покормить собаку - вес собаки увеличится на а кг
    public void pokormit(double kg) {
        ves = ves + kg;
    }

    // погладить собаку - настроение собаки увеличится на b пунктов
    public void pogladit(int ras) {

        nastroenie = nastroenie + ras;
    }

    // помыть собаку - настроение собаки уменьшится на раз пунктов
    public void pomit(int ras) {

        nastroenie = nastroenie - ras;
    }
}
