package Guli_10_23;
import java.util.ArrayList;
public class ArrList {

           public static void main(String[] args) {

            ArrayList<String> people = new ArrayList<String>();
            // добавим в список ряд элементов
            people.add("Tom");
            people.add("Alice");
            people.add("Kate");
            people.add("Sam");
            people.add("Roma");
            people.add("Peter");

            //people.add(1, "Bob"); // добавляем элемент по индексу 1

            //System.out.println(people.get(1));// получаем 2-й объект
            //people.set(1, "Robert"); // установка нового значения для 2-го объекта

//            System.out.printf("ArrayList has %d elements \n", people.size());
//            for(String person : people){
//
//                System.out.println(person);
//            }
//            // проверяем наличие элемента
//            if(people.contains("Tom")){
//
//                System.out.println("ArrayList contains Tom");
//            }

            // удалим несколько объектов
            // удаление конкретного элемента
            //people.remove("Robert");
            // удаление по индексу
            //people.remove(3);
            people.add(3, "Bob"); // добавляем элемент по индексу 3

               people.add("Pavel");

//            Object[] peopleArray = people.toArray();
//            for(Object person : peopleArray){
//
//                System.out.println(person);
//            }
               System.out.println(people.size());
               people.add("Kaneki");
               System.out.println(people.size());


               //Object[] peopleArray2 = people.toArray();
               for(String person : people){
                   System.out.println(person);
               }

               String[] beatles = {"John", "Paul", "Ringo", "George"};

               for (String person: beatles) {
                   System.out.println(person);
               }
int counter = 0;
               int[] arr = {5, 5, 8, 4, 7, 4, 5};
               for (int garonimo: arr) {
                   System.out.println(garonimo);
                    counter += garonimo;

               }
               System.out.println(counter);
             System.out.println((double)Math.round((double)counter/arr.length * 100)/100);



        }
    }

