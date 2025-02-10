package parkingLot.parkingSpot;

import parkingLot.Receipt;

public interface ParkingSpotController {
    int getAvailableParkingSpotId();
    void releaseParkingSpot(final int parkingSpotId);
    Receipt bookParkingSpot(final int parkingSpotId);
}
