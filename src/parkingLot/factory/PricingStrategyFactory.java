package parkingLot.factory;

import parkingLot.constants.VehicleType;
import parkingLot.strategy.FourWheelarPricingStrategy;
import parkingLot.strategy.PricingStrategy;
import parkingLot.strategy.TwoWheelarPricingStrategy;

import java.util.Map;

public class PricingStrategyFactory {
    private final Map<VehicleType, PricingStrategy> pricingStrategyMap;

    public PricingStrategyFactory() {
        this.pricingStrategyMap = Map.of(VehicleType.TwoWheeler,
                new TwoWheelarPricingStrategy(),
                VehicleType.FourWheelar,
                new FourWheelarPricingStrategy());
    }

    public PricingStrategy getPricingStrategy(final VehicleType vehicleType) {
        return pricingStrategyMap.get(vehicleType);
    }
}
