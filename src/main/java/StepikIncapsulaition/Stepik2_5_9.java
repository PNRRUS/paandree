package StepikIncapsulaition;

public class Stepik2_5_9 {

  public static void main(String[] args) {
    WritingMaterials wm = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
    wm.display();

    Pen p = new Pen();
    p.setName("Паркер");
    p.display();
    p.setCountColor(2);
    p.setAuto(false);
    System.out.println(p.getCountColor());
    System.out.println(p.isAuto());
    p.writeMyName();

    Ruler r = new Ruler();
    r.setName("Линейка");
    r.display();
    r.setLengthRuler(25);
    r.setWood(true);
    System.out.println(r.getLengthRuler());
    System.out.println(r.isWood());
    r.measure();

    Divider d = new Divider();
    d.setName("Циркуль");
    d.display();
    d.setDividerType("С карандашом");
    d.setMetal(true);
    System.out.println(d.getDividerType());
    System.out.println(d.isMetal());
    d.draw_circle();
    System.out.println("Количество объектов, созданных в классе: " + WritingMaterials.counter + "\n" + "описание класса WritingMaterials: "
            + WritingMaterials.description);
  }



  }

