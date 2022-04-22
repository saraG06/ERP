package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Collaboratore extends Operatore{

    private final UUID codice;

    public Collaboratore(String nome, String cognome, LocalDate nascita) {
        super(nome, cognome, nascita);
        this.codice= UUID.randomUUID();
    }

    @Override
    public String toString() {
        return super.toString() +
                " ,codice=" + codice +
                '}';
    }
}
