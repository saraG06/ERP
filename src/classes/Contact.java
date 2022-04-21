package classes;

import java.sql.SQLOutput;
import java.time.LocalDate;

public class Contact {

    private int code;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private Client client;

    public Contact(int code, String firstName, String lastName, int year, int month, int day) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public void seeInvoices(){
        for(Invoice i : Contact.this.client.getInvoices()){
            System.out.println(i);
        }
    }

}
