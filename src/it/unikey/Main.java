package it.unikey;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Contact contact1 = new Contact("Matteo", "Samoila","2002-11-25");
        Contact contact2 = new Contact("Luigi", "Neri","1958-10-31");
        Contact contact3 = new Contact("Matteo", "Fabio","1959-10-30");
        Contact contact4 = new Contact("Mario", "Mori","1965-06-07");
        Contact contact5 = new Contact("Giacinta", "Rosa","1966-09-26");
        Contact contact6 = new Contact("Fabio", "Matteo","1968-02-01");
        Contact contact7 = new Contact("Giovanni", "Rossi","1972-08-28");
        Contact contact8 = new Contact("Stefano", "Di Matteo","1987-04-24");
        Contact contact9 = new Contact("Patello", "Calatucci","1995-12-21");
        Contact contact10 = new Contact("Piziano", "Tadovani","1997-06-12");
        Contact contact11 = new Contact("Bruno", "Mars","1999-10-28");

        Collaborator collaborator1 = new Collaborator("Giggio", "Donnarumma" , "1982-11-12", "car");
        Collaborator collaborator2 = new Collaborator("Gian", "Franco" , "1989-07-03", "pc");
        Collaborator collaborator3 = new Collaborator("Camillo", "Benson" , "1997-09-16", "phone");

        Client client1 = new Client("Unikey","00000000001");

        Employee employee1 = new Employee("Janice","Gentry", "1955-09-20","2018-03-02","operator", client1);
        Employee employee2 = new Employee("Ayub","Bateman", "1956-08-29","2018-11-29","manager", client1);
        Employee employee5 = new Employee("Mateusz","Goulding", "1968-12-03","2020-06-19","projectmanager", client1);
        Employee employee8 = new Employee("Dougie","Berry", "1980-10-01","2021-03-19","manager", client1);
        Order order1 = new Order("primo ordine", "2022-04-21", 2.50 ,employee1, client1);
        Order order4 = new Order("quarto ordine", "2019-04-21", 5.50 ,collaborator1, client1);

        Client client2 = new Client("Reply","00000000002");

        Employee employee3 = new Employee("Ira","Mcguire", "1957-07-02","2020-03-19","operator", client2);
        Employee employee6 = new Employee("Amiee","Strickland", "1970-02-10","2020-08-13","projectmanager", client2);
        Employee employee9 = new Employee("Asiyah","Hollis", "1991-03-14","2021-09-10","manager", client2);
        Order order2 = new Order("secondo ordine", "2021-04-21", 3.50 ,employee6, client2);
        Order order5 = new Order("quinto ordine", "2018-04-21", 6.50 ,collaborator2, client2);

        Client client3 = new Client("ENI","00000000003");

        Employee employee4 = new Employee("Kiefer","Flower", "1959-09-15","2020-05-18","operator", client3);
        Employee employee7 = new Employee("Hollie","Mill", "1975-10-15","2020-10-06","projectmanager", client3);
        Employee employee10 = new Employee("Seb","Sierra", "1992-01-16","2022-04-07","manager", client3);
        Order order3 = new Order("terzo ordine", "2020-04-21", 4.50 ,employee10, client3);
        Order order6 = new Order("sesto ordine", "2017-04-21", 7.50 ,collaborator3, client3);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        clients.add(client2);
        clients.add(client3);

        Invoice i1 = employee3.generateInvoice(order2, contact1);
        Invoice i2 = employee2.generateInvoice(order1, contact2);
        Invoice i3 = employee4.generateInvoice(order6, contact7);

        client1.getContacts().add(contact1);
        client1.getContacts().add(contact2);
        client1.getContacts().add(contact3);
        client1.getContacts().add(contact4);
        client1.getContacts().add(contact5);
        client1.getContacts().add(contact6);
        client1.getContacts().add(contact7);
        client1.getContacts().add(contact8);
        client1.getContacts().add(contact9);
        client1.getContacts().add(contact10);
        client2.getContacts().add(contact1);
        client2.getContacts().add(contact2);
        client2.getContacts().add(contact3);
        client3.getContacts().add(contact1);
        client3.getContacts().add(contact2);
        client3.getContacts().add(contact3);

        client1.getEmployees().add(employee1);
        client1.getEmployees().add(employee2);
        client1.getEmployees().add(employee5);
        client1.getEmployees().add(employee8);

        client2.getEmployees().add(employee3);
        client2.getEmployees().add(employee6);
        client2.getEmployees().add(employee9);

        client3.getEmployees().add(employee4);
        client3.getEmployees().add(employee7);
        client3.getEmployees().add(employee10);

        employee2.assignResourceToSubordinate(employee1, "car");
        employee2.assignResourceToSubordinate(employee8, "car");
        employee10.assignResourceToSubordinate(employee10, "car");

        for(Client c : clients){
           // c.moreThan10();
           // c.invoicesReply();
           // c.carOwnerEmployees();
           // c.invoiceDateAfter("2019-12-31");
            c.orderWithoutInvoice();
        }

    }
}