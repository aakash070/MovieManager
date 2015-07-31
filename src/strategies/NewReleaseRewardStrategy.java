package strategies;

/**
 * Created by aakash on 7/31/2015.
 */
public class NewReleaseRewardStrategy implements RewardPointsStrategy{
    @Override
    public double apply(RentalStrategies rentalStrategy, int days) {
        return 2*days;
    }
}
