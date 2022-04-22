package it.unikey;

import java.time.LocalDate;
import java.util.UUID;

public class Ordine {

    private final UUID codice;
    private String dettaglio;
    private LocalDate dataImporto;
    private Operatore operatore;
    private Cliente cliente;

    public Ordine(String dettaglio, LocalDate dataImporto, Operatore operatore, Cliente cliente) {
        this.codice= UUID.randomUUID();
        this.dettaglio = dettaglio;
        this.dataImporto = dataImporto;
        this.operatore= operatore;
        this.cliente= cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    @Override
    public String toString() {
        return "Ordine{" +
                "codice=" + codice +
                ", dettaglio='" + dettaglio + '\'' +
                ", dataImporto=" + dataImporto +
                ", operatore=" + operatore +
                ", cliente=" + cliente +
                '}';
    }
}
