package strategies;

/**
 * Created by aakash on 7/31/2015.
 */
public class RegularMovieStrategy implements RentalStrategies {

    @Override
    public double apply(int days) {
        return 3;
    }
}
