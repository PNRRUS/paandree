package Bildings;

public class Stepik2_7_4 {
    public static void main(String[] args) {
        System.out.println("БИБЛИОТЕКА" + "\n");
        Library pushinskaya = new Library();
        pushinskaya.isWarAndPeace = true;
        pushinskaya.numberOfBooks = 900;
        pushinskaya.numberOfbooksAWeek = 20;
        pushinskaya.numberOfFamilyMembers = 15;
        pushinskaya.weeksToEnd();
        System.out.println(pushinskaya.toString());
        pushinskaya.pumPUpPump();
        pushinskaya.numberOfPersons();
        System.out.println("\n");

        System.out.println("УНИВЕРСИТЕТ" + "\n");
        University lomonosova =     new University();
        lomonosova.setFieldIsThereADormNearby(true);
        lomonosova.setNumbersOfUniversity(2);
        lomonosova.setWhatStudy("Higher mathematics");
        lomonosova.setNumberOfStudents(2000);
        lomonosova.setNumberOfPersonInGroup(20);
        lomonosova.setNumberOfStudyYears(5);
        lomonosova.groupCourse();
        lomonosova.howManyUniversities();
        lomonosova.isThereADormNearby();
        System.out.println(lomonosova.toString());
System.out.println(lomonosova.getNumberOfStudents());

University itmo = new University("programming",  2000,
        15, 6, true,2);
        System.out.println(itmo.toString());


    }
}
