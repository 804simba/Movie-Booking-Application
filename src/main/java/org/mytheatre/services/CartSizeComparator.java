package org.mytheatre.services;

import org.mytheatre.customer.Customer;

import java.util.Comparator;

public class CartSizeComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer customer1, Customer customer2) {
        return Integer.compare(customer2.getCart().size(), customer1.getCart().size());
    }
}
