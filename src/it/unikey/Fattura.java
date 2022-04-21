package it.unikey;

import it.unikey.persone.Contatto;

import java.time.LocalDate;

public class Fattura {

    private static int count = 0 ;
    private int codice;
    LocalDate data ;
    Ordine ordine ;
    Contatto contatto ;

    public Fattura(String data,Ordine ordine,Contatto contatto) {
        this.data = LocalDate.parse(data);
        codice=count++ ;
        this.contatto = contatto ;
        this.ordine = ordine ;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    public void setOrdine(Ordine ordine) {
        this.ordine = ordine;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public void setContatto(Contatto contatto) {
        this.contatto = contatto;
    }

    public int getCodice() {
        return codice;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
