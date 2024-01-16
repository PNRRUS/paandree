package StepikIncapsulaition;

public class Insect extends Animal{
   private int wingCount;
    private boolean likeJesus;
    {
        setWalk(true);
    }
    public int getWingCount() {
        return wingCount;
    }

    public boolean isLikeJesus() {
        return likeJesus;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
    public void ggggg () {
       System.out.println("Ggggg");
    }
    public void display() {
        System.out.println("I am Fish");
        super.display();
        System.out.println("Количество крыльев: " + wingCount + "\n"
                + "Умеет ли ходить по воде: " + likeJesus);
    }
}
