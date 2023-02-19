package org.example.model;

public class Manager extends Staff {
    public Manager() {
    }

    public Manager(Long id, String name, String address, Integer age, String email) {
        super(id, name, address, age, email);
    }
}
