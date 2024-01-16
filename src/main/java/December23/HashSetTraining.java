package December23;

import java.util.LinkedHashSet;

public class HashSetTraining {
        public static void main(String[] args) {

            LinkedHashSet<String> states = new LinkedHashSet<>();

            // добавим в список ряд элементов
            states.add("Germany");
            states.add("France");
            states.add("Italy");
            states.add("Russia");
            states.add("Japan");
            states.add("England");
            // пытаемся добавить элемент, который уже есть в коллекции
            boolean isAdded = states.add("Germany");
            System.out.println(isAdded);    // false

            System.out.printf("Set contains %d elements \n", states.size());    // 3

            for(String state : states){

                System.out.println(state);
            }
            // удаление элемента
            states.remove("Germany");
            System.out.println(states);
            System.out.println(states.hashCode());
            System.out.println(states.iterator());
        }
    }


