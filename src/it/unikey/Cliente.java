package it.unikey;

import it.unikey.persone.Contatto;

import java.util.ArrayList;

public class Cliente {

    private static int count = 0 ;
    private int codice;
    String nome ;
    String pIva ;
    private ArrayList<Contatto> contatti ;

    public Cliente(String nome, String pIva) {
        this.nome = nome;
        this.pIva = pIva;
        codice = count++ ;
        contatti = new ArrayList<>() ;
    }

    public ArrayList<Contatto> getContatti() {
        return contatti;
    }

    public void setContatti(ArrayList<Contatto> contatti) {
        this.contatti = contatti;
    }

    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getpIva() {
        return pIva;
    }

    public void setpIva(String pIva) {
        this.pIva = pIva;
    }
}
