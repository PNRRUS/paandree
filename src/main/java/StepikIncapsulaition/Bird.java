package StepikIncapsulaition;

public class Bird extends Animal{
    private String area;
    private boolean winterFly;
    {
        setFly(true);
    }

    public Bird() {
    }

    public Bird(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim, String area, boolean winterFly) {
        super(type, name, age, weight, isFly, isWalk, isSwim);
        this.area = area;
        this.winterFly = winterFly;
    }

    public String getArea() {
        return area;
    }

    public boolean isWinterFly() {
        return winterFly;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }
    public void chirick_chirick() {
        System.out.println("Chirik-Chirik");
        }
        @Override
        public void display() {
        System.out.println("\n" + "I am Bird");
        super.display();
           System.out.println("Среда обитания: " + area + "\n"
           + "Перелетная птица: " + winterFly);
    }

    @Override
    public void rename(String neName) {
        super.setName(neName);
        counter++;
    }
}
