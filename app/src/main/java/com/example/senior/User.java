package com.example.senior;

import java.io.Serializable;

public class User implements Serializable {

    private String Name;
    private String Address;

    public User(String name, String address) {
        Name = name;
        Address = address;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
