package aritmetikkOppgaver;

import javax.swing.*;

public class Oppgave5 {
    public static void main(String[] args) {
        //Lag et program som regner om fra fahrenheit til celsius.
        // Les inn verdien for fahrenheit og regn ut tilsvarende celsius med følgende formel:
        // C = (F-32)/1.8. Skriv så ut resultatet i Celsius.

        //Les inn en verdi for Fahrenheit
        String innFahrenheit = JOptionPane.showInputDialog("Sett inn en verdi for Fahrenheit.");
        double Fahrenheit = Double.parseDouble(innFahrenheit);
        double C = (Fahrenheit-32)/1.8;

        String cMedToDesimaler = String.format("%.2f" , C);

        System.out.println("C = "+ cMedToDesimaler);
    }
}
