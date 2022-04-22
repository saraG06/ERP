package it.unikey;

import java.time.LocalDate;

public class Order {
    private int code;
    private String details;
    private LocalDate date;
    private double price;
    private Collaborator collaborator;
    private Client client;
    private Employee employee;

    private static int id = 0;

    public Order(String details, String date, double price, Collaborator c, Client cl){
        this.code = ++id;
        this.details = details;
        this.date = LocalDate.parse(date);
        this.price = price;
        this.collaborator = c;
        this.client = cl;
        this.employee = null;
    }
    public Order(String details, String date, double price, Employee e, Client cl){
        this.code = ++id;
        this.details = details;
        this.date = LocalDate.parse(date);
        this.price = price;
        this.client = cl;
        this.employee = e;
        this.collaborator = null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Collaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(Collaborator collaborator) {
        this.collaborator = collaborator;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void stampaConCollaborator(){
        System.out.println( code + " " + details + " " + date + " " + price
                + " " + client.getCode() +" " + collaborator.getCode());
    }
    @Override
    public String toString() {
        return code + " " + details + " " + date + " " + price
                + " " + client.getCode() + " " + employee.getCode();
    }
}
