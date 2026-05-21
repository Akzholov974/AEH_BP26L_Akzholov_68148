package pl.pp;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.hiToAll();

        person1.forename = "John";
        person1.surname = "Doe";
        person1.age = 24;
        person1.address = "Warsaw";
        person1.yearOfBirth = 2002;
        person1.hiToAll();

        Person person2 = new Person("Alice", "Hart", 42);
        person2.address = "Krakow";
        person2.yearOfBirth = 1984;
        person2.hiToAll();

        person1.growOld();

        person2.growOld(10);
        person2.hiToAll();

        person2.beYounger();
        person2.beYounger();
        person2.hiToAll();

        System.out.println(person1.getName());
        person1.setName("Lolo");
        System.out.println(person1.getName());
        person1.hiToAll();
    }
}
