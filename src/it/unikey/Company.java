package it.unikey;

import java.io.FileWriter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company implements Serializable {
    private String name;
    private List<Client> clients;
    private List<Invoice> invoices;
    private List<Order> orders;

    private List<Employee> employees;

    public Company(String name){
        this.name = name;
        this.clients = new ArrayList<>();
        this.invoices = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.employees = new ArrayList<>();
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
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

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void moreThan10() {
        for (Client c : this.getClients()) {
            if (c.getContacts().size() >= 10){
                System.out.println("Il contatto " +c.getName() + " di " + this.getName() + " ha almeno 10 contatti");
            }
        }
    }
    public void invoicesReply() {
        for (Client c : this.getClients()) {
            if (c.getName().equals("Reply")) {
                System.out.println(this.getInvoices());
            }
        }
    }

    public void carOwnerEmployees(){
        for (Employee e : this.getEmployees()) {
            try{
                if(e.getResource().getValue() == 1){
                    System.out.println(e);
                }
            } catch(NullPointerException n){
                continue;
            }

        }
    }

    public void invoiceDateAfter(String data){
        for(Invoice i : this.getInvoices()){
            if (i.getDate().compareTo(LocalDate.parse(data)) > 0){
                System.out.println(i);
            }
        }
    }

    public void orderWithoutInvoice() {
        for (Order o : this.getOrders()) {
            for (Invoice i : this.getInvoices()) {
                if (!o.equals(i.getOrder())) {
                    if (o.getCollaborator() != null) {
                        o.stampaConCollaborator();
                    } else {
                        System.out.println(o);
                    }
                }
            }
        }
    }
    public void employeeHiredLastMonth(){
        for (Employee e : this.getEmployees()){
            if(e.getDateOfEmployment().compareTo(LocalDate.now().minusDays(30)) > 0){
                System.out.println(e);
            }
        }
    }

    public void countEmployees(){

    }
}
