package December23;
import java.util.HashMap;

class HashmapTraining2 {
    public static void main(String[] args) {

        HashMap<String, String> human = new HashMap<String, String>();
        human.put("125648", "Vasi Kowalew");
        human.put("456289", "Тимофей Андреев");
        human.put("458976", "Vlad Zinin");
        human.put("452896", "Шульга Анастасия");
        human.put("785462", "Коля Смирнов");
        human.put("458269", "Олег Чекризов");
        human.put("452163","Диана Блем");
        human.put("458976", "Виолетта Прохоренкова");

        System.out.println("Size: " + human.size());
        System.out.println(human.get("785462"));
        System.out.println(human.get("452896"));
        human.remove("785462");
        System.out.println(human);

        HashMap<Integer, Integer> randomNumbers = new HashMap<>();
        int number;
       for(int i = 0;i < 1000;i++){
           number =((int)Math.round(Math.random() * 8) + 1);
           if(randomNumbers.get(number) == null){
           randomNumbers.put(number,1);
       } else{
               randomNumbers.put(number,randomNumbers.get(number) + 1);
           }



       }
        System.out.println(randomNumbers);
    }
}