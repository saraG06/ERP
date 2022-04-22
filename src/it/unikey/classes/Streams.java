package it.unikey.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {

    private static ArrayList<Employee> employees = new ArrayList<>();

    private static ArrayList<Order> orders = new ArrayList<>();

    public static ArrayList<Order> getOrders() {
        return orders;
    }

    public static ArrayList<Employee> getEmployees() {
        return employees;
    }

    private static ArrayList<Invoice> invoices = new ArrayList<>();

    public static ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    private static ArrayList<Client> clients = new ArrayList<>();

    public static ArrayList<Client> getClients() {
        return clients;
    }

    public static List<Client> clientsGreater10(){

        Predicate<Client> greater10 = c -> c.getContacts().size() > 10;
        List<Client> listgreater10 = clients.stream().filter(greater10).collect(Collectors.toList());
        return listgreater10;

    }

    public static List<Invoice> replyInvoices() {
        List<Invoice> replyList = invoices.stream().filter( i -> i.getOrder().getClient().getName().equals("Reply")).collect(Collectors.toList());
        return replyList;
    }

    public static List<Employee> employeeWithCar(){

        return employees.stream().filter (e -> e.getAssignedResources().getValue() == 1).collect(Collectors.toList());

    }

    public static List<Invoice> invoicesBefore2019(){

        LocalDate lineToCompare = LocalDate.of(2019,12,31);

        return invoices.stream().filter(i -> i.getDate().isAfter(lineToCompare)).collect(Collectors.toList());


    }

    public static List<Order> ordersWithNoInvoice(){

        Function<Invoice, Order> withInvoiceOrder = i -> i.getOrder();

        List<Order> withInvoiceOrders = invoices.stream().map(withInvoiceOrder).collect(Collectors.toList());


        Predicate<Order> withInvoice = o -> !withInvoiceOrders.contains(o);
        return orders.stream().filter(withInvoice).collect(Collectors.toList());

    }


}
