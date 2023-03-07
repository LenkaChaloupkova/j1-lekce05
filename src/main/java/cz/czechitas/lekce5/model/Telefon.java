package cz.czechitas.lekce5.model;

import java.util.Objects;

public class Telefon {
    private String predcisli;
    private String telefonniCislo;

    public String getPredcisli() {
        return predcisli;
    }


    public String getTelefonniCislo() {
        return telefonniCislo;
    }

    @Override
    public String toString() {
        return predcisli + " " + telefonniCislo;
    }
    public void setTelefonniCislo(String telefonniCislo) {
        Objects.requireNonNull(telefonniCislo);
        if (telefonniCislo.isBlank()) {
            System.err.println("Telefonní číslo musí být vyplněno.");
            return;
        }
        this.telefonniCislo = telefonniCislo;
    }
    public void setPredcisli(String predcisli) {
        Objects.requireNonNull(predcisli);
        if (predcisli.isBlank()) {
            System.err.println("Předčíslí musí být vyplněno.");
            return;
        }
        this.predcisli = predcisli;
    }
}
