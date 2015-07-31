package strategies;

/**
 * Created by aakash on 7/31/2015.
 */
public class ClassicMovieStrategy implements RentalStrategies {
    @Override
    public double apply(int days) {
        double weeklyCharge = 0;
        if(days>7) {
            weeklyCharge = (days/7)*3;
        }
        return ((days%7)*0.5 + weeklyCharge);
    }
}
