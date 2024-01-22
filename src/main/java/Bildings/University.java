package Bildings;

public class University extends Bilding{
   private String whatStudy;
   private int numberOfStudents;
   private int numberOfPersonInGroup;
   private int numberOfStudyYears;

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
        System.out.println("Груп на каждом курсе: " + numberOfPersonInGroup / numberOfStudyYears  + "\n"
                + "Количество учеников на курсе: "  + numberOfStudents / numberOfStudyYears );
    }
}
