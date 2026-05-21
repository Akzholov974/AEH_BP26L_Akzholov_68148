package pl.pp;

public class Account {

    private String accountNumber;
    private double balance;
    private String ownerName;
    private String email;
    private String phoneNumber;

    public Account() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.ownerName = "";
        this.email = "";
        this.phoneNumber = "";
    }

    public Account(String accountNumber, double balance, String ownerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + " PLN. New balance: " + this.balance + " PLN.");
        }
    }

    public void withdraw(double amount) {
        if (amount > this.balance) {
            System.out.println("Insufficient funds! Cannot withdraw " + amount + " PLN. Available balance: " + this.balance + " PLN.");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount + " PLN. Remaining balance: " + this.balance + " PLN.");
        }
    }

    public void displayInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Owner: " + ownerName);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Current Balance: " + balance + " PLN\n");
    }
}
