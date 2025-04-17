package org.example;

public class Person {
    String firstName;
    String lastName;
    int age;
    String egitim;
    double boy;
    double kilo;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, double kilo, double boy, String egitim, int age, String lastName) {
        this(firstName, lastName, age);
        this.kilo = kilo;
        this.boy = boy;
        this.egitim = egitim;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
