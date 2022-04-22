package it.unikey;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Azienda {

    private ArrayList<Dipendente> listaDipendenti;
    private ArrayList<Collaboratore> listaCollaboratori;
    private ArrayList<Fattura> listaFatture;
    private ArrayList<Contatto> listaContatti;
    private ArrayList<Ordine> listaOrdini;
    String path= "C:\\Users\\Matteo\\IdeaProjects\\Esercizio12\\ERP\\resources\\Dipendenti.txt";

    public Azienda() {
        this.listaDipendenti = new ArrayList<>();
        this.listaCollaboratori = new ArrayList<>();
        this.listaFatture = new ArrayList<>();
        this.listaContatti = new ArrayList<>();
        this.listaOrdini= new ArrayList<>();
    }

    public ArrayList<Fattura> getListaFatture() {
        return listaFatture;
    }

    public ArrayList<Contatto> getListaContatti() {
        return listaContatti;
    }

    public ArrayList<Ordine> getListaOrdini() {
        return listaOrdini;
    }

    public void aggiungiDipendente(Dipendente d){
        this.listaDipendenti.add(d);
        if(!Files.exists(Paths.get(path))){
            try{
                Files.createFile(Paths.get(path));
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        try(FileOutputStream fo= new FileOutputStream(path);
        ObjectOutputStream ob= new ObjectOutputStream(fo)){
            ob.writeObject(this.listaDipendenti);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
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

    public List<Fattura> fatture31122019(){
        LocalDate check= LocalDate.of(2019, 12, 31);
        return this.listaFatture.stream().filter(f -> f.getData().isAfter(check)).collect(Collectors.toList());
    }

    public List<Ordine> ordiniSenzaFattura(){
        ArrayList<Ordine> lista= this.listaOrdini;
        for(Fattura f: this.listaFatture){
            Ordine o= f.getOrdine();
            if(lista.contains(o))
                lista.remove(o);
        }
        return lista;
    }

    public List<Dipendente> ultimiAssunti(){
        return this.listaDipendenti.stream().filter(d -> d.getAssunzione().getMonth().equals(LocalDate.now().getMonth()) && d.getAssunzione().getYear()==(LocalDate.now().getYear())).collect(Collectors.toList());
    }

    public void contaDipendenti(){
        int count= 0;
        try(FileInputStream fi= new FileInputStream(path);
        ObjectInputStream oi= new ObjectInputStream(fi)){
            ArrayList<Dipendente> lista= (ArrayList<Dipendente>) oi.readObject();
            for(Dipendente d: lista)
                count++;
            System.out.println("Numero dipendenti: "+count);
            lista.forEach(System.out::println);
        } catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Azienda{" +
                "listaDipendenti=" + listaDipendenti +
                ", listaCollaboratori=" + listaCollaboratori +
                ", listaFatture=" + listaFatture +
                ", listaContatti=" + listaContatti +
                ", listaOrdini=" + listaOrdini +
                ", path='" + path + '\'' +
                '}';
    }
}
