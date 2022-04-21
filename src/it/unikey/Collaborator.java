package it.unikey;

import java.time.LocalDate;

public class Collaborator {
    private String code;
    private String name;
    private String surname;
    private LocalDate birth;
    private Resources resource;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
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

    public void setResource(Resources resource) {
        this.resource = resource;
    }

    @Override
    public String toString() {
        return code + '\'' + name + '\'' + surname + '\'' + birth + '\'' + resource.name();
    }
}
