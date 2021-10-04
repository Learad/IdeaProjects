package aritmetikkOppgaver;

import javax.swing.*;

public class Oppgave11 {
    public static void main(String[] args) {
        //Les inn et tall mellom 0 og 1000 og skriv ut summen av sifrene i tallet (tverrsummen).
        //F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13.
        //Tips: 751 % 10 = 1 og 751 / 10 = 75.
        String innTall = JOptionPane.showInputDialog("Skriv inn et frivillig tall");
        int tall = Integer.parseInt(innTall);
        int siffer1 = tall % 10 ;
        tall = tall / 10;
        int siffer2 = tall % 10;
        tall = tall / 10;
        int tverrSum = siffer1 + siffer2 + tall;

        System.out.println(tverrSum);

        }
    }

