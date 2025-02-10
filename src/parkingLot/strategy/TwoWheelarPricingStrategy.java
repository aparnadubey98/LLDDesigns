package parkingLot.strategy;

public class TwoWheelarPricingStrategy implements PricingStrategy{
    @Override
    public int getPrice() {
        return 10;
    }
}
