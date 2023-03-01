package org.mytheatre.customer;

import org.mytheatre.movie.Movie;
import org.mytheatre.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private final CustomerService customerService;
    private double creditCard;
    public Customer(double creditCard, CustomerService customerService) {
        this.creditCard = creditCard;
        this.customerService = customerService;
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
}
