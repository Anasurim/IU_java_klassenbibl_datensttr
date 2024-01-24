package org.example;

public class SringExample {
    public static void main(String[] args){
        String gruss = "Hello Student";
        gruss = gruss + "!";
        String ausgabe = gruss + " es wurden " + args.length + " Parameter übergeben";

        //System.out.println(ausgabe);

        int a = 12;
        float f = 1.45F;

        String aString1 = "" + a;
        String fString1 = "" + f;

        String aString2 = String.valueOf(a);
        String fString2 = String.valueOf(f);

        String dateiname = "2012-04-01_A_GMBH_001.csv";
        int titelStart = dateiname.indexOf("_");
        int titelEnd = dateiname.lastIndexOf("_");

        String herstellerName = dateiname.substring(titelStart +1 ,titelEnd);

        String echterName = herstellerName.replace("_", " ");

        System.out.println(echterName);

    }
}
