package innerClasses;

public class innerClassesMain {
    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1,5.3);
        mcLaren.addGear(2,10.6);
        mcLaren.addGear(3,15.3);
        mcLaren.operateClutch(true);
        mcLaren.changeGears(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGears(2);
    }
}
