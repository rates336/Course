package com.kodilla.library;

import java.util.Objects;

public class LibraryUser {
    String firstName;
    String lastName;
    String peselID;

    public LibraryUser(String firstName, String lastName, String peselID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.peselID = peselID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPeselID(String peselID) {
        this.peselID = peselID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPeselID() {
        return peselID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        LibraryUser that = (LibraryUser) o;
        return firstName.equals(that.firstName) &&
                lastName.equals(that.lastName) &&
                peselID.equals(that.peselID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, peselID);
    }
}
