package it.unikey;

import java.time.LocalDate;

public class Collaborator implements Operator{
    private int code;
    private String name;
    private String surname;
    private LocalDate birth;
    private Resources resource;

    private static int id = 0;

    public Collaborator( String name, String surname, String birth, String resource) {
        this.code = id++;
        this.name = name;
        this.surname = surname;
        this.birth = LocalDate.parse(birth);
        this.resource = Resources.valueOf(resource.toUpperCase());;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public Resources getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = Resources.valueOf(resource.toUpperCase());
    }

    @Override
    public String toString() {
        return code + '\'' + name + '\'' + surname + '\'' + birth + '\'' + resource.name();
    }
}
