package org.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateExample {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

        Date currentDate = new Date();
        String formattedDateBefore = sdf.format(currentDate);

        System.out.println("Vorher: " + formattedDateBefore);

        // Verwendung von Calendar, um den Monat um 6 zu erhöhen
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.MONTH, 6);

        // Konvertierung des Datums zurück zu einem Date-Objekt
        Date newDate = calendar.getTime();

        String formattedDateAfter = sdf.format(newDate);
        System.out.println("Nachher: " + formattedDateAfter);

        /*Date datum1 = new Date();
        String formatiertesDatum = sdf.format(datum1);

        System.out.println("Vorher: " + datum1);
        datum1.setMonth(datum1.getMonth() + 6);
        System.out.println("Nacher: " + datum1 );
        */
    }
}
