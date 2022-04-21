package it.unikey;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Unikey","00000000001");
        Client client2 = new Client("Reply","00000000002");
        Client client3 = new Client("ENI","00000000003");

        Contact contact1 = new Contact("Matteo", "Samoila","2002-11-25");
        Contact contact2 = new Contact("Luigi", "Neri","1958-10-31");
        Contact contact3 = new Contact("Matteo", "Fabio","1959-10-30");
        Contact contact4 = new Contact("Mario", "Mori","1965-06-07");
        Contact contact5 = new Contact("Giacinta", "Rosa","1966-09-26");
        Contact contact6 = new Contact("Fabio", "Matteo","1968-02-01");
        Contact contact7 = new Contact("Giovanni", "Rossi","1972-08-28");
        Contact contact8 = new Contact("Stefano", "Di Matteo","1987-04-24");
        Contact contact9 = new Contact("Patello", "Calatucci","1995-12-21");
        Contact contact10 = new Contact("Piziano", "Tadovani","1997-06-12");
        Contact contact11 = new Contact("Bruno", "Mars","1999-10-28");

        Employee employee1 = new Employee("Janice","Gentry", "1955-09-20","2018-03-02","operator");
        Employee employee2 = new Employee("Ayub","Bateman", "1956-08-29","2018-11-29","operator");
        Employee employee3 = new Employee("Ira","Mcguire", "1957-07-02","2020-03-19","operator");
        Employee employee4 = new Employee("Kiefer","Flower", "1959-09-15","2020-05-18","operator");
        Employee employee5 = new Employee("Mateusz","Goulding", "1968-12-03","2020-06-19","projectmanager");
        Employee employee6 = new Employee("Amiee","Strickland", "1970-02-10","2020-08-13","projectmanager");
        Employee employee7 = new Employee("Hollie","Mill", "1975-10-15","2020-10-06","projectmanager");
        Employee employee8 = new Employee("Dougie","Berry", "1980-10-01","2021-03-19","manager");
        Employee employee9 = new Employee("Asiyah","Hollis", "1991-03-14","2021-09-10","manager");
        Employee employee10 = new Employee("Seb","Sierra", "1992-01-16","2022-04-07","manager");

    }
}
