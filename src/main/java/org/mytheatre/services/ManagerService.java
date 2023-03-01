package org.mytheatre.services;

import org.mytheatre.customer.Customer;
import org.mytheatre.staff.Cashier;
import org.mytheatre.staff.Staff;

import java.util.List;

public interface ManagerService {
    void hireCashiers(List<Cashier> cashiers);
    void fireCashier(Cashier cashier);
    void paySalaries(double amount);
}
