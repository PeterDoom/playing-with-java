package oopBasic.inheritance;

public class FishInheritance extends Animalnheritance {
    private int gills;
    private int eyes;
    private int fins;

    public FishInheritance(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }


    private void moveMuscles() {
        System.out.println("Moving muscles");
    }

    private void moveBackFin() {
        System.out.println("Moving back fin");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

}
