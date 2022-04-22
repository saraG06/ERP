package it.unikey;
import it.unikey.classes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Employee e1 = new Employee("Catello", "Palatucci", 1992, 11, 16,2019, 02, 05, 2);
        Employee e2 = new Employee("Martina", "Bove", 1998,03, 13,2018,03,20, 1);
        Employee e3 = new Employee("Clark", "Kasongo", 1997, 02, 14, 2018, 02,15, 1);
        Employee e4 = new Employee("Gabriele", "Marabitti", 1994, 07,07, 2021, 01,01, 3);

        e2.assignResources(1, e4);
        e2.assignResources(1, e1);

        Collaborator c1 = new Collaborator("Gabriele", "Samoila", 2002,11,25,1);
        Collaborator c2 = new Collaborator("Matteo", "Cipolla", 2002,01,24,2);

        Client cl1 = new Client("Unikey", "474899813");
        Client cl2 = new Client("Elis", "825985686690");
        Client cl3 = new Client("Generation", "7683823640");
        Client cl4 = new Client("Reply", "0420482811");

        Contact co1 = new Contact("Rinaldo", "Augelli",1978, 06, 07);
        Contact co2 = new Contact("Chiara", "Picchi", 1995, 12, 30);
        Contact co3 = new Contact("Fernando", "DaLoyola", 1980, 04,13);
        Contact co4 = new Contact("Pippo", "Sowlo", 1990, 12, 25);
        Contact co5 = new Contact("Stefano", "Ricci", 1988,07, 14);
        Contact co6 = new Contact("Tiziano", "Padovani", 1992,10, 22);
        Contact co7 = new Contact ("Maria", "Polli", 1996,02,07);
        Contact co8 = new Contact("Giulia", "Sacchi", 2000, 12, 12);
        Contact co9 = new Contact("Luca", "Tacco", 1990, 11, 30);
        Contact co10 = new Contact("Giovanni", "Lise", 1998, 10, 02);
        Contact co11 = new Contact("Pia", "Livorni", 1996, 02, 10);
        Contact co12 = new Contact("Paolo","Mellino", 1987, 11, 20);
        Contact co13 = new Contact("Maria","Funaro", 1995, 07, 14);
        Contact co14 = new Contact("Assunta","Lavarro", 1998, 03, 05);
        Contact co15 = new Contact("Anna","Mena", 1991, 04, 20);
        Contact co16 = new Contact("Germano","Pistone", 1992, 10, 14);
        Contact co17 = new Contact("Filippo","Beddani", 1986, 05, 22);
        Contact co18 = new Contact("Giorgia","Ternana", 1999, 07, 14);
        Contact co19 = new Contact("Maddalena","Zingaroni", 1994, 11, 18);
        Contact co20 = new Contact("Patrizio","De Angelis", 1992, 03, 20);

        cl1.addContact(co1);
        cl1.addContact(co2);
        cl1.addContact(co3);
        cl1.addContact(co4);
        cl1.addContact(co5);
        cl1.addContact(co6);
        cl1.addContact(co7);
        cl1.addContact(co8);
        cl1.addContact(co9);
        cl1.addContact(co10);
        cl1.addContact(co11);
        cl4.addContact(co12);
        cl4.addContact(co13);

        Order o1 = e1.insertOrder(cl1,"Consulenza", 2022,01,20,50000.00);
        Order o2 = e3.insertOrder(cl1, "Consulenza", 2021, 02, 03, 45000.00);

        Order o3 = e2.insertOrder(cl4,"Consulenza", 2020 ,07,13, 76000);
        Order o4 = e2.insertOrder(cl4, "Consulenza", 2021, 01,05, 88000);

        Order o5 = e1.insertOrder(cl2, "Consulenza", 2020, 11, 05, 79000);



        e3.newInvoice(cl1,o1,2022, 02,01, co1);
        e1.newInvoice(cl1, o2,2021 ,11, 07, co1);
        e2.newInvoice(cl4, o3, 2018,07,15,co12);
        e2.newInvoice(cl4, o4, 2021,06,01, co13);

        ArrayList<Invoice> invUnikey = cl1.getAllInvoicesByContact(co1);
        //invUnikey.forEach(System.out::println);

        //Streams.getClients().forEach(System.out::println);

        Streams.clientsGreater10().forEach((System.out::println));
        Streams.replyInvoices().forEach(System.out::println);
        Streams.employeeWithCar().forEach(System.out::println);
        Streams.invoicesBefore2019().forEach(System.out::println);
        Streams.ordersWithNoInvoice().forEach(System.out::println);









    }

}
