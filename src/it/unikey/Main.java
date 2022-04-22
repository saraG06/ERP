package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Azienda a= new Azienda();

        Cliente cliente1= new Cliente("AKA Industries", "123456");

        Contatto contatto1= new Contatto("Mario", "Rossi", LocalDate.of(1986, 4, 25), cliente1);
        a.getListaContatti().add(contatto1);

        Contatto contatto2= new Contatto("Franco", "Verdi", LocalDate.of(1978, 7, 1), cliente1);
        a.getListaContatti().add(contatto2);

        Dipendente operator= new Dipendente("Matteo", "Di Stefano", LocalDate.of(2001, 1, 3), LocalDate.of(2010, 7, 23), "OPERATOR");
        a.aggiungiDipendente(operator);

        Dipendente manager= new Dipendente("Andrea", "Scaffidi", LocalDate.of(1997, 6, 21), LocalDate.of(2004, 8, 21), "MANAGER");
        a.aggiungiDipendente(manager);

        Ordine ordine1= new Ordine("Workspace1", LocalDate.of(2016, 5, 12), operator, cliente1);
        a.getListaOrdini().add(ordine1);

        System.out.println("A partire da un operatore (dipendete o collaboratore) si deve poter inserire un ordine e generare una fattura");
        Fattura fattura= operator.generaFattura(ordine1, contatto1);
        a.getListaFatture().add(fattura);
        System.out.println(fattura);

        System.out.println("\nA partire da un contatto si deve poter consultare le fatture a carico della propria societa (il cliente)");
        contatto1.cercaFatture(a.getListaFatture()).forEach(System.out::println);

        System.out.println("\nA partire da un dipendente si deve poter assegnare una risorsa a un qualsiasi dipendente con ruolo inferiore, eccezione per il ruolo");
        Risorsa risorsa= new Risorsa("MACCHINA");
        manager.assegnaRisorse(risorsa, operator);
        operator.assegnaRisorse(risorsa, manager);   //errore

        System.out.println("\nTrovare i clienti che hanno piu di 10 persone all'interno dei loro contatti ");
        a.clienti10Contatti().forEach(System.out::println);

        System.out.println("\nTrovare tutte le fatture che hanno come cliente \"Reply\"");
        Cliente cliente2= new Cliente("Reply", "1273641");
        Contatto contatto3= new Contatto("Pippo", "Franco", LocalDate.of(1958, 2, 24), cliente2);
        a.getListaContatti().add(contatto3);
        Dipendente projectManager= new Dipendente("Leonardo", "Paolini", LocalDate.of(1999, 10, 21), LocalDate.of(2022, 4, 10), "PROJECTMANAGER");
        a.aggiungiDipendente(projectManager);
        Ordine ordine2= new Ordine("Final work", LocalDate.of(2017, 2, 17), projectManager, cliente2);
        a.getListaOrdini().add(ordine2);
        Fattura fattura2= projectManager.generaFattura(ordine2, contatto3);
        a.getListaFatture().add(fattura2);
        a.fattureReply().forEach(System.out::println);

        System.out.println("\nTrovare tutti i dipendenti che hanno un macchina assegnata");
        a.dipendentiMacchina().forEach(System.out::println);

        System.out.println("\nTrovare tutte le fatture emesse dopo la data 31/12/2019");
        a.fatture31122019().forEach(System.out::println);

        System.out.println("\nTrovare tutti gli ordini che non sono associati ancora a fatture");
        Ordine ordine3= new Ordine("Senza fattura", LocalDate.of(2018, 7, 8), projectManager, cliente2);
        a.getListaOrdini().add(ordine3);
        a.ordiniSenzaFattura().forEach(System.out::println);

        System.out.println("\nTrovare tutti gli operator che sono stati assunti nell'ultimo mese");
        a.ultimiAssunti().forEach(System.out::println);

        System.out.println("\nTrovare il numero di dipendenti totali dell'azienda");
        a.contaDipendenti();
    }
}
