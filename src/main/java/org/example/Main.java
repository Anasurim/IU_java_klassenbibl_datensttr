package org.example;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice",31);
        Person person2 = new Person("Alice", 31);
        Person person3 = new Person("Alice", 44);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode()==person2.hashCode());
        System.out.println(person1.equals(person3));
    }

    /**
     * bla bla
     */
}