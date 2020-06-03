package interfaces;

public class MainClass {
    public static void main(String[] args) {
        ITelephone thisPhone;
        thisPhone = new DeskPhone(121212);
        thisPhone.powerOn();
        thisPhone.callPhone(121212);

        MobilePhone mobilePhone = new MobilePhone(21212121);
        mobilePhone.powerOn();
        thisPhone.answer();

    }
}
