package org.mytheatre.services.implementations;

import org.mytheatre.movie.Movie;
import org.mytheatre.services.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final List<Movie> customerCart;

    public CustomerServiceImpl() {
        this.customerCart = new ArrayList<>();
    }

    @Override
    public void selectMovie(Movie selectedMovie, int quantity) {
        Movie movie = new Movie(selectedMovie.getName(), selectedMovie.getYearOfRelease(), selectedMovie.getPrice(), selectedMovie.getGenre(), quantity);
        customerCart.add(movie);
    }

    @Override
    public List<Movie> getCustomerCart() {
        return customerCart;
    }
}
