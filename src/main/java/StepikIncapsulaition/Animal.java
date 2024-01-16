package StepikIncapsulaition;
//type - тип животного (String)
//        name - имя животного (String)
//        age - возраст животного (int)
//        weight - вес животного (double)
//        isFly - ответ на вопрос, умеет ли это животное летать? (boolean)
//        isWalk - ответ на вопрос, умеет ли это животное ходить? (boolean)
//        isSwim -  ответ на вопрос, умеет ли это животное плавать? (boolean)
//        У животного должны быть методы:
//
//        display  - выводит информацию о животном в формате: "Тип: <Тип животного>, Имя: <Имя животного>,
//        Возраст: <Возраст животного>, Вес: <Вес животного>, Умеет летать: <Да/Нет>, Умеет ходить: <Да/Нет>,
//        Умеет плавать: <Да/Нет>."
//        rename(String) - принимает новое имя животного
//        holiday(int) - принимает на вход число праздничных дней. Увеличивает массу животного на 0.1 за каждый праздничный день.

public class Animal {
    static int counter = 0;
    static final String description = "класс основной(прародитель) описывает животных (например: рыб, птиц, насекомых с " +
            " помощью наследников)";
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;

    {
    setName("No name");
    setType("No type");
    }

    public Animal(){
        counter++;
    }
    public Animal(String type, String name) {
        this.type = type;
        this.name = name;
        counter++;
    }

    public Animal(String type, int age) {
        this.type = type;
        this.age = age;
        this.name = "No Name";
        counter++;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.isFly = isFly;
        this.isWalk = isWalk;
        this.isSwim = isSwim;
        counter++;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isFly() {
        return isFly;
    }

    public boolean isWalk() {
        return isWalk;
    }

    public boolean isSwim() {
        return isSwim;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFly(boolean fly) {
        isFly = fly;
    }

    public void setWalk(boolean walk) {
        isWalk = walk;
    }

    public void setSwim(boolean swim) {
        isSwim = swim;
    }

    public void display() {
        System.out.println( "Тип: " + type + "\n" +
                "Имя: " + name + "\n" +
                "Возраст: " + age + "\n" +
                "Вес: " + weight + "\n" +
                "Умеет летать: " + isFly + "\n" +
                "Умеет ходить: " + isWalk + "\n" +
                "Умеет плавать: " + isSwim);
    }
    public  void rename(String newName) {
        name = newName;
    }
    public void holiday(int holidayQty) {
        weight += 0.1 * holidayQty;
    }
    public void holiday() {
        weight += 0.1;
    }
    public void holiday(double mass) {
        weight += mass;
    }
    public void holiday(double mass,int qty) {
        weight += mass * qty;
    }


}
