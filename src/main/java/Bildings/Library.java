package Bildings;

public class Library extends Bilding{
int numberOfBooks;
boolean isWarAndPeace;
int numberOfbooksAWeek;
    @Override
    public void display() {
       System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + numberOfBooks + isWarAndPeace);
    }
    public void weeksToEnd(){
        System.out.println("количество книг: " + numberOfBooks + "\n" +
                "сколько книг забирают в неделю: " + numberOfbooksAWeek + "\n" +
                "Сколько недель библиотека проживет: " +  numberOfBooks / numberOfbooksAWeek);
    }

    @Override
    public String toString() {
        return "Library {" +
                "numberOfBooks = " + numberOfBooks +
                ", isWarAndPeace = " + isWarAndPeace +
                ", numberOfbooksAWeek = " + numberOfbooksAWeek +
                '}';
    }
}

