package org.mytheatre.staff;

import org.mytheatre.enums.Role;

public abstract class Staff {
    private final String name;
    private static int ID = 100;
    private final String staffID;
    private double salaryAccount = 0.0;

    public Staff(String name, Role role) {
        this.name = name;
        this.staffID = generateID(role);
        ID++;
    }
    public String generateID(Role role) {
        if (role.toString().equals("Manager")) {
            return "MGR" + ID;
        } else {
            return "CSHR" + ID;
        }
    }

    public String getName() {
        return name;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setSalaryAccount(double salaryAmount) {
        this.salaryAccount += salaryAmount;
    }
}
