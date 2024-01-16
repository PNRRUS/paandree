package StepikIncapsulaition;
//Дополните класс WritingMaterials. У класса WritingMaterials должны быть следующие конструкторы:
//        Позволяющий создать предмет с его названием и цветом.
//        Позволяющий создать предмет с его названием и ценой. При этом в цвете окажется значение "No Color".
//        Позволяющий создать предмет с его ценой, длиной и способностью рисовать. При этом в цвете окажется значение
//        "No Color", а в названии - "No Name".
//        Позволяющий создать предмет со всеми его свойствами в том же порядке, который указан на предыдущем слайде.
//        Можете проверить свой класс, запустив его с этим кодом:
public class WritingMaterials {
    static int counter = 0;
    static final String description = "класс основной(прародитель) описывает письменные принадлежности (например: ручечку, линеечку, циркуль с" +
            " помощью наследников)";
    private String name;
    private String color;
    private int price;
    private double length;
    private boolean draw;

    {
       setColor("No color");
       setName("No name");
    }
    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public boolean isDraw() {
        return draw;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDraw(boolean draw) {
        this.draw = draw;
    }

    public WritingMaterials(String name, String color, int price, double length, boolean draw) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.draw = draw;
        counter++;
    }

    public WritingMaterials(String name, String color) {
        this.name = name;
        this.color = color;
        counter++;
    }

    public WritingMaterials(String name, String color, int price) {
        this.name = name;
        this.color = "No Color";
        this.price = price;
        counter++;
    }

    public WritingMaterials(int price, double length, boolean draw) {
        this.price = price;
        this.length = length;
        this.color = "No Color";
        this.name = "No Name";
        counter++;
    }

    public WritingMaterials() {
        counter++;
    }




    public void display() {
        System.out.println( "Название:" + name + "\n" +
                " Цвет: " + color + "\n" +
                " Длина: " + length + "\n" +
                " Цена: " + price + "\n" +
                " Умеет рисовать: " + draw);
    }
    public void replace_rod(String newColor){
        color = newColor;
    }
    public void  priceUp(int newPrice){
        price = price + newPrice;
    }
    public void priceDown(int newPrice){
        price = price - newPrice;
    }
    public void  draw(int n){
        if (draw){
            System.out.println(name + " провёл линий: " + n + ". Её цвет - " + color + ".");
        } else {System.out.println(name + " не может ничего нарисовать.");}
    }
    public void  draw(){
        if (draw){
            System.out.println(name + " провёл линию. Её цвет - " + color + ".");
        } else {System.out.println(name + " не может ничего нарисовать.");}
    }
    public void  draw(String color){
        if (draw){
            System.out.println(name + " провёл линий: 1" + ". Её цвет - " + color + ".");
        } else {System.out.println(name + " не может ничего нарисовать.");}
    }
    public void  draw(String color,int n) {
        if (draw) {
            System.out.println(name + " провёл линий: " + n + ". Её цвет - " + color + ".");
        } else {
            System.out.println(name + " не может ничего нарисовать.");
        }
    }
}
