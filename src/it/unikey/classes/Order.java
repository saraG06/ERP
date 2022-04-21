package it.unikey.classes;

import java.time.LocalDate;

public class Order {

    private int code;
    private static int count;
    private String detail;
    private LocalDate date;
    private double price;
    private Worker worker;
    private Client client;

    public Order(String detail, int year, int month, int day, double price) {
        this.code = count++;
        this.detail = detail;
        this.date = LocalDate.of(year, month, day);
        this.price = price;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
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

    public void associateWorker(Worker w) {
        worker = w;
    }

    public void associateClient(Client c) {
        client = c;
    }

    @Override
    public String toString() {
        return "Order{" +
                "code=" + code +
                ", detail='" + detail + '\'' +
                ", date=" + date +
                ", price=" + price +
                '}';
    }
}
