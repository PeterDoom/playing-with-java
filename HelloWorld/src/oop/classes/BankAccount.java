package oop.classes;

public class BankAccount {
    private String number;
    private double balance;
    private String customerName;
    private String EmailAddress;
    private String customerPhoneNumber;

    public BankAccount(String number, double balance, String customerName, String emailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        EmailAddress = emailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(){
        System.out.println("empty constructor called");
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("New Balance set to " + this.balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount < 0) {
            System.out.println("Only " + this.balance + " available. Not Processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal processed current balance: " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
