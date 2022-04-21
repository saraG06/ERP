package it.unikey.persone;

public class Contatto extends Persona {

    private static int count = 0 ;
    private int codice;

    public Contatto(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
        this.codice = count++ ;
    }

    public int getCodice() {
        return codice;
    }
}
