package oop;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount bobsAccount = new BankAccount();
        bobsAccount.deposit(1000);
        bobsAccount.withdrawal(100.0);
    }
}
