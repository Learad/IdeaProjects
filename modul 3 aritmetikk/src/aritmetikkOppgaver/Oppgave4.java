package aritmetikkOppgaver;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String[] args) {

        /*
         Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
         Regn så ut  omkretsen av sirkelen (2*3.14*radius) og skriver ut svaret på følgende måte:
         ”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.”

        Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen); for å få 2 desimaler.
        */

        String innRadius = JOptionPane.showInputDialog("Radius til sirkel?");
        double radius = Double.parseDouble(innRadius);
        double omkrets = Math.PI*2*radius;

        String omkretsenMedToDesimaler = String.format("%.2f" , omkrets);

        System.out.println("Omkretsen av en sirkel med " + radius + " cm som radius blir " + omkretsenMedToDesimaler + " cm.");

    }
}
