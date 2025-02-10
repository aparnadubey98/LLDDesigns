package parkingLot;

import parkingLot.constants.VehicleType;

public class Vehicle {
    private String id;
    private VehicleType type;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }
}
