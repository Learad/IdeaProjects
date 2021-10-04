package oppgaver.variabler1;

import javax.swing.*;

public class Oppg1 {
    public static void main(String[] args) {
        String firstName = JOptionPane.showInputDialog("Hva er navnet ditt?");
        String lastName = JOptionPane.showInputDialog("Hva er etternavnet ditt?");
        String age = JOptionPane.showInputDialog("Hva er alderen din?");
        String adress = JOptionPane.showInputDialog("Hva er adressen din?");
        String postArea = JOptionPane.showInputDialog("Hva er din poststed?");
        String postNr = JOptionPane.showInputDialog("Hva er ditt postnr?");
        String out = firstName + " " + lastName + " bor i " + adress +" som har postnummer "+postNr+" i "+postArea+
                ". "+ firstName +"'s alder er "+ age +" år";
        String format =
                "Navn : "+ firstName + " " + lastName + "\n" +
                "Alder : " + age + "\n" +
                "Adresse : "+ adress + "\n" +
                "Postnummer : "+ postNr + "\n" +
                "Poststed : " + postArea + "\n";

        System.out.print(format);
    }
}
