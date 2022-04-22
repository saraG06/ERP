package it.unikey;

import java.time.LocalDate;

public interface Operator {

    default Invoice generateInvoice(Order o,Contact contact,Company c){
        Invoice i = new Invoice(LocalDate.now().toString(),o,contact);
        c.getInvoices().add(i);
        return i;
    }
}
