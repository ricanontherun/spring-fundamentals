package com.ricanontherun.model;

public class Customer {
    private String firstName;
    private String lastName;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * @param firstName the firstName to set
     */
    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * @return String
     */
    public String getFullName() {
        return String.format("%s %s", getFirstName(), getLastName());
    }
}