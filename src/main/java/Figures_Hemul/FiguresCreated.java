package Figures_Hemul;

public class FiguresCreated {

    public static void main(String[] Args) {

        System.out.println();
        Circle circleA = new Circle(10,20,5);
        System.out.println(circleA.toString());
        circleA.square();
        circleA.move(5,-5);
        System.out.println(circleA.toString());

        System.out.println();
        Rectangle rectangleA = new Rectangle(-10,40,5, 13);
        System.out.println(rectangleA.toString());
        rectangleA.square();
        rectangleA.move(2,-1);
        System.out.println(rectangleA.toString());

        System.out.println();
        Quadrate quadrateA = new Quadrate(0,-1,5);
        System.out.println(quadrateA.toString());
        quadrateA.square();
        quadrateA.move(5,-5);
        System.out.println(quadrateA.toString());

        System.out.println();
        Cube cubeA = new Cube(100,101,5,16);
        System.out.println(cubeA.toString());
        cubeA.square();
        cubeA.move(5,-5);
        cubeA.moveZ(44);
        System.out.println(cubeA.toString());

    }
}
