package it.unikey.persone;

import it.unikey.Enum.Risorse;

import java.io.Serializable;
import java.util.HashSet;

public abstract class Operatore extends Persona implements Serializable {

    HashSet<Risorse> risorse ;

    public Operatore(String nome, String cognome, String dataNascita) {
        super(nome, cognome, dataNascita);
        risorse = new HashSet<>() ;
    }

    public void addRisorsa(String r){
        risorse.add(Risorse.valueOf(r.toUpperCase())) ;
    }

    public HashSet<Risorse> getRisorse() {
        return risorse;
    }

    @Override
    public String toString() {
        return "Operatore{" +
                super.toString() +
                "risorse=" + risorse +
                '}';
    }
}
