package StepikIncapsulaition;


public class Stepik2_5_6 {

  public static void main(String[] args) {
    Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
    duck.display();
System.out.println(duck.toString());

    Bird owl = new Bird("Сова", "Филин", 25,25.3,true,true,false,"Россия",
    false);
    owl.display();


    Bird b = new Bird();
    b.setName("Bob");
    b.display();
    b.setArea("На югах");
    b.setWinterFly(false);
    System.out.println(b.getArea());
    System.out.println(b.isWinterFly());
    b.chirick_chirick();

    Fish tuna = new Fish("Тунец","Якубович","Какая-то",true);
    tuna.display();
    Fish f = new Fish();
    f.setName("Сельдь");
    f.display();
    f.setSquama("Крупная");
    f.setUpStreamSwim(true);
    System.out.println(f.getSquama());
    System.out.println(f.isUpStreamSwim());
    f.bul_bul();

    Insect i = new Insect();
    i.setName("Жук Жукыч");
    i.display();
    i.setWingCount(4);
    i.setLikeJesus(true);
    System.out.println(i.getWingCount());
    System.out.println(i.isLikeJesus());
    i.ggggg();

    System.out.println("Количество объектов, созданных в классе: " + Animal.counter + "\n" + "описание класса Animal: "
            + Animal.description);

  }
  }

