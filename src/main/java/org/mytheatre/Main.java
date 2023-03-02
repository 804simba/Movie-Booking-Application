package org.mytheatre;

import org.mytheatre.customer.Customer;
import org.mytheatre.enums.Genre;
import org.mytheatre.enums.Role;
import org.mytheatre.movie.Movie;
import org.mytheatre.services.CartSizeComparator;
import org.mytheatre.services.CashierService;
import org.mytheatre.services.CustomerService;
import org.mytheatre.services.ManagerService;
import org.mytheatre.services.implementations.CashierServiceImpl;
import org.mytheatre.services.implementations.CustomerServiceImpl;
import org.mytheatre.services.implementations.ManagerServiceImpl;
import org.mytheatre.staff.Cashier;
import org.mytheatre.staff.Manager;
import org.mytheatre.staff.Staff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Movies
        Movie movie1 = new Movie("SpiderMan", "2022", 200.0, Genre.ACTION, 10);
        Movie movie2 = new Movie("Diego And Paloma", "2004", 800.0, Genre.ROMANCE, 10);
        Movie movie3 = new Movie("Kissing Booth", "2019", 100.0, Genre.ROMANCE, 10);
        Movie movie4 = new Movie("Naruto", "2022", 300.0, Genre.ANIME, 10);
        Movie movie5 = new Movie("BatMan", "2020", 500.0, Genre.ACTION, 10);

        Theatre theatre = new Theatre("Wendy's MovieHouse", 200000.0, new ArrayList<>(List.of(movie1, movie2, movie3, movie4, movie5)));
        ManagerService managerService = new ManagerServiceImpl(theatre);
        Manager manager = new Manager("Vin Diesel", Role.MANAGER, managerService);

        CartSizeComparator cartSizeComparator = new CartSizeComparator();
        CashierService cashierService = new CashierServiceImpl(theatre);
        Cashier cashier1 = new Cashier("Blossom Eseobor", Role.CASHIER, cashierService);
        Cashier cashier2 = new Cashier("Jane Doe", Role.CASHIER, cashierService, cartSizeComparator);

        manager.hireCashiers(Arrays.asList(cashier1, cashier2));

        CustomerService customerService = new CustomerServiceImpl();
        Customer customer1 = new Customer("Lilian Ovrawah", 12000.0, customerService);
        customer1.selectMovie(movie1, 2);
        customer1.selectMovie(movie3, 2);
        customer1.selectMovie(movie4, 2);

        Customer customer2 = new Customer("Jet Li", 2000.0, customerService);
        customer2.selectMovie(movie1, 2);
        customer2.selectMovie(movie5, 2);

        Customer customer3 = new Customer("Solanke Decagon", 17000.0, customerService);
        customer3.selectMovie(movie2, 2);
        customer3.selectMovie(movie3, 2);

        cashier1.addCustomerToQueue(customer1);
        cashier1.addCustomerToQueue(customer2);
        cashier1.addCustomerToQueue(customer3);

        cashier2.attendToQueue();

        Customer customer4 = new Customer("Lilian Ovrawah", 12000.0, customerService);
        customer4.selectMovie(movie1, 2);
        customer4.selectMovie(movie3, 2);
        customer4.selectMovie(movie4, 2);

        Customer customer5 = new Customer("Jet Li", 2000.0, customerService);
        customer5.selectMovie(movie1, 2);
        customer5.selectMovie(movie5, 2);

        Customer customer6 = new Customer("Solanke Decagon", 17000.0, customerService);
        customer6.selectMovie(movie2, 2);
        customer6.selectMovie(movie3, 2);

        cashier1.addCustomerToQueue(customer5);
        cashier1.addCustomerToQueue(customer5);
        cashier1.addCustomerToQueue(customer6);

        cashier1.attendToQueue();
    }
}