package org.example;

import java.util.Scanner;

public class OnlineShopStack {
    private Historie historie= new Historie();
    private String[] schritte = new String[]{"Warenkorb anzeigen", "Zahlungsmethode wählen", "Zahlungsinfo angeben",
            "Versandt wählen", "Bestellübersicht anzeigen", "Bestellbestätigung anzeigen"};

    public static void main(String[] args){
        OnlineShopStack shop = new OnlineShopStack();
        shop.bestellprozess();
    }

    private void bestellprozess(){
        Scanner scanner = new Scanner(System.in);
        int prozessPosition = 0;
        int eingabe = -1;

        while (eingabe != 0){
            System.out.println("Aktuelle Schritt: " + schritte[prozessPosition]);
            System.out.println("Bitte wählen Sie (1 = weiter zu '" +
                    schritte[prozessPosition] + "', 2 = zurück, 0 = beenden): ");
            eingabe = scanner.nextInt();

            switch (eingabe){
                case 0:
                    System.out.println("Danke für Ihren Besuch");
                    break;

                case 1:
                    prozessPosition++;
                    historie.weiter(schritte[prozessPosition]);
                    if (prozessPosition==schritte.length-1){
                        System.out.println("Vielen Dank für Ihren Einkauf!");
                        return;
                    }
                    break;

                case 2:
                    if (historie.zurueck() != null){
                        prozessPosition--;

                    }
                    break;
            }
        }

    }

}
