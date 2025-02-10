package parkingLot.parkingSpot;

import parkingLot.constants.VehicleType;

public class ParkingSpot {
    private int x_cord, y_cord;
    private VehicleType vehicleType;
    private int id;

    public ParkingSpot(int x_cord, int y_cord, VehicleType vehicleType, int id) {
        this.x_cord = x_cord;
        this.y_cord = y_cord;
        this.vehicleType = vehicleType;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getY_cord() {
        return y_cord;
    }

    public void setY_cord(int y_cord) {
        this.y_cord = y_cord;
    }

    public int getX_cord() {
        return x_cord;
    }

    public void setX_cord(int x_cord) {
        this.x_cord = x_cord;
    }
}
