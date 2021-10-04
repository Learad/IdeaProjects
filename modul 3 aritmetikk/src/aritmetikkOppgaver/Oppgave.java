package aritmetikkOppgaver;

import javax.swing.*;

public class Oppgave {
    public static void main(String [] args){
        String innNavn = JOptionPane.showInputDialog("Hva heter du?");
        String innAlder = JOptionPane.showInputDialog("hvor gammel er du?");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2021 - alder;
        int pensjonsår = fødselsår + 67;

        System.out.println(innNavn+" er "+alder+" år. Han er født i "+fødselsår+". I "+pensjonsår+" er han 67 år og da vil han være pensjonist." );


    }
}
