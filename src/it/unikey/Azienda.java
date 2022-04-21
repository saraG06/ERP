package it.unikey;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Azienda {

    private ArrayList<Dipendente> listaDipendenti;
    private ArrayList<Collaboratore> listaCollaboratori;
    private ArrayList<Fattura> listaFatture;
    private ArrayList<Contatto> listaContatti;

    public Azienda() {
        this.listaDipendenti = new ArrayList<>();
        this.listaCollaboratori = new ArrayList<>();
        this.listaFatture = new ArrayList<>();
        this.listaContatti = new ArrayList<>();
    }

    public ArrayList<Dipendente> getListaDipendenti() {
        return listaDipendenti;
    }

    public void setListaDipendenti(ArrayList<Dipendente> listaDipendenti) {
        this.listaDipendenti = listaDipendenti;
    }

    public ArrayList<Collaboratore> getListaCollaboratori() {
        return listaCollaboratori;
    }

    public void setListaCollaboratori(ArrayList<Collaboratore> listaCollaboratori) {
        this.listaCollaboratori = listaCollaboratori;
    }

    public ArrayList<Fattura> getListaFatture() {
        return listaFatture;
    }

    public void setListaFatture(ArrayList<Fattura> listaFatture) {
        this.listaFatture = listaFatture;
    }

    public ArrayList<Contatto> getListaContatti() {
        return listaContatti;
    }

    public void setListaContatti(ArrayList<Contatto> listaContatti) {
        this.listaContatti = listaContatti;
    }

    public ArrayList<Cliente> clienti10Contatti(){
        ArrayList<Cliente> lista= new ArrayList<>();
        for(Contatto x: this.listaContatti){
            int count= 0;
            for(Contatto y: this.listaContatti){
                if(x.getCliente().equals(y.getCliente()))
                    count++;
            }
            if(count>10 && !lista.contains(x.getCliente()))
                lista.add(x.getCliente());
        }
        return lista;
    }

    public List<Fattura> fattureReply(){
        List<Fattura> lista= new ArrayList<>();
        for(Fattura x: this.listaFatture)
            lista= this.listaFatture.stream().filter(fattura ->  fattura.getContatto().getCliente().getNome().equals("Reply")).collect(Collectors.toList());
        return lista;
    }

    public List<Dipendente> dipendentiMacchina(){
        List<Dipendente> lista= new ArrayList<>();
        for(Dipendente x: this.listaDipendenti){
            for(Risorsa r: x.getRisorseAssegnate()) {
                if (r.getRisorsaAssegnata().equals("MACCHINA")) {
                    lista.add(x);
                    break;
                }
            }
        }
        return lista;
    }
}
