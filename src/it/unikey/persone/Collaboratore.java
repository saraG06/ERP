package it.unikey.persone;

public class Collaboratore extends Operatore {

    private static int count = 0 ;
    private int codice;

    public Collaboratore(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
        this.codice = count++ ;
    }

    public int getCodice() {
        return codice;
    }
}
