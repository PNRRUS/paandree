package Figures;

public class FiguresMain {
    public static void main(String[] args) {
    /*создать иерархию классов геометрических фигур - прямоугольник, окружность, квадрат, куб(задача со звездочкой).
    каждая фигура имеет координаты x и y описывающие точку от которых строится фигура например, левый нижний угол для
    прямоугольника
    центр окружности для окружности, в каждой фигуре присутствует метод move(изменение координат на дельта х и дельта у.
    Второй метод определение площади фигуры ).
     */
        System.out.println("КРУГ");
        Circle krugoc = new Circle();
        krugoc.y = 456;
        krugoc.x = 88954;
        krugoc.r = 56;
        System.out.println(krugoc.toString());
        System.out.print("Площадь круга = ");
        krugoc.S();
        System.out.print("Координаты изменились: ");
        krugoc.dx = 899;
        krugoc.dy = 5;
        krugoc.move();
        System.out.println(krugoc.toString() + "\n");

        System.out.println("КУБ");
        Cub cubic = new Cub();
        cubic.y = 898718;
        cubic.x = 1;
        cubic.dlinaRedra = 12;
        System.out.println(cubic.toString());
        System.out.print("Площадь куба = ");
        cubic.S();
        System.out.print("Координаты изменились: ");
        cubic.dx = 85;
        cubic.dy = 6;
        cubic.move();
        System.out.println(cubic.toString() + "\n");

        System.out.println("ПРЯМОУГОЛЬНИК");
        Rectangle primougolinic = new Rectangle();
        primougolinic.y = 100;
        primougolinic.x = 100;
        primougolinic.shirina = 4;
        primougolinic.dlina = 8221;
        System.out.println(primougolinic.toString());
        System.out.print("Площадь прямоугольника = ");
        primougolinic.S();
        System.out.print("Координаты изменились: ");
        primougolinic.dx = 89;
        primougolinic.dy = 4562;
        primougolinic.move();
        System.out.println(primougolinic.toString() + "\n");

        System.out.println("КВАДРАТ");
        Square kvadratic = new Square();
        kvadratic.y = 1020;
        kvadratic.x = 100;
        kvadratic.str = 89;
        System.out.println(kvadratic.toString());
        System.out.print("Площадь квадрата = ");
        kvadratic.S();
        System.out.print("Координаты изменились: ");
        kvadratic.dx = 8596;
        kvadratic.dy = 1;
        kvadratic.move();
        System.out.println(kvadratic.toString());
    }
}