package oop.inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        Animalnheritance animal = new Animalnheritance("Animal", 1, 1,5 ,5);
        DogInheritance dog = new DogInheritance("Yorkie", 8 ,20 , 2 ,4 ,20 , 32, "long");
        FishInheritance fish = new FishInheritance("Carp", 1, 1, 4, 2,2,2, 8);
        dog.eat();
        dog.walk();
        dog.run();
        fish.swim(15);
    }
}
