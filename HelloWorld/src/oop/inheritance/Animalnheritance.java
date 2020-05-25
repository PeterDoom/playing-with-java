package oop.inheritance;

public class Animalnheritance {
 private String name;
 private int brain;
 private int body;
 private int size;
 private int weight;

    public Animalnheritance(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal class, method eat() called");
    }

    public void move(int speed){
        System.out.println("Animal Moving at " + speed);

    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
