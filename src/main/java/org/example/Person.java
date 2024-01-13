package org.example;

public class Person {
    private String name;
    private int age;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    @Override
    public int hashCode() {
        // Ein einfacher Hash-Code, der auf name und age basiert
        int result=17;
        result = 31 * result + name.hashCode();
        result = 31 * result + age;

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        // Die equals-Methode muss ebenfalls überschrieben werden
        if(this==obj){
            return true;
        }

        if(obj==null || getClass() != obj.getClass()){
            return false;
        }

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;


    }
}
