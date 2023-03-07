package cz.czechitas.lekce5;

import cz.czechitas.lekce5.model.Osoba;
import cz.czechitas.lekce5.model.Telefon;

import java.util.Random;

/**
 * Hlavní třída pro lekci 5.
 */
public class HlavniProgram {

    /**
     * Spouštěcí metoda celé aplikace.
     *
     * @param args
     */
    public static void main(String... args) {
        //TODO tady bude náš kód

        System.out.println("Slavnostně přísahám, že jsem připraven ke každé špatnosti.");

        Telefon rumcajsuvTelefon = new Telefon();
        rumcajsuvTelefon.setPredcisli("+420");
        rumcajsuvTelefon.setTelefonniCislo("737 227 622");

        Osoba rumcajs = new Osoba();
        rumcajs.setJmeno("Rumcajs");
        rumcajs.setPrijmeni("Řáholecký");
        rumcajs.setZena(false);
        rumcajs.setRodneCislo("020202/0000");
        rumcajs.setSoukromyEmail("rumcajsicek@badoo.com");
        rumcajs.setPracovniEmail("rumcajs.raholecky@outlook.com");
        rumcajs.setTelefon(rumcajsuvTelefon);

        System.out.println("Rumcajsovo cele jmeno je: "rumcajs.getCeleJmeno()+".");
        System.out.println("Telefon na Rumcajse je "+ rumcajs.getTelefon()+".");
        System.out.println("Rumcajsuv soukromy email je " + rumcajs.getSoukromyEmail() + " a jeho pracovni email je "+ rumcajs.getPracovniEmail()+".");


    }

}
