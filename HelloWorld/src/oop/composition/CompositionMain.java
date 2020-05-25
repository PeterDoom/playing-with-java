package oop.composition;

public class CompositionMain {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 ,5);
        Case pcCase = new Case("220b", "dell", "230", dimensions);

        Resolution nativeResolution = new Resolution(1920, 1080);
        Monitor monitor =new Monitor("27 inch", "acer", 25, nativeResolution);
        Motherboard theMotherBoard = new Motherboard("SOMEMODEL-2", "Asus", 4, 6, "v2");

        PC pc = new PC(pcCase, monitor, theMotherBoard);
        pc.powerUp();
    }
}
