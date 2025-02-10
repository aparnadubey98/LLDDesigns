package parkingLot.parkingSpot;

import parkingLot.constants.VehicleType;

public class ParkingSpotBuilder {
    private int xCord;
    private int yCord;
    private VehicleType vehicleType;
    private int id;

    public ParkingSpotBuilder setX_cord(int xCord) {
        this.xCord = xCord;
        return this;
    }

    public ParkingSpotBuilder setY_cord(int yCord) {
        this.yCord = yCord;
        return this;
    }

    public ParkingSpotBuilder setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public ParkingSpotBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public ParkingSpot build() {
        return new ParkingSpot(xCord, yCord, vehicleType, id);
    }
}