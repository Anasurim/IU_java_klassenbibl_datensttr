package org.example;

import java.util.Scanner;

public class ScannerBeispiel {
    public static void main(String[] args){
        // Erstellen Sie ein Scanner-Objekt, das die Systemeingabe liest
        Scanner scanner = new Scanner(System.in);

        // Benutzereingabe abfragen
        System.out.println("Geben Sie Ihren Namen ein: ");

        String name = scanner.nextLine();

        System.out.print("Geben Sie Ihr Alter ein: ");

        int alter = scanner.nextInt();

        // Benutzerausgabe basierend auf den eingegebenen Informationen
        System.out.println("Hallo, " + name + "! Sie sind " + alter + " Jahre alt.");

        // Schließen Sie den Scanner, um Ressourcen freizugeben
        scanner.close();

    }
}
