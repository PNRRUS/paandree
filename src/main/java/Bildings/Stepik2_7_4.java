package Bildings;

public class Stepik2_7_4 {
    public static void main(String[] args) {
        Library pushinskaya = new Library();
        pushinskaya.isWarAndPeace = true;
        pushinskaya.numberOfBooks = 900;
        pushinskaya.numberOfbooksAWeek = 20;
        pushinskaya.weeksToEnd();
        System.out.println(pushinskaya.toString());
        pushinskaya.display();

        University lomonosova = new University();
        lomonosova.setWhatStudy("Higher mathematics");
        lomonosova.setNumberOfStudents(2000);
        lomonosova.setNumberOfPersonInGroup(20);
        lomonosova.setNumberOfStudyYears(5);
        lomonosova.groupCourse();
        System.out.println(lomonosova.toString());
        lomonosova.display();
System.out.println(lomonosova.getNumberOfStudents());

    }
}
