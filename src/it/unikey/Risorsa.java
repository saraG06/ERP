package it.unikey;

import java.io.Serializable;

public class Risorsa implements Serializable {

    private enum RisorsaAssegnata{
        MACCHINA,
        PC,
        TELEFONO
    }
    private String risorsaAssegnata;

    public Risorsa(String risorsaAssegnata) {
        this.risorsaAssegnata = String.valueOf(RisorsaAssegnata.valueOf(risorsaAssegnata));
    }

    public String getRisorsaAssegnata() {
        return String.valueOf(risorsaAssegnata);
    }

    @Override
    public String toString() {
        return "risorsaAssegnata='" + risorsaAssegnata + '\'' +
                '}';
    }
}
