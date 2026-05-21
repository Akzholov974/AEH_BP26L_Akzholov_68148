package pl.pp;

public class Person {
    public String forename;
    public String surname;
    public int age;
    public String address;
    public int yearOfBirth;

    public Person() {
        this.forename = "";
        this.surname = "";
        this.age = 0;
        this.address = "";
        this.yearOfBirth = 0;
    }

    public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
        this.address = "";
        this.yearOfBirth = 0;
    }

    public void hiToAll() {
        System.out.println("Hello, my name is " + forename + " " + surname +
                ", age: " + age + ", address: " + address +
                ", born in: " + yearOfBirth);
    }

    public void growOld() {
        this.age++;
    }

    public void growOld(int years) {
        this.age += years;
    }

    public void beYounger() {
        if (this.age > 0) {
            this.age--;
        }
    }

    public String getName() {
        return this.forename;
    }

    public void setName(String newName) {
        this.forename = newName;
    }
}
