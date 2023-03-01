package org.mytheatre.services;

import org.mytheatre.customer.Customer;
import org.mytheatre.movie.Movie;

public interface CashierService {
    void attendToCustomer(Customer customer);
    boolean isMovieAvailable(Movie movie);
    void updateMoviesSoldQty(Movie movie, int quantity);
}
