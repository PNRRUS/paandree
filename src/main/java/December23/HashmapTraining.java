package December23;
import java.util.HashMap;

class HashmapTraining {
    public static void main(String[] args) {

        HashMap<String, String> human = new HashMap<String, String>();

        human.put("secondName", "Kowalew");
        human.put("name", "Wlad");
        human.put("age", "25");
        human.put("proffesion", "teacher");
        human.put("ворота", "teacher");
        human.put("ворота","забор");

        System.out.println("-----------------------------");
        System.out.println("Size: " + human.size());
        System.out.println(human.isEmpty() ? "empty" : "not empty");
        System.out.println(human.getOrDefault("age", "None"));
        System.out.println(human.getOrDefault("Rge", "None"));
        System.out.println("-----------------------------");

        for (String key: human.keySet()){
            System.out.println(key + " = " + human.get(key));
        }
        human.remove("name");
        System.out.println("-----------------------------");
        for (String key: human.keySet()){
            System.out.println(key + ": " + human.get(key));
        }
        System.out.println(human);

        System.out.println(human.get("proffesion"));
        System.out.println(human.keySet());

    }
}