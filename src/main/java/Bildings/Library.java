package Bildings;

public class Library extends Bilding implements LivingHouse{
int numberOfBooks;
boolean isWarAndPeace;
int numberOfbooksAWeek;
int numberOfFamilyMembers;
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

    @Override
    public void pumPUpPump() {
        System.out.println("Я подкачал насос в библиотеке");
    }

    @Override
    public void numberOfPersons() {
        System.out.println("Семейных людей посещающих библиотеку: " + numberOfFamilyMembers);
    }
}

