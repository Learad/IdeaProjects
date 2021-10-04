package aritmetikkOppgaver;

import javax.swing.*;

public class Oppgave7 {
    public static void main(String[] args) {
        //Les inn verdier for antall pizza, antall personer og antallSlicesPerPizza.
        //Regn så ut hvor mange pizza-slices hver person får dersom man deler likt gitt at en pizza har f.eks 6 slices hver.
        //Hvor mange slices er det til overs dersom man deler likt?
        //Bruk modulus operatoren. Skriv ut resultatet på følgende form:
        //”Dersom man er 4 personer og har 3 pizzaer får hver person 4 slices og 2 blir til overs”.

        String innPizza = JOptionPane.showInputDialog("Skriv inn antall pizza");
        String innPersoner = JOptionPane.showInputDialog("Skriv inn antall personer");
        String innSlicesPerPizza = JOptionPane.showInputDialog("Skrv inn antall pizzastykker per pizza");
        int pizza = Integer.parseInt(innPizza);
        int personer = Integer.parseInt(innPersoner);
        int slicesPerPizza = Integer.parseInt(innSlicesPerPizza);
        int slicesLeftOver = slicesPerPizza - personer;

        System.out.println("Dersom man er " + personer + " personer og har " + pizza +
                " pizzaer får hver person " + personer + " slices og " +slicesLeftOver+ " blir til overs" );
    }
}
