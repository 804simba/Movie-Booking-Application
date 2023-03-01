package org.mytheatre.staff;

import org.mytheatre.enums.Role;
import org.mytheatre.services.CashierService;

public class Cashier extends Staff {
    CashierService cashierService;
    public Cashier(String name, Role role, CashierService cashierService) {
        super(name, role);
        this.cashierService = cashierService;
    }
}
