package classes;

import java.time.LocalDate;

public class Invoice {

    private int code;
    private static int count;
    private LocalDate date;
    private Order order;
    private Contact contact;

    public Invoice(int year, int month, int day) {

        this.code =count ++;
        this.date = LocalDate.of(year, month, day);
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    private void associateOrder(Order o) {

        order = o;

    }

    private void associateContact(Contact c) {

        contact = c;
    }

}
