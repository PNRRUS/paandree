package Bildings;

public class Library extends Bilding{
int numberOfBooks;
boolean isWarAndPeace;
    @Override
    public void display() {
       System.out.println(name + adress + architectorName + culturePlace + yearOfBuild + numberOfBooks + isWarAndPeace);
    }
}

