package parkingLot;

import parkingLot.constants.VehicleType;
import parkingLot.factory.ParkingSpotControllerFactory;

public class ParkingLotService {
    private ParkingSpotControllerFactory parkingSpotControllerFactory;

    public int getAvailableParkingSpotId(final Vehicle vehicle){
        return parkingSpotControllerFactory.getParkingSpotController(vehicle.getType())
                .getAvailableParkingSpotId();
    }

    public Receipt bookParkingSpot(final int parkingSpotId, final Vehicle vehicle){
        return parkingSpotControllerFactory.getParkingSpotController(vehicle.getType())
                .bookParkingSpot(parkingSpotId);
    }

    public void exitParkingLot(final Receipt receipt, final VehicleType vehicleType){
        parkingSpotControllerFactory.getParkingSpotController(vehicleType)
                .releaseParkingSpot(receipt.parkingSpotId);
    }
}
