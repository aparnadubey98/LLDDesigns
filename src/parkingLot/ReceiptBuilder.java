package parkingLot;

public class ReceiptBuilder {
    private int receiptNumber;
    private int vehicleId;
    private int parkingSpotId;
    private int price;

    public ReceiptBuilder setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
        return this;
    }

    public ReceiptBuilder setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
        return this;
    }

    public ReceiptBuilder setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
        return this;
    }

    public ReceiptBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public Receipt build() {
        return new Receipt(receiptNumber, vehicleId, parkingSpotId, price);
    }
}