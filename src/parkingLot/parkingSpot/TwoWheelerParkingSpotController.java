package parkingLot.parkingSpot;

import parkingLot.Receipt;
import parkingLot.ReceiptBuilder;
import parkingLot.constants.VehicleType;
import parkingLot.factory.PricingStrategyFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoWheelerParkingSpotController implements ParkingSpotController{
    final List<ParkingSpot> parkingSpots;
    final Map<Integer, Boolean> isParkingSpotAvailable;
    private final PricingStrategyFactory pricingStrategyFactory;

    public TwoWheelerParkingSpotController(final int initialCapacity) {
        this.parkingSpots = new ArrayList<>();
        this.isParkingSpotAvailable = new HashMap<>();
        pricingStrategyFactory = new PricingStrategyFactory();

        createParkingSpots(initialCapacity);
    }

    @Override
    public int getAvailableParkingSpotId() {
        for(ParkingSpot parkingSpot: parkingSpots) {
            if(!isParkingSpotAvailable.get(parkingSpot.getId()))
                return parkingSpot.getId();
        }
        return -1;
    }

    @Override
    public void releaseParkingSpot(int parkingSpotId) {
        isParkingSpotAvailable.remove(parkingSpotId);
    }

    @Override
    public Receipt bookParkingSpot(int parkingSpotId) {
        isParkingSpotAvailable.put(parkingSpotId, false);
        return new ReceiptBuilder()
                .setParkingSpotId(parkingSpotId)
                .setReceiptNumber(1)
                .setPrice(pricingStrategyFactory.getPricingStrategy(VehicleType.FourWheelar).getPrice())
                .build();
    }

    private void createParkingSpots(final int number){
        for(int i = 0; i < number; i++){
            parkingSpots.add(new ParkingSpotBuilder()
                    .setId(i)
                    .setVehicleType(VehicleType.TwoWheeler)
                    .build());
            isParkingSpotAvailable.put(i, true);
        }
    }
}
