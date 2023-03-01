package org.mytheatre.services;

import org.mytheatre.movie.Movie;

import java.util.List;

public interface CustomerService {
    void selectMovie(Movie selectedMovie, int quantity);
    List<Movie> getCustomerCart();
}
