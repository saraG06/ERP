package it.unikey;

import java.time.LocalDate;
import java.util.UUID;

public class Fattura {

    private final UUID codice;
    private LocalDate data;
    private Contatto contatto;
    private Ordine ordine;

    public Fattura(LocalDate data, Contatto contatto, Ordine ordine) {
        this.codice = UUID.randomUUID();
        this.data = data;
        this.contatto= contatto;
        this.ordine= ordine;
    }

    public LocalDate getData() {
        return data;
    }

    public Contatto getContatto() {
        return contatto;
    }

    public Ordine getOrdine() {
        return ordine;
    }

    @Override
    public String toString() {
        return "Fattura{" +
                "codice=" + codice +
                ", data=" + data +
                ", contatto=" + contatto +
                ", ordine=" + ordine +
                '}';
    }
}
