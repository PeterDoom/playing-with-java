package oop.inheritance;

public class DogInheritance extends Animalnheritance {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public DogInheritance(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(12);
    }

    public void run() {
        System.out.println("Dog.run() called;");
        super.move(25);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called with speed: " + speed);
    }

    @Override
    public void move(int speed){
        System.out.println("Dog.move() called");
        moveLegs(speed);
//        super.move(speed);
    }
}
