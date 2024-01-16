package StepikIncapsulaition;

public class Stepik2_5_5 {

  public static void main(String[] args) {
    Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
    duck.display();

    duck.holiday();
    duck.display();

    duck.holiday(5);
    duck.display();

    duck.holiday(0.4);
    duck.display();

    duck.holiday(0.3, 2);
    duck.display();
  }


  }

