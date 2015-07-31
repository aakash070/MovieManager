package strategies;

/**
 * Created by aakash on 7/31/2015.
 */
public class RegularMovieRewardStrategy implements RewardPointsStrategy{
    @Override
    public double apply(RentalStrategies rentalStrategy, int days) {
        return rentalStrategy.apply(days);
    }
}
