package Python;

public class Mixer_1 {
    public static void main(String[] Args){

    }
    public static String mixer_color (String a,String b){
        if((a.equals("красный")  && b.equals("синий")) || (b.equals("красный") && a.equals("синий"))){
            return "фиолетовый";
        }

        if((a.equals("красный") && b.equals("желтый")) || (b.equals("красный") && a.equals("желтый"))){
            return "оранжевый";
        }

        if((a.equals("синий") && b.equals("желтый")) || (b.equals("синий") && a.equals("желтый"))){
            return "зеленый";
        }

        if(a == b && (b == "желтый" || b == "красный" || b == "синий")){
            return b;
        }
        else{
            return "ошибка цвета";
        }
    }
}
