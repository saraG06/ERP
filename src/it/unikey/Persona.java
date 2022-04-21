package it.unikey;

import java.time.LocalDate;

public class Persona {

    private String nome;
    private String cognome;
    private LocalDate nascita;

    public Persona(String nome, String cognome, LocalDate nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getNascita() {
        return nascita;
    }

    public void setNascita(LocalDate nascita) {
        this.nascita = nascita;
    }
}
