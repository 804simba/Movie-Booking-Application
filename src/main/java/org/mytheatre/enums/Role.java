package org.mytheatre.enums;

public enum Role {
    MANAGER, CASHIER;

    @Override
    public String toString() {
        return switch (this) {
            case CASHIER -> "Cashier";
            case MANAGER -> "Manager";
        };
    }
}
