package oopBasic.encapsulation;

public class EncapsulationMain {
    public static void main(String[] args) {
        PlayerEncapsulation player = new PlayerEncapsulation("Tim", 100, "Sword");


        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Ramaining health = " + player.getHealth());
    }


}
