package parkingLot.factory;

import parkingLot.constants.VehicleType;
import parkingLot.parkingSpot.FourWheelerParkingSpotController;
import parkingLot.parkingSpot.ParkingSpotController;
import parkingLot.parkingSpot.TwoWheelerParkingSpotController;

import java.util.Map;

public class ParkingSpotControllerFactory {
    private final Map<VehicleType, ParkingSpotController> parkingSpotControllerMap;
    private final static int TWO_WHEELER_PARKING_SPOT_CAPACITY = 4;
    private final static int FOUR_WHEELER_PARKING_SPOT_CAPACITY = 4;

    public ParkingSpotControllerFactory() {
        this.parkingSpotControllerMap = Map.of(VehicleType.TwoWheeler,
                new TwoWheelerParkingSpotController(TWO_WHEELER_PARKING_SPOT_CAPACITY),
                VehicleType.FourWheelar,
                new FourWheelerParkingSpotController(FOUR_WHEELER_PARKING_SPOT_CAPACITY));
    }

    public ParkingSpotController getParkingSpotController(final VehicleType vehicleType) {
        return parkingSpotControllerMap.get(vehicleType);
    }
}
