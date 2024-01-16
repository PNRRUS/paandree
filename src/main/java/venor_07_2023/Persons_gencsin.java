package venor_07_2023;

public class Persons_gencsin {

    private int Silla; // сила персонажа
    private int HP; // хп персонажа

    public int getSilla() {
        return Silla;
    }

    public int getHP() {
        return HP;
    }

    public void setSilla(int silla) {
        Silla = silla;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    // создание персонажа по конкретным данным - конструктор
    public Persons_gencsin(int Silla, int HP) {
        this.Silla = Silla;
        this.HP = HP;
    }

    public Persons_gencsin() {
    }

    // повесить артефакт - здоровье персонажа увеличется на 1536 очков хп
    public void instrykter(int point) {
        HP += point;
    }

    // повесить артефакт - сила персонажа увеличется на 192 очков силы
    public void isymrudnai_teni(int point) {

        Silla += point;
    }

    // снять артефакт инструктер - минус 1536 очков хп
    public void id() {

        Silla = 0;
}
    }
