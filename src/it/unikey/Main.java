package it.unikey;

import it.unikey.Enum.Risorse;
import it.unikey.persone.Collaboratore;
import it.unikey.persone.Contatto;
import it.unikey.persone.Dipendente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String pathfile = "ERP/Resources/Dipendenti";

    public static void main(String[] args) {
        Contatto contact1 = new Contatto("Matteo", "Samoila","2002-11-25");
        Contatto contact2 = new Contatto("Luigi", "Neri","1958-10-31");
        Contatto contact3 = new Contatto("Matteo", "Fabio","1959-10-30");
        Contatto contact4 = new Contatto("Mario", "Mori","1965-06-07");
        Contatto contact5 = new Contatto("Giacinta", "Rosa","1966-09-26");
        Contatto contact6 = new Contatto("Fabio", "Matteo","1968-02-01");
        Contatto contact7 = new Contatto("Giovanni", "Rossi","1972-08-28");
        Contatto contact8 = new Contatto("Stefano", "Di Matteo","1987-04-24");
        Contatto contact9 = new Contatto("Patello", "Calatucci","1995-12-21");
        Contatto contact10 = new Contatto("Piziano", "Tadovani","1997-06-12");
        Contatto contact11 = new Contatto("Bruno", "Mars","1999-10-28");

        Collaboratore collaborator1 = new Collaboratore("Giggio", "Donnarumma" , "1982-11-12");
        Collaboratore collaborator2 = new Collaboratore("Gian", "Franco" , "1989-07-03");
        Collaboratore collaborator3 = new Collaboratore("Camillo", "Benson" , "1997-09-16");

        Cliente client1 = new Cliente("Unikey","00000000001");

        Dipendente dipendente1 = new Dipendente("Janice","Gentry", "1955-09-20","2018-03-02","operator");
        Dipendente dipendente2 = new Dipendente("Ayub","Bateman", "1956-08-29","2018-11-29","manager");
        Dipendente dipendente3 = new Dipendente("Mateusz","Goulding", "1968-12-03","2020-06-19","projectmanager");
        Dipendente dipendente4 = new Dipendente("Dougie","Berry", "1980-10-01","2021-03-19","manager");
        Ordine ordine1 = new Ordine("2022-04-21",2.50 , "primo ordine",dipendente1, client1);
        Ordine ordine2 = new Ordine("2019-04-21", 7.45, "terzo ordine",collaborator1, client1);

        Cliente client2 = new Cliente("Reply","00000000002");

        Dipendente dipendente5 = new Dipendente("Ira","Mcguire", "1957-07-02","2020-03-19","operator");
        Dipendente dipendente6 = new Dipendente("Amiee","Strickland", "1970-02-10","2020-08-13","projectmanager");
        Dipendente dipendente7 = new Dipendente("Asiyah","Hollis", "1991-03-14","2021-09-10","manager");
        Ordine ordine3 = new Ordine("2021-04-21", 8.90, "sesto ordine",dipendente6, client2);
        Ordine ordine4 = new Ordine("2018-04-21", 6.30, "secondo ordine" ,collaborator2, client2);

        Cliente client3 = new Cliente("ENI","00000000003");

        Dipendente employee4 = new Dipendente("Kiefer","Flower", "1959-09-15","2020-05-18","operator");
        Dipendente employee7 = new Dipendente("Hollie","Mill", "1975-10-15","2020-10-06","projectmanager");
        Dipendente employee10 = new Dipendente("Seb","Sierra", "1992-01-16","2022-04-07","manager");
        Ordine ordine5 = new Ordine("2020-04-21", 4.45, "quarto ordine",employee10, client3);
        Ordine ordine6 = new Ordine("2017-04-21", 2.50, "quinto ordine",collaborator3, client3);

        client1.getContatti().add(contact1);
        client1.getContatti().add(contact2);
        client1.getContatti().add(contact3);
        client1.getContatti().add(contact4);
        client1.getContatti().add(contact5);
        client1.getContatti().add(contact6);
        client1.getContatti().add(contact7);
        client1.getContatti().add(contact8);
        client1.getContatti().add(contact9);
        client1.getContatti().add(contact10);
        client2.getContatti().add(contact1);
        client2.getContatti().add(contact2);
        client2.getContatti().add(contact3);
        client3.getContatti().add(contact1);
        client3.getContatti().add(contact2);
        client3.getContatti().add(contact3);

        Azienda a = new Azienda() ;

        a.dipendenti.add(dipendente1);
        a.dipendenti.add(dipendente2);
        a.dipendenti.add(dipendente3);
        a.dipendenti.add(dipendente4);
        a.dipendenti.add(dipendente5);
        a.dipendenti.add(dipendente6);
        a.dipendenti.add(dipendente7);

        a.collaboratori.add(collaborator1);
        a.collaboratori.add(collaborator2);
        a.collaboratori.add(collaborator3);

        a.clienti.add(client1);
        a.clienti.add(client2);
        a.clienti.add(client3);

        a.ordini.add(ordine1);
        a.ordini.add(ordine2);
        a.ordini.add(ordine3);
        a.ordini.add(ordine4);
        a.ordini.add(ordine5);
        a.ordini.add(ordine6);


        /*a.generaFattura(dipendente1);
        System.out.println(a.getOrdineNoFatture());

        dipendente6.assegnaRisorsa(dipendente3, Risorse.PC);*/


        a.salvaDipendenti();
        a.dipendenti.forEach(System.out::println);
    }
}
