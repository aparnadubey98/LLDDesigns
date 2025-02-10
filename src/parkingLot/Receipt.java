package parkingLot;

public class Receipt {
    int receiptNumber;
    int vehicleId;
    int parkingSpotId;
    int price;

    public Receipt(int receiptNumber, int vehicleId, int parkingSpotId, int price) {
        this.receiptNumber = receiptNumber;
        this.vehicleId = vehicleId;
        this.parkingSpotId = parkingSpotId;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReceiptNumber() {
        return receiptNumber;
    }

    public void setReceiptNumber(int receiptNumber) {
        this.receiptNumber = receiptNumber;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public int getParkingSpotId() {
        return parkingSpotId;
    }

    public void setParkingSpotId(int parkingSpotId) {
        this.parkingSpotId = parkingSpotId;
    }
}
