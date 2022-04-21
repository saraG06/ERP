package it.unikey;

import it.unikey.Enum.Risorse;
import it.unikey.Enum.Ruoli;
import it.unikey.persone.Collaboratore;
import it.unikey.persone.Contatto;
import it.unikey.persone.Dipendente;
import it.unikey.persone.Operatore;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Azienda {

    ArrayList<Collaboratore> collaboratori ;
    ArrayList<Dipendente> dipendenti ;
    ArrayList<Cliente> clienti ;
    ArrayList<Fattura> fatture ;
    ArrayList<Ordine> ordini ;

    public int numDipendenti(){
        return this.dipendenti.size() ;
    }

    public Fattura generaFattura(/*Ordine o,*/ Operatore p){
//        trovi LIsta Ordini Operatore p
//                scegli un ordine
//                prendi la lista contatti di azienda associata all ordine
//                scegli il contatto
//                crei fattura
        Scanner sc = new Scanner(System.in) ;
        List<Ordine> ordiniP = ordini.stream().filter(o -> o.getOper().equals(p)).collect(Collectors.toList());
        System.out.println("scegli ordine");
        ordiniP.forEach(System.out::println) ;
        int i = sc.nextInt() ;
        Ordine o = ordiniP.get(i-1) ;

            System.out.println("scegli contatto");
            o.getCliente().getContatti().forEach(System.out::println);
            sc = new Scanner(System.in) ;
            i = sc.nextInt() ;
            Contatto c = o.getCliente().getContatti().get(i-1) ;
//            System.out.println("inserisci data");
//            sc = new Scanner(System.in) ;
//            String data = sc.nextLine() ;
//            return new Fattura(data,o,c) ;
            return new Fattura(LocalDate.now().toString(),o,c) ;

    }

    public List<Fattura> fattureCliente(Contatto c){
       int count = 0;

       while(count < clienti.size()){
           if (clienti.get(count).hasContatto(c))
               break;

           count++;
       }
       int finalCount = count;
        return fatture.stream().filter(f -> f.getOrdine().getCliente().equals(clienti.get(finalCount))).collect(Collectors.toList());
    }

    /*public void assegnoRisorse(){

    }*/

    public List<Dipendente> getOperators() {
        return  dipendenti.stream().filter(d -> d.getRuolo().equals(Ruoli.OPERATOR)).collect(Collectors.toList());
    }

    public  List<Cliente> getClientiContMagg10(){
        return clienti.stream().filter(c -> c.getContatti().size()>10).collect(Collectors.toList());
    }

    public List<Dipendente> getDipendenteMacchina() {
        return  dipendenti.stream().filter(d -> d.getRisorse().contains(Risorse.MACCHINA)).collect(Collectors.toList());
    }

    public List<Fattura> getFattureDopo2019(){
        return  fatture.stream().filter(f -> f.getData().isAfter(LocalDate.parse("2019-12-31"))).collect(Collectors.toList());
    }

    public List<Fattura> getFattureReply(){
        return  fatture.stream().filter(f -> f.getOrdine().getCliente().getNome().equalsIgnoreCase("reply")).collect(Collectors.toList());
    }
}
