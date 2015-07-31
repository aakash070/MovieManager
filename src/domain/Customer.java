package domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by aakash on 7/31/2015.
 */
public class Customer {

    private Map<Movie,Integer> movies = new HashMap<Movie,Integer>();
    private MovieShop movieShop;

    public Customer(MovieShop movieShop) {
        this.movieShop = movieShop;
    }

    public void rentMovie(Movie movie, int days) {
        this.movieShop.rentOutMovie(this, movie);
        movies.put(movie, days);
    }

    public double returnMovie(Movie movie) {
        double rent = movieShop.movieReturn(this,movies.get(movie));
        movies.remove(movie);
        return rent;
    }
}
