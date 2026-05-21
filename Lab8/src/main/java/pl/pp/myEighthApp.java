package pl.pp;

public class myEighthApp {

    public static void main(String[] args) {
        // Demonstration of Person and Circle classes
        Person person = new Person("John", "Doe", 30);
        person.hiToAll();

        Circle circle = new Circle(5.0);
        circle.getInfo();
        System.out.println();

        // Task 2: Testing the Bank Account system
        Account myAccount = new Account("PL1234567890", 1000.0, "Adilet Akzholov", "adiletakzholov5@gmail.com", "+48123456789");

        myAccount.displayInfo();

        // Try to deposit money
        myAccount.deposit(500.0);

        // Try to withdraw within balance
        myAccount.withdraw(300.0);

        // Try to withdraw exceeding balance (Should trigger error statement)
        myAccount.withdraw(2000.0);

        System.out.println();
        myAccount.displayInfo();
    }
}
