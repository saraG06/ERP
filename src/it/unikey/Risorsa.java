package it.unikey;

public class Risorsa {

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

    public void setRisorsaAssegnata(String risorsaAssegnata) {
        this.risorsaAssegnata = risorsaAssegnata;
    }
}
