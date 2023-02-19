package org.example.model;

import org.example.enums.CashierStatus;
import org.example.enums.Qualification;

public class Cashier extends Staff{

    private CashierStatus status;

    private Qualification qualification;

    public Cashier(Long id, String name, String address, Integer age, String email) {
        super(id, name, address, age, email);
    }

    public Cashier() {
    }

    public CashierStatus getStatus() {
        return status;
    }

    public void setStatus(CashierStatus status) {
        this.status = status;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }


    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", age=" + getAge() +
                ", email='" + getEmail() + '\'' +
                ", status=" + status +
                ", qualification=" + qualification +
                '}';
    }
}
