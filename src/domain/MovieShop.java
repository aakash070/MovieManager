package domain;

import strategies.RentalStrategies;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aakash on 7/31/2015.
 */
public class MovieShop {

    private Map<Movie, RentalStrategies> movieCart = new HashMap<Movie, RentalStrategies>();
    private Map<Customer,Movie> customerSelection = new HashMap<Customer,Movie>();

    public void addMovie(Movie movie, RentalStrategies strategy){
        movieCart.put(movie,strategy);
    }

    public void rentOutMovie(Customer customer, Movie movie) {
        customerSelection.put(customer, movie);
    }

    private double calculateRent(Movie movie, int days) {
        return movieCart.get(movie).apply(days);
    }

    public double movieReturn(Customer customer, int days) {
        double rent = calculateRent(customerSelection.get(customer),days);
        customerSelection.remove(customer);
        return rent;
    }

}
