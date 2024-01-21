package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice",31);
        Person person2 = new Person("Peter", 31);
        Person person3 = new Person("John", 44);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode()==person2.hashCode());
        System.out.println(person1.equals(person3));

        int result = person1.compareTo(person3);

        if (result<0){
           // System.out.println(person1.getName() + " ist jünger als " + person3.getName());
        } else if (result>0) {
           // System.out.println(person1.getName() + " ist älter als " + person3.getName());

        } else {
            // System.out.println(person1.getName() + " und " + person3.getName() + " sind gleich alt");

        }

        String text = "Hallo,Welt!";

        System.out.println(text.length());

        ArrayList<String> nameList=new ArrayList<>();
        nameList.add("Roman");
        nameList.add("Nataliia");

        System.out.println(nameList);


    }

    /**
     * bla bla
     */
}