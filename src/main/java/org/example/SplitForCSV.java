package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



public class SplitForCSV {
    public static void main(String[] args){
        String csvFile = "src/csv/example1.csv";
        String csvSeparator = ",";
        String csvLine = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
            // Lesen Sie jede Zeile der CSV-Datei
            while ((csvLine = br.readLine()) != null){
                // Teilen Sie die Zeile anhand des Trennzeichens
                String[] data = csvLine.split(csvSeparator);

                // Zugriff auf die einzelnen Spalten
                String name = data[0];
                String age = data[1];
                String city = data[2];

                // Ausgabe der Daten
                System.out.println("Name: " + name + ", Age: " + age + ", City: " + city);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
