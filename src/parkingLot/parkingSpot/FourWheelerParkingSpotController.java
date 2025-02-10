package parkingLot.parkingSpot;

import parkingLot.Receipt;
import parkingLot.ReceiptBuilder;
import parkingLot.constants.VehicleType;
import parkingLot.factory.PricingStrategyFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FourWheelerParkingSpotController implements ParkingSpotController{
    final List<ParkingSpot> parkingSpots;
    final Map<Integer, Boolean> isParkingSpotAvailable;
    private final PricingStrategyFactory pricingStrategyFactory;

    public FourWheelerParkingSpotController(final int initialCapacity) {
        this.parkingSpots = new ArrayList<>(initialCapacity);
        this.isParkingSpotAvailable = new HashMap<>();
        this.pricingStrategyFactory = new PricingStrategyFactory();
    }

    @Override
    public int getAvailableParkingSpotId() {
        return 0;
    }

    @Override
    public void releaseParkingSpot(int parkingSpotId) {

    }

    @Override
    public Receipt bookParkingSpot(final int parkingSpotId) {
        isParkingSpotAvailable.put(parkingSpotId, false);
        return new ReceiptBuilder()
                .setParkingSpotId(parkingSpotId)
                .setReceiptNumber(1)
                .setPrice(pricingStrategyFactory.getPricingStrategy(VehicleType.TwoWheeler).getPrice())
                .build();
    }
}
