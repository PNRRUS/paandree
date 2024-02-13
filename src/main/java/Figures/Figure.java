package Figures;

public abstract class Figure {
    public int x;
    public int y;
    public int dx;
    public int dy;
public abstract void move();

//
//public abstract void move(Circle circle, Graphics drawOval);

public abstract void S();


    public Figure() {
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
