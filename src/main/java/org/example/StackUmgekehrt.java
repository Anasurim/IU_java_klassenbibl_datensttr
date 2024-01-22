package org.example;

import java.util.Stack;

public class StackUmgekehrt {
    public static void main(String[] args){
        // Erstellen eines Stacks
        Stack<Character> stack = new Stack<>();

        String text = "Helau Stack!";

        // Zeichen in den Stack einfügen
        for (char c: text.toCharArray()){
            stack.push(c);
        }

        // Zeichen vom Stack abrufen und ausgeben
        System.out.print("Umgekehrter String: ");
        while(!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}
