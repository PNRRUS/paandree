package StepikIncapsulaition;

public class Stepik2_5_8 {

  public static void main(String[] args) {
    WritingMaterials pen = new WritingMaterials();
    pen.setName("ручка");
    pen.setColor("Красный");
    pen.setLength(11.6);
    pen.setPrice(167);
    pen.setDraw(true);
    pen.draw();
    pen.draw("Синий");
    pen.draw("Зелёный", 15);
    pen.draw(4);

    WritingMaterials ruler = new WritingMaterials("линека", "голубой");
    ruler.setDraw(false);
    ruler.draw();
    ruler.draw("Синий");
    ruler.draw("Зелёный", 15);
    ruler.draw(4);

  }


  }

