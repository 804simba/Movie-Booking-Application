package org.mytheatre.staff;

import org.mytheatre.customer.Customer;
import org.mytheatre.enums.Role;
import org.mytheatre.movie.Movie;
import org.mytheatre.services.CashierService;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Cashier extends Staff {
    CashierService cashierService;
    Queue<Customer> customerQueue;
    public Cashier(String name, Role role, CashierService cashierService) {
        super(name, role);
        this.cashierService = cashierService;
        this.customerQueue = new PriorityQueue<>();
    }
    public Cashier(String name, Role role, CashierService cashierService, Comparator<Customer> cartSizeComparator) {
        super(name, role);
        this.cashierService = cashierService;
        this.customerQueue = new PriorityQueue<>(cartSizeComparator);
    }
    public void attendToCustomer(Customer customer) {
        cashierService.attendToCustomer(customer);
    }
    public void isMovieAvailable(Movie movie) {
        cashierService.isMovieAvailable(movie);
    }
    public void updateMoviesSoldQty(Movie movie, int quantity) {
        cashierService.updateMoviesSoldQty(movie, quantity);
    }
    public void addCustomerToQueue(Customer customer) {
        customerQueue.offer(customer);
        System.out.printf("%s has joined the queue..\n", customer.getName());
    }
    public void attendToQueue() {
        Customer nextCustomer;
        while(!customerQueue.isEmpty()) {
            nextCustomer = customerQueue.poll();
            attendToCustomer(nextCustomer);
            System.out.printf("%s is attending to %s\n", this.getName(), nextCustomer.getName());
        }
        System.out.println("Queue is empty...");
    }
}
