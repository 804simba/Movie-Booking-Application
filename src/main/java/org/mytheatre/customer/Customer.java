package org.mytheatre.customer;

import org.mytheatre.movie.Movie;
import org.mytheatre.services.CustomerService;

import java.time.LocalDateTime;
import java.util.List;

public class Customer implements Comparable<Customer> {
    private final String name;
    private final CustomerService customerService;
    private final String timeOfArrival;
    private double creditCard;
    public Customer(String name, double creditCard, CustomerService customerService) {
        this.name = name;
        this.creditCard = creditCard;
        this.customerService = customerService;
        this.timeOfArrival = LocalDateTime.now().toString();
    }
    public String getName() {
        return name;
    }
    public void selectMovie(Movie selectedMovie, int quantity) {
        customerService.selectMovie(selectedMovie, quantity);
    }
    public double getCreditCard() {
        return creditCard;
    }
    public void setCreditCard(double creditCard) {
        this.creditCard = creditCard;
    }

    public List<Movie> getCart() {
        return customerService.getCustomerCart();
    }

    public String getTimeOfArrival() {
        return timeOfArrival;
    }
    @Override
    public int compareTo(Customer nextCustomer) {
        return this.getTimeOfArrival().compareTo(nextCustomer.getTimeOfArrival());
    }
}
