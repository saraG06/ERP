package it.unikey;

import java.time.LocalDate;

public class Employee implements Operator{
    private int code;
    private String name;
    private String surname;
    private LocalDate birth;
    private Resources resource;
    private LocalDate dateOfEmployment;
    private Roles role;
    private Client client;
    private static int id = 0;

    public Employee(String name, String surname, String birth, String dateOfEmployment, String role, Client c) {
        this.code = ++id;
        this.name = name;
        this.surname = surname;
        this.birth = LocalDate.parse(birth);
        this.dateOfEmployment = LocalDate.parse(dateOfEmployment);
        this.role = Roles.valueOf(role.toUpperCase());
        this.client = c;
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

    public Resources getResource() {
        return resource;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setResource(String resource) {
        this.resource = Resources.valueOf(resource.toUpperCase());
    }

    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(LocalDate dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Roles getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = Roles.valueOf(role.toUpperCase());
    }

    public void assignResourceToSubordinate(Employee e, String resource){
        if(this.getRole().getValue() > e.getRole().getValue() && this.getClient().equals(e.getClient())){
            e.setResource(resource);
        }
        else if (this.getRole().getValue() == 3 && this.getClient().equals(e.getClient())){
            e.setResource(resource);
        }
        else {
            System.out.println("Questo dipendente non può assegnare risorse");
        }
    }

    @Override
    public String toString() {
        return  code + " " + name + " " + surname + " " + birth + " "
                + resource + " " + dateOfEmployment + " " + role.name();
    }
}
