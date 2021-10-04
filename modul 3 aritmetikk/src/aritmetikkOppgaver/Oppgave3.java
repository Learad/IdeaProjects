package aritmetikkOppgaver;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class Oppgave3 {
    public static void main(String[] args) {
        /*
        Lag et program som regner ut arealet av et rektangel.
        Programmet skal lese inn lengden og bredden på rektangelet.
        Regn så ut  arealet og skriver ut svaret på følgende måte:
        ”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.
        */
        String innlengde = JOptionPane.showInputDialog("Skriv inn lengde");
        String innBredde = JOptionPane.showInputDialog("Skriv inn bredde");
        double lengde = Double.parseDouble(innlengde);
        double bredde = Double.parseDouble(innBredde);
        double areal = lengde * bredde;

        System.out.println("Et rektangel med bredde " + bredde + " cm og lengde " + lengde + " cm har et areal på "
                + areal + " cm^2.");
    }
}
