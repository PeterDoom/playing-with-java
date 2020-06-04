package abstractClasses;

public abstract class Bird extends Animal implements CanFlyInterface {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Bird is breathing");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void fly() {
        System.out.println("Wings are flapping");
    }
}
