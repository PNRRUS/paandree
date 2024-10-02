package Bildings;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

public class Museum extends Bilding implements SocialHouse{
    private String whatStudy;
    private int numberOfStudents;
    private int numberOfPersonInGroup;
    private int numberOfStudyYears;
    private boolean  fieldIsThereADormNearby;
    private int numbersOfUniversity;

    @Override
    public void display() {
        System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + whatStudy + " " + numberOfStudents);
    }

    @Override
    public String isThereADormNearby() {
        String g = "Есть ли общежитие поблизости: " + fieldIsThereADormNearby;
        System.out.println(g);
        return g;
    }

    @Override
    public String howManyUniversities() {
        String g2 = "В этом городе есть " + numbersOfUniversity + " университет(-ов)";
        System.out.println(g2);
        return g2;
    }
}
