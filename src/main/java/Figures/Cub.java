package Figures;

public class Cub extends Figure {
int dlinaRedra;

    public Cub(int x, int y) {
        super(x, y);
    }

    public Cub() {
    }

    @Override
    public void move() {
        x = x + dx;
        y = y + dy;
    }

    @Override
    public void S() {
System.out.println(dlinaRedra * 2 * 6);
    }

    @Override
    public String toString() {
        return "cubic {" +
                "dlinaRedra=" + dlinaRedra +
                ", x=" + x +
                ", y=" + y +
                ", dx=" + dx +
                ", dy=" + dy +
                '}';
    }
}
