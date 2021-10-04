package aritmetikkOppgaver;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args) {
        //Lag et program som leser inn et beløp i amerikanske dollar (USD)
        //og regner om og skriver ut tilsvarende beløp i norske kroner.
        //Benytt dagens valutakurs fra nettet.

        String innUnitedStatesDollar = JOptionPane.showInputDialog("legg inn USD verdi.");
        double unitedStatesDollar = Double.parseDouble(innUnitedStatesDollar);
        double moneyUSDtoNOK = unitedStatesDollar * 8.63;

        String moneyUSDtoNOKMedToDesimaler = String.format("%.2f" , moneyUSDtoNOK);

        System.out.println("NOK = "+moneyUSDtoNOKMedToDesimaler);
    }
}
