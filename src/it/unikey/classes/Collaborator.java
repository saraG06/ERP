package it.unikey.classes;

public class Collaborator extends Worker {

    public Collaborator( String firstName, String lastName, int year, int month, int day, int assignedResource) {
        super( firstName, lastName, year, month, day, assignedResource);
    }

    @Override
    public String toString() {
        return "Collaborator{} " + super.toString();
    }
}
