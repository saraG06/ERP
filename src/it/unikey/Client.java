package it.unikey;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private int code;
    private String name;
    private String partitaIVA;
    private List<Contact> contacts;

    private static int id = 0;

    public Client(String name, String partitaIVA) {
        this.code = ++id;
        this.name = name;
        this.partitaIVA = partitaIVA;
        this.contacts = new ArrayList<>();
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

    @Override
    public String toString() {
        return code + " " + name + " " + partitaIVA;
    }
}
