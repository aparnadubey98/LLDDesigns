package designPatterns.visitorDesignPattern.hotelManagement;

public record DeluxeRoomElement(String roomType, double price) implements RoomElement {
    @Override
    public void accept(RoomVisitor visitor) {
        visitor.visit(this);
    }
}
