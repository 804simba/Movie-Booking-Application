package org.mytheatre.movie;

import org.mytheatre.enums.Genre;

public class Movie {
    private final String name;
    private final String yearOfRelease;
    private double price;
    private final Genre genre;
    private int quantity;

    public Movie(String name, String yearOfRelease, double price, Genre genre, int quantity) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.price = price;
        this.genre = genre;
        this.quantity = quantity;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getYearOfRelease() {
        return yearOfRelease;
    }

    public Genre getGenre() {
        return genre;
    }
}
