package org.mytheatre.staff;

import com.sun.security.jgss.GSSUtil;
import org.mytheatre.enums.Role;
import org.mytheatre.services.ManagerService;

import java.util.List;

public class Manager extends Staff{
    ManagerService managerService;
    public Manager(String name, Role role, ManagerService managerService) {
        super(name, role);
        this.managerService = managerService;
    }
    public void hireCashiers(List<Cashier> cashiers) {
        managerService.hireCashiers(cashiers);
        for (Cashier cashier : cashiers) {
            String notify = String.format("Name: %s, ID: %s --> congratulations you have been hired.", cashier.getName(), cashier.getStaffID());
            System.out.println(notify);
        }
    }
    public void fireCashier(Cashier cashier) {
        managerService.fireCashier(cashier);
    }
    public void paySalaries(double amount) {
        managerService.paySalaries(amount);
    }
}
