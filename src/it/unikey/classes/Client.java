package it.unikey.classes;

import java.util.ArrayList;

public class Client {

    private int code;
    private static int count = 0;
    private String name;
    private String IVA;
    private ArrayList<Contact> contacts;
    private ArrayList<Order> orders;
    private ArrayList<Invoice> invoices;

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Client( String name, String IVA) {
        this.code = count++;
        this.name = name;
        this.IVA = IVA;
        this.contacts = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.invoices = new ArrayList<>();
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
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

    public String getIVA() {
        return IVA;
    }

    public void setIVA(String IVA) {
        this.IVA = IVA;
    }

    public ArrayList<Invoice> getAllInvoicesByContact(Contact c) {
        for(Contact c1 : contacts) {
            if(c1.getCode()==c.getCode()){
                return invoices;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", IVA='" + IVA + '\'' +
                ", contacts=" + contacts +
                ", orders=" + orders +
                ", invoices=" + invoices +
                '}';
    }
}
