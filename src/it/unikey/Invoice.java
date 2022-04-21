package it.unikey;

import java.time.LocalDate;

public class Invoice {
    private int code;
    private LocalDate date;
    private Order order;
    private Contact contact;
    private static int id = 0;

    public Invoice(String date, Order o, Contact c) {
        this.code = ++id;
        this.date = LocalDate.parse(date);
        this.order = o;
        this.contact = c;
    }

    public int getCode() {
        return code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return " " + code + " " + date + " " + order.getCode() + " " + contact;
    }
}
