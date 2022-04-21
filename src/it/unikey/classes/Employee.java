package it.unikey.classes;

import it.unikey.resources.Role;

import java.time.LocalDate;

public class Employee extends Worker{

    private LocalDate hiringDate;
    private Role role;


    public Employee( String firstName, String lastName, int year, int month, int day,
                    int year1, int month1, int day1, int role) {
        super(firstName, lastName, year, month, day);

        this.hiringDate = LocalDate.of(year1, month1, day1);
        setRole(role);

    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(int role) {

        for(Role r : Role.values()){
            if(r.getValue() == role){
                this.role = r;
            }
        }
    }

    public void assignResources(int resource, Employee e) {
        if(Employee.this.getRole().getValue() > e.getRole().getValue()) {

            e.setAssignedResources(resource);

        }
        else if(Employee.this.getRole().getValue()==1 && e.getRole().getValue()==1){

            e.setAssignedResources(resource);

        }
        else{
            System.out.println("You cannot assign the requested resource");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "hiringDate=" + hiringDate +
                ", role=" + role +
                "} " + super.toString();
    }
}
