package it.unikey;

import java.time.LocalDate;
import java.util.List;

public class Contact {
    private int code;
    private String name;
    private String surname;
    private LocalDate birth;

    private static int id = 0;

    public Contact(String name, String surname, String birth) {
        this.code = ++id;
        this.name = name;
        this.surname = surname;
        this.birth = LocalDate.parse(birth);
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public List<Invoice> getClientInvoices(Client cl) {
        if (cl.getContacts().contains(Contact.this)) {
            return cl.getInvoices();
        }
        else {
            System.out.println("Questo Contatto non fa parte dell'azienda");
            return null;
        }
    }

    @Override
    public String toString() {
        return code + " " + name + " " + surname + " " + birth;
    }


}
