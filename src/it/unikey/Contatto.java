package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

public class Contatto extends Persona{

    private final UUID codice;
    private Cliente cliente;

    public Contatto(String nome, String cognome, LocalDate nascita, Cliente cliente) {
        super(nome, cognome, nascita);
        this.codice= UUID.randomUUID();
        this.cliente= cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Fattura> cercaFatture(ArrayList<Fattura> lista){
        ArrayList<Fattura> listaFatture= new ArrayList<>();
        for(Fattura x: lista){
            if(x.getContatto().getCliente().equals(this.cliente))
                listaFatture.add(x);
        }
        return listaFatture;
    }

    @Override
    public String toString() {
        return super.toString() +
                "codice=" + codice +
                ", cliente=" + cliente +
                '}';
    }
}
