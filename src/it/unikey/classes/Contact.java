package it.unikey.classes;

import java.time.LocalDate;

public class Contact {

    private int code;
    private static int count = 0;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;


    public Contact( String firstName, String lastName, int year, int month, int day) {
        this.code = count++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = LocalDate.of(year, month, day);

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "code=" + code +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
