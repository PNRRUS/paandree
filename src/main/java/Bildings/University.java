package Bildings;

public class University extends Bilding{
    String whatStudy;
    int numberOfStudents;

    @Override
    public void display() {
        System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + whatStudy + " " + numberOfStudents);
    }
}
