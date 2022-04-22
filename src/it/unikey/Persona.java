package it.unikey;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable {

    private String nome;
    private String cognome;
    private LocalDate nascita;

    public Persona(String nome, String cognome, LocalDate nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", nascita=" + nascita +
                '}';
    }
}
