package org.mytheatre;

import org.mytheatre.movie.Movie;
import org.mytheatre.staff.Cashier;

import java.util.List;

public class Theatre {
    private final String name;
    private double accountBalance;
    private List<Movie> moviesCatalog;
    private List<Cashier> cashiers;

    public Theatre(String name, double accountBalance, List<Movie> moviesCatalog) {
        this.name = name;
        this.accountBalance = accountBalance;
        this.moviesCatalog = moviesCatalog;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public List<Movie> getMoviesCatalog() {
        return moviesCatalog;
    }
    public List<Cashier> getCashiers() {
        return cashiers;
    }
    public void setCashiers(List<Cashier> cashiers) {
        this.cashiers = cashiers;
    }

}
