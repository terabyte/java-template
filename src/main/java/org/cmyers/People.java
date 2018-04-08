package org.cmyers;

public enum People {
    CMYERS("Carl", "Myers"),
    ;

    private final String firstName;
    private final String lastName;

    People(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}

