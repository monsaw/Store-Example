package org.example.serviceImpl;

import org.example.enums.CashierStatus;
import org.example.enums.Qualification;
import org.example.model.Cashier;
import org.example.model.Manager;
import org.example.service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
    private Manager manager;

    public ManagerServiceImpl(Manager manager){
        this.manager = manager;
    }
    @Override
    public Cashier hireCashier(Cashier cashier) {

        if((cashier.getQualification() == Qualification.FIRST_CLASS || cashier.getQualification() == Qualification.SECOND_CLASS_UPPER) && (cashier.getAge()>=20 && cashier.getAge() <= 25)){
            cashier.setStatus(CashierStatus.EMPLOYED);
            return cashier;
        }else {
            cashier.setStatus(CashierStatus.UNEMPLOYED);
            return cashier;
        }
    }
}
