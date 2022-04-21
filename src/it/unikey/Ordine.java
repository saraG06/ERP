package it.unikey;

import it.unikey.persone.Operatore;

import java.time.LocalDate;

public class Ordine {

    private static int count = 0 ;
    private int codice;
    LocalDate data ;
    double importo ;
    String dettaglio ;
    Operatore oper ;
    Cliente cliente ;

    public Ordine(String data, double importo, String dettaglio,Operatore oper,Cliente cliente) {
        this.data = LocalDate.parse(data);
        this.importo = importo;
        this.dettaglio = dettaglio;
        this.codice = count++ ;
        this.oper = oper ;
        this.cliente = cliente ;
    }

    public Operatore getOper() {
        return oper;
    }

    public Cliente getCliente() {
        return cliente;
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

    public double getImporto() {
        return importo;
    }

    public void setImporto(double importo) {
        this.importo = importo;
    }

    public String getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(String dettaglio) {
        this.dettaglio = dettaglio;
    }
}
