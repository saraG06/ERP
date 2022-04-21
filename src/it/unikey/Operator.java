package it.unikey;

import java.time.LocalDate;

public interface Operator {

    default Invoice generateInvoice(Order o,Contact c){
        return new Invoice(LocalDate.now().toString(),o,c);
    }
}
