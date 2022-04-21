package it.unikey;

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
        this.code = id++;
        this.name = name;
        this.partitaIVA = partitaIVA;
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

    @Override
    public String toString() {
        return code + '\'' + name + '\'' + partitaIVA;
    }
}
