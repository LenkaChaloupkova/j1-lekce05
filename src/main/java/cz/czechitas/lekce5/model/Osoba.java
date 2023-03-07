package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Osoba {
    private String jmeno;
    private String prijmeni;
    private String rodneCislo;
    private Telefon telefon;
    private boolean zena;
    private String soukromyEmail;
    private String pracovniEmail;


    public void setCeleJmeno(String jmeno) {
        Objects.requireNonNull(jmeno); //když nechci, aby se mi tam objevila null
        if (jmeno.isBlank()) {
            System.err.println("Jméno nemůže být prázdné.");
            System.out.println("Jméno nemůže být prázdné.");
            return;
        }
        this.jmeno = jmeno;
    }

    public String getSoukromyEmail() {
        return soukromyEmail;
    }

    public void setSoukromyEmail(String soukromyEmail) {
        this.soukromyEmail = soukromyEmail;
    }

    public String getPracovniEmail() {
        return pracovniEmail;
    }

    public void setPracovniEmail(String pracovniEmail) {
        this.pracovniEmail = pracovniEmail;
    }

    public void setPrijmeni(String prijmeni) {
        Objects.requireNonNull(prijmeni);
        if (prijmeni.isBlank()) {
            System.err.println("Příjmení nemůže být prázdné.");
            System.out.println("Příjmení nemůže být prázdné.");
            return;
        }
        this.prijmeni = prijmeni;
    }

    public String getRodneCislo() {
        return rodneCislo;
    }

    public void setRodneCislo(String rodneCislo) {
        Objects.requireNonNull(rodneCislo);
        if (rodneCislo.isBlank()) {
            System.err.println("Rodné číslo nemůže být prázdné.");
            return;
        }
        if (!rodneCislo.contains("/")) {
            System.err.println("Rodné číslo musí obsahovat lomítko.");
            return;
        }
        this.rodneCislo = rodneCislo;
    }

    public Telefon getTelefon() {
        return telefon;
    }

    public void setTelefon(Telefon telefon) {
        this.telefon = telefon;
    }

    public String toString() {
        return jmeno + " " + prijmeni + " (" + rodneCislo + ")";
    }

    public void setZena(boolean b) {
    }

}

