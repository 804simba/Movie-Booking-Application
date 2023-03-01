package org.mytheatre.services.implementations;

import org.mytheatre.Theatre;
import org.mytheatre.services.ManagerService;
import org.mytheatre.staff.Cashier;
import java.util.List;

public class ManagerServiceImpl implements ManagerService {
    private final Theatre theatre;

    public ManagerServiceImpl(Theatre theatre) {
        this.theatre = theatre;
    }
    @Override
    public void hireCashiers(List<Cashier> cashiers) {
        theatre.setCashiers(cashiers);
    }
    @Override
    public void fireCashier(Cashier cashier) {
        Cashier cashierToFire = null;
        for (Cashier currentCashier : theatre.getCashiers()) {
            if (currentCashier.getStaffID().equals(cashier.getStaffID())) {
                cashierToFire = cashier;
                break;
            }
        }
        theatre.getCashiers().remove(cashierToFire);
        System.out.printf("You have fired %s\n", cashier.getName());
    }
    @Override
    public void paySalaries(double amount) {
        for (Cashier currentCashier : theatre.getCashiers()) {
            currentCashier.setSalaryAccount(amount);
            String message = String.format("You have paid %s their salary...", currentCashier.getName());
            System.out.println(message);
        }
    }
}
