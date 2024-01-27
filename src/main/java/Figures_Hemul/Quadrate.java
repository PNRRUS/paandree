package Figures_Hemul;

public class Quadrate extends Figure{

    int edge;

    public Quadrate(int x, int y, int edge) {
        super(x, y);
        this.edge = edge;
    }


    @Override
    public void square() {
        System.out.println("Square: " + edge * edge);
    }

    @Override
    public void move(int dx, int dy) {
    x += dx;
    y += dy;
    System.out.println("Quadrate moved: " + "dx=" + dx + " dy=" +dy);
    }

    @Override
    public String toString() {
        return "Quadrate{" +
                "edge=" + edge +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
