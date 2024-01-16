package StepikIncapsulaition;

public final class Fish extends Animal{
   private String squama;
    private boolean upStreamSwim;
    {
        setSwim(true);
    }

    public Fish(String type, String name, String squama, boolean upStreamSwim) {
        super(type, name);
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
    }

    public String getSquama() {
        return squama;
    }

    public boolean isUpStreamSwim() {
        return upStreamSwim;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
    public void bul_bul() {
        System.out.println("Bul-bul");
    }
    public void display() {
        System.out.println("\n" + "I am Fish");
        super.display();
        System.out.println("Тип чешуи: " + squama + "\n"
                + "Умеет ли плавать против течения: " + upStreamSwim);
    }
    @Override
    public void rename(String nName) {
       super.setName(nName);
    counter++;
    }
}
