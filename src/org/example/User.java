package org.example;

public class User implements Comparable {
    String phoneNumber;
    String name;

    public User(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        return phoneNumber.compareTo(((User)o).phoneNumber);
    }

    public String toString() {
        return phoneNumber + "; " + name;
    }
}
