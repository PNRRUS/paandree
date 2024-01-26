package Figures_Hemul;

public class Cube extends Quadrate{

    int z;

        public Cube(int x, int y, int edge, int z) {
        super(x, y, edge);
        this.z = z;
    }


    @Override
    public void square() {
        System.out.println("Volume: " + edge * edge * edge);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
        System.out.println("Cube moved: " + "dx=" + dx + " dy=" +dy);

    }

    public void moveZ (int dz) {
        z += dz;
        System.out.println("Cube moved: " + "dz=" + dz);
          }

    @Override
    public String toString() {
        return "Cube{" +
                "z=" + z +
                ", edge=" + edge +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
