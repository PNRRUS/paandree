package Figures_Hemul;

public abstract class Figure {

    int x;
    int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void square();

    public abstract void move(int dx, int dy);

}
