package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        // Erstellen einer Queue
        Queue<String> queue = new LinkedList<>();

        // Elemente zur Queue hinzufügen
        queue.add("Element 1 ");
        queue.add("Element 2 ");
        queue.add("Element 3 ");

        // Elemente aus der Queue entfernen und ausgeben

        while (!queue.isEmpty()){
            System.out.print("Entfernt: " + queue.remove());
        }
    }
}
