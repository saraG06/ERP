package it.unikey.classes;

import it.unikey.resources.AssignedResources;

import java.time.LocalDate;

public abstract class Worker {

    private int code;
    private static int count = 0;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private AssignedResources assignedResources = AssignedResources.NONE;

    public Worker( String firstName, String lastName, int year, int month, int day, int assignedResources) {
        this.code = count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
        setAssignedResources(assignedResources);
    }

    public Worker( String firstName, String lastName, int year, int month, int day) {
        this.code = count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);

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

    public AssignedResources getAssignedResources() {
        return assignedResources;
    }

    public void setAssignedResources(int value) {
        for(AssignedResources ar : AssignedResources.values()){
            if(ar.getValue() == value){
                this.assignedResources = ar;
            }
        }
    }

    public Order insertOrder(Client c, String detail, int year, int month, int day, double price) {

        Order o = new Order(detail, year, month, day, price);
        c.getOrders().add(o);
        o.associateClient(c);
        o.associateWorker(Worker.this);
        return o;



    }

    public void newInvoice(Client c, Order order, int year, int month, int day, Contact co) {
        Invoice i = new Invoice(year, month, day);
        i.setOrder(order);
        for (int j = 0; j < c.getContacts().size(); j++) {
            if(c.getContacts().get(j) == co){
                i.setContact(co);
                c.getInvoices().add(i);
            }else{
                System.out.println("Contact not present in clientList");
            }

        }


    }

    @Override
    public String toString() {
        return "Worker{" +
                "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", assignedResources=" + assignedResources +
                '}';
    }
}
