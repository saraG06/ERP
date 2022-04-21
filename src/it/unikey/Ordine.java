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

    public UUID getCodice() {
        return codice;
    }

    public String getDettaglio() {
        return dettaglio;
    }

    public void setDettaglio(String dettaglio) {
        this.dettaglio = dettaglio;
    }

    public LocalDate getDataImporto() {
        return dataImporto;
    }

    public void setDataImporto(LocalDate dataImporto) {
        this.dataImporto = dataImporto;
    }

    public Operatore getOperatore() {
        return operatore;
    }

    public void setOperatore(Operatore operatore) {
        this.operatore = operatore;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
