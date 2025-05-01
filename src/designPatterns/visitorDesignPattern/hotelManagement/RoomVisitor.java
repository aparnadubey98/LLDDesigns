package designPatterns.visitorDesignPattern.hotelManagement;

public interface RoomVisitor {
    void visit(SingleRoomElement singleRoom);
    void visit(DeluxeRoomElement deluxeRoom);
}
