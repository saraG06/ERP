package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;

public class Operatore extends Persona{

    private ArrayList<Risorsa> risorseAssegnate;

    public Operatore(String nome, String cognome, LocalDate nascita) {
        super(nome, cognome, nascita);
        this.risorseAssegnate= new ArrayList<>();
    }

    public ArrayList<Risorsa> getRisorseAssegnate() {
        return risorseAssegnate;
    }

    public Fattura generaFattura(Ordine o, Contatto c){
        if(c.getCliente().equals(o.getCliente()))
            return new Fattura(LocalDate.now(), c, o);
        else
            return null;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", risorseAssegnate=" + risorseAssegnate +
                '}';
    }
}
