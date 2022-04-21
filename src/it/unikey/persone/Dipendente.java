package it.unikey.persone;

import it.unikey.Enum.Ruoli;

import java.time.LocalDate;

public class Dipendente extends Operatore {

    private static int count = 0 ;
    private int codice;
    private LocalDate dataAssunzione;
    private Ruoli ruolo;

    public Dipendente(String nome, String cognome, String dataNascita,String ruolo) {
        super(nome, cognome, dataNascita);
        this.codice = count++ ;
        this.ruolo = Ruoli.valueOf(ruolo.toUpperCase()) ;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Ruoli getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruoli ruolo) {
        this.ruolo = ruolo;
    }
}
