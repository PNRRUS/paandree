package StepikIncapsulaition;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pen extends WritingMaterials {
    int countColor;
    boolean auto;

    {
        setDraw(true);
    }
//    public int getCountColor() {
//        return countColor;
//    }

//    public boolean isAuto() {
//        return auto;
//    }

//    public void setCountColor(int countColor) {
//        this.countColor = countColor;
//    }
//
//    public void setAuto(boolean auto) {
//        this.auto = auto;
//    }

    public void writeMyName() {
        System.out.println("Байдон ЧМО - фраза Харламова");
    }
    public void display() {
        System.out.println("\n" + "This is Pen");
        super.display();
        System.out.println("Количество цветов этой ручки: " + countColor + "\n"
                + "Это ручка автоматическая: " + auto);
    }
}
