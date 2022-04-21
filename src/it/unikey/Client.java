package it.unikey;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private int code;
    private String name;
    private String partitaIVA;
    private List<Contact> contacts;
    private List<Invoice> invoices;
    private List<Order> orders;

    private static int id = 0;

    public Client(String name, String partitaIVA) {
        this.code = ++id;
        this.name = name;
        this.partitaIVA = partitaIVA;
        this.contacts = new ArrayList<>();
        this.invoices = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartitaIVA() {
        return partitaIVA;
    }

    public void setPartitaIVA(String partitaIVA) {
        this.partitaIVA = partitaIVA;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void moreThan10(){
        if(Client.this.getContacts().size() >= 10){
            System.out.println("Questa azienda ha più di 10 contatti");
        }
        else{
            System.out.println("Questa azienda ha meno di 10 contatti");
        }
    }
    @Override
    public String toString() {
        return code + " " + name + " " + partitaIVA;
    }
}
