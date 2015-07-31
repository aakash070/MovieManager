package strategies;

/**
 * Created by aakash on 7/31/2015.
 */
public class NewMovieStrategy implements RentalStrategies {
    @Override
    public double apply(int days) {
        double postInitialPeriodRent = 0;
        if(days>2) {
            postInitialPeriodRent = (days-2)*2;
        }
        return 3+postInitialPeriodRent;
    }
}
