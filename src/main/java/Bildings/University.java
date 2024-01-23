package Bildings;

public class University extends Bilding implements SocialHouse{
   private String whatStudy;
   private int numberOfStudents;
   private int numberOfPersonInGroup;
   private int numberOfStudyYears;
   private boolean  fieldIsThereADormNearby;
   private int numbersOfUniversity;

    public boolean isFieldIsThereADormNearby() {
        return fieldIsThereADormNearby;
    }

    public int getNumbersOfUniversity() {
        return numbersOfUniversity;
    }

    public String getWhatStudy() {
        return whatStudy;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public int getNumberOfPersonInGroup() {
        return numberOfPersonInGroup;
    }

    public int getNumberOfStudyYears() {
        return numberOfStudyYears;
    }

    public void setWhatStudy(String whatStudy) {
        this.whatStudy = whatStudy;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void setNumberOfPersonInGroup(int numberOfPersonInGroup) {
        this.numberOfPersonInGroup = numberOfPersonInGroup;
    }

    public void setNumberOfStudyYears(int numberOfStudyYears) {
        this.numberOfStudyYears = numberOfStudyYears;
    }

    public void setFieldIsThereADormNearby(boolean fieldIsThereADormNearby) {
        this.fieldIsThereADormNearby = fieldIsThereADormNearby;
    }

    public void setNumbersOfUniversity(int numbersOfUniversaty) {
        this.numbersOfUniversity = numbersOfUniversaty;
    }

    @Override
    public void display() {
        System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + whatStudy + " " + numberOfStudents);
    }

    @Override
    public String toString() {
        return "University{" +
                "whatStudy='" + whatStudy + '\'' +
                ", numberOfStudents=" + numberOfStudents +
                ", numberOfPersonInGroup=" + numberOfPersonInGroup +
                ", numberOfStudyYears=" + numberOfStudyYears +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", architectorName='" + architectorName + '\'' +
                ", culturePlace=" + culturePlace +
                ", yearOfBuild=" + yearOfBuild +
                '}';
    }

    public void groupCourse(){
        System.out.println("Групп  на каждом курсе: " + numberOfPersonInGroup / numberOfStudyYears  + "\n"
                + "Количество учеников на курсе: "  + numberOfStudents / numberOfStudyYears );
    }

    @Override
    public void isThereADormNearby() {
System.out.println("Есть ли общежитие поблизости: " + fieldIsThereADormNearby);
    }

    @Override
    public void howManyUniversities() {
        System.out.println("В этом городе есть " + numbersOfUniversity + " университет(-ов)");
    }
}
