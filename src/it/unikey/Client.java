package it.unikey;

import java.util.List;

public class Client {
    private String code;
    private String name;
    private String partitaIVA;
    private List<Contact> contacts;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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
        partitaIVA = partitaIVA;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    @Override
    public String toString() {
        return code + '\'' + name + '\'' + partitaIVA;
    }
}
