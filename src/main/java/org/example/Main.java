package org.example;

import org.example.enums.Qualification;
import org.example.model.Cashier;
import org.example.model.Manager;
import org.example.serviceImpl.ManagerServiceImpl;

public class Main {
    public static void main(String[] args) {

        Cashier cashier = new Cashier();
        cashier.setId(1l);
        cashier.setEmail("lawal@gmail.com");
        cashier.setName("Monsaw");
        cashier.setQualification(Qualification.FIRST_CLASS);
        cashier.setAge(10);
        cashier.setAddress("soka");

        Manager manager = new Manager(1l, "Idris","Soka, Ibadan", 23, "example.com");
        ManagerServiceImpl manager1 = new ManagerServiceImpl(manager);


        Cashier cashier1  = manager1.hireCashier(cashier);
        System.out.println(cashier1);


        System.out.println("Hello world!");
    }
}