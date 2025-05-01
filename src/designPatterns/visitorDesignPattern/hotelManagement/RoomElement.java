package designPatterns.visitorDesignPattern.hotelManagement;

public interface RoomElement {
    void accept(RoomVisitor visitor);
}
