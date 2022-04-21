package classes;

import resources.AssignedResources;

import java.time.LocalDate;

public abstract class Worker {

    private int code;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private AssignedResources assignedResources = AssignedResources.NONE;

    public Worker(int code, String firstName, String lastName, int year, int month, int day, int assignedResources) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);
        setAssignedResources(assignedResources);
    }

    public Worker(int code, String firstName, String lastName, int year, int month, int day) {
        this.code = code;
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

    public void insertOrder(Client c, String detail, int year, int month, int day, double price) {

        Order o = new Order(detail, year, month, day, price);
        c.getOrders().add(o);



    }

    public void newInvoice(Client c, Order order, int year, int month, int day) {
        Invoice i = new Invoice(year, month, day);
        i.setOrder(order);
        c.getInvoices().add(i);

    }





}
