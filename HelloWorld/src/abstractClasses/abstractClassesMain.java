package abstractClasses;

public class abstractClassesMain {
    public static void main(String[] args) {
        Dog dog = new Dog("Doggie");
        dog.breathe();
        Parrot parrot = new Parrot("Perry");
        parrot.eat();
        parrot.fly();
        Penguin penguin = new Penguin("happy");
        penguin.fly();
    }
}
