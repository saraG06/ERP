package it.unikey;

import java.time.LocalDate;

public interface Operator {

    default Invoice generateInvoice(Order o,Contact c){
        Invoice i = new Invoice(LocalDate.now().toString(),o,c);
        o.getClient().getInvoices().add(i);
        return i;
    }
}
