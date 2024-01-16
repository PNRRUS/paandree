package StepikIncapsulaition;

public final class Ruler extends WritingMaterials {
    int lengthRuler;
    boolean wood;

    {
        setDraw(false);
    }

    public int getLengthRuler() {
        return lengthRuler;
    }

    public boolean isWood() {
        return wood;
    }

    public void setLengthRuler(int length) {
        this.lengthRuler = length;
    }

    public void setWood(boolean wood) {
        this.wood = wood;
    }

    public void measure() {
        System.out.println("Сейчас померяем длину");
    }
    public void display() {
        System.out.println("\n" + "This is Ruler");
        super.display();
        System.out.println("Длина линейки: " + lengthRuler + "\n"
                + "Линейка деревянная: " + wood);
    }
}
