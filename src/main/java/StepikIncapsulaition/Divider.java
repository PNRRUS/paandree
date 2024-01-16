package StepikIncapsulaition;

public final
class Divider extends WritingMaterials {
    String dividerType;
    boolean metal;

    {
        setDraw(true);
    }

    public String getDividerType() {
        return dividerType;
    }

       public boolean isMetal() {
        return metal;
    }



    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public void setMetal(boolean metal) {
        this.metal = metal;
    }
    public final void draw_circle() {
        System.out.println("Нарисован круг");
    }
    public void display() {
        System.out.println("\n" + "This is Divider");
        super.display();
        System.out.println("Тип циркуля: " + dividerType + "\n"
                + "Циркуль металлический: " + metal);
    }

}
