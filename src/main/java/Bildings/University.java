package Bildings;

import lombok.*;

@Getter @Setter
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@ToString(includeFieldNames=true)

public class University extends Bilding implements SocialHouse{
   private String whatStudy;
   private int numberOfStudents;
   private int numberOfPersonInGroup;
   private int numberOfStudyYears;
   private boolean  fieldIsThereADormNearby;
   private int numbersOfUniversity;

//    public University(String whatStudy, int numberOfStudents, int numberOfPersonInGroup, int numberOfStudyYears, boolean fieldIsThereADormNearby, int numbersOfUniversity) {
//        this.whatStudy = whatStudy;
//        this.numberOfStudents = numberOfStudents;
//        this.numberOfPersonInGroup = numberOfPersonInGroup;
//        this.numberOfStudyYears = numberOfStudyYears;
//        this.fieldIsThereADormNearby = fieldIsThereADormNearby;
//        this.numbersOfUniversity = numbersOfUniversity;
//    }
//
//    public University() {
//    }

    //    public boolean isFieldIsThereADormNearby() {
//        return fieldIsThereADormNearby;
//    }
//
//    public int getNumbersOfUniversity() {
//        return numbersOfUniversity;
//    }
//
//    public String getWhatStudy() {
//        return whatStudy;
//    }

//    @Getter @Setter private int NumberOfStudents;

//    public int getNumberOfStudents() {
//        return numberOfStudents;
//    }

//    public int getNumberOfPersonInGroup() {
//        return numberOfPersonInGroup;
//    }
//
//    public int getNumberOfStudyYears() {
//        return numberOfStudyYears;
//    }
//
//    public void setWhatStudy(String whatStudy) {
//        this.whatStudy = whatStudy;
//    }

//    public void setNumberOfStudents(int numberOfStudents) {
//        this.numberOfStudents = numberOfStudents;
//    }
//
//    public void setNumberOfPersonInGroup(int numberOfPersonInGroup) {
//        this.numberOfPersonInGroup = numberOfPersonInGroup;
//    }
//
//    public void setNumberOfStudyYears(int numberOfStudyYears) {
//        this.numberOfStudyYears = numberOfStudyYears;
//    }
//
//    public void setFieldIsThereADormNearby(boolean fieldIsThereADormNearby) {
//        this.fieldIsThereADormNearby = fieldIsThereADormNearby;
//    }
//
//    public void setNumbersOfUniversity(int numbersOfUniversaty) {
//        this.numbersOfUniversity = numbersOfUniversaty;
//    }

    @Override
    public void display() {
        System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + whatStudy + " " + numberOfStudents);
    }

//    @Override
//    public String toString() {
//        return "University{" +
//                "whatStudy='" + whatStudy + '\'' +
//                ", numberOfPersonInGroup=" + numberOfPersonInGroup +
//                ", numberOfStudents=" + numberOfStudents +
//                ", numberOfStudyYears=" + numberOfStudyYears +
//                ", fieldIsThereADormNearby=" + fieldIsThereADormNearby +
//                ", numbersOfUniversity=" + numbersOfUniversity +
//                ", adress='" + adress + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
    //    @Override
//    public String toString() {
//        return "University{" +
//                "whatStudy ='" + whatStudy + '\'' +
//                ", numberOfStudents =" + numberOfStudents +
//                ", numberOfPersonInGroup =" + numberOfPersonInGroup +
//                ", numberOfStudyYears =" + numberOfStudyYears +
//                ", name ='" + name + '\'' +
//                ", adress ='" + adress + '\'' +
//                ", architectorName ='" + architectorName + '\'' +
//                ", culturePlace =" + culturePlace +
//                ", yearOfBuild=" + yearOfBuild +
//                '}';
//    }

    public String groupCourse(){
        String g = "Групп  на каждом курсе: " + numberOfPersonInGroup / numberOfStudyYears  + "\n"
                + " Количество учеников на курсе: "  + numberOfStudents / numberOfStudyYears;
        System.out.println(g);
       return g;
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
